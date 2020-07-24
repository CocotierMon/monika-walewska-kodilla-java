package snakesAndLadders.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class BorderPaneController {

    public static String colour;
    @FXML
    public CheckBox purpleCheckBox;
    public CheckBox blueCheckBox;
    public CheckBox redCheckBox;
    public CheckBox greenCheckBox;
    public TextField nameBox;
    public TextField playersList;
    public TextField playersList1;
    public ImageView purplePawn;
    public ImageView bluePawn;
    public ImageView redPawn;
    public ImageView greenPawn;
    public GridPane gridPane;
    public Button button;
    public ImageView dice;
    public Label result;
    public Label doMove;
    public Button go;

    @FXML
    void initialize(){}

    public void setActionEvent(){
        if(purpleCheckBox.isSelected() && nameBox.getText() != null){
            colour = "purple";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is green");
            blueCheckBox.setDisable(true);
            bluePawn.setVisible(false);
            redCheckBox.setDisable(true);
            redPawn.setVisible(false);
            greenCheckBox.setDisable(true);
            gridPane.add(purplePawn, 1, 9);
            gridPane.add(greenPawn, 1, 9);

        } else if (blueCheckBox.isSelected() && nameBox.getText() != null){
            colour = "blue";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is green");
            purpleCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            redCheckBox.setDisable(true);
            redPawn.setVisible(false);
            greenCheckBox.setDisable(true);
            gridPane.add(bluePawn, 1, 9);
            gridPane.add(greenPawn, 1, 9);
        } else if (redCheckBox.isSelected() && nameBox.getText() != null){
            colour = "red";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is green");
            blueCheckBox.setDisable(true);
            bluePawn.setVisible(false);
            purpleCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            greenCheckBox.setDisable(true);
            gridPane.add(redPawn, 1, 9);
            gridPane.add(greenPawn, 1, 9);
        } else if(greenCheckBox.isSelected() && nameBox.getText() != null){
            colour = "green";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is red");
            blueCheckBox.setDisable(true);
            bluePawn.setVisible(false);
            redCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            purpleCheckBox.setDisable(true);
            gridPane.add(greenPawn, 1, 9);
            gridPane.add(redPawn, 1, 9);
        }
    }

    public static double createRandomNumber(double min, double max) {
        return (Math.random() * ((max - min) + 1)) + min;
    }

    public Label diceRolling(){
        if(button.isPressed()) {
                result.setText(String.valueOf((int)createRandomNumber(1, 6)));
                dice.setVisible(true);
                doMove.setVisible(true);
        }
        return result;
    }

    public void moveThePane(){

        int move = Integer.parseInt(result.getText());

        if(GridPane.getRowIndex(purplePawn)%2 == 0){ // jeśli wiersz jest parzysty (odejmujemy wynik rzutu)
            if(GridPane.getColumnIndex(purplePawn) - move < 1){ // jeśli długość kolumny - wynik rzutu < 1
                // - tutaj mam problem z obliczeniem docelowej kolumny, pozostałe warunki raczej działają raczej dobrze

                int x = move - GridPane.getColumnIndex(purplePawn);
                int column = 10-x-GridPane.getColumnIndex(purplePawn)+1;
                int row = GridPane.getRowIndex(purplePawn)-1;

                gridPane.add(purplePawn, column, row);

                // jeśli długość kolumny - wynik rzutu > 1
            } else {
                int column = GridPane.getColumnIndex(purplePawn) - move;
                int row = GridPane.getRowIndex(purplePawn);
                gridPane.add(purplePawn, column, row);
            }
        }
        // jeśli wiersz jest nieparzysty (dodajemy wynik rzutu)
        else{
            if(GridPane.getColumnIndex(purplePawn) + move > 10){ // jeśli dlugość kolumny + wynik rzutu > 10
                int x = 10 - GridPane.getColumnIndex(purplePawn);
                int y = move - x - 1;

                int column = 10 - y;
                int row = GridPane.getRowIndex(purplePawn)-1;

                gridPane.add(purplePawn, column, row);

                // jeśli długość kolumny + wynik rzutu < 10
            } else {
                int column = GridPane.getColumnIndex(purplePawn) + move;
                int row = GridPane.getRowIndex(purplePawn);
                gridPane.add(purplePawn, column, row);
            }
        }
    }
}
