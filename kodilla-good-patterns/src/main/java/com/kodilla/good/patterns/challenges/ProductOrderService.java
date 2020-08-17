package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private ProductOrder productOrder;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final ProductOrder productOrder,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrder = productOrder;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrder.order(orderRequest.getUser(), orderRequest.getProduct());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(),orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

    public static void main(String[] args) {
        User user = new User("Anna","Kowalska", "akowal@o2.pl");
        Product product = new Product("widelec", 101);

        OrderRequest orderRequest = new OrderRequest(user, product);
        ProductOrderService productOrderService = new ProductOrderService(new EmailService(), new ProductsOrder(), new OrdersRepository());

        productOrderService.process(orderRequest);
    }
}
