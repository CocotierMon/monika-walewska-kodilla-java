package snakesAndLadders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SnakesAndLadders extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/plansza.fxml"));

        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane, 1100, 900);
        borderPane.getChildren().addAll();


        primaryStage.setTitle("Snakes and ladders");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
