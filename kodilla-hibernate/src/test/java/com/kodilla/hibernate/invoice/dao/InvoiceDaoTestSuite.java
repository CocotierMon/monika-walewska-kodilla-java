package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Produkt 1");
        Item item1 = new Item(new BigDecimal(20), 2, new BigDecimal(40));
        Item item2 = new Item(new BigDecimal(30), 2, new BigDecimal(60));
        Invoice invoice1 = new Invoice("2020.09.16/1");
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        //When
        productDao.save(product1);
        invoiceDao.save(invoice1);
        itemDao.save(item1);
        int invoice1Id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);
    }
}
