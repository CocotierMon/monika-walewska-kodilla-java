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

    public void diceRolling(){
        if(button.isPressed()) {
                result.setText(String.valueOf((int)createRandomNumber(1, 6)));
                dice.setVisible(true);
                doMove.setVisible(true);
        }
    }

    public void moveThePane(){

    }
}
