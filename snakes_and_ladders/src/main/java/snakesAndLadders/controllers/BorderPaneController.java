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
    public Label winner;

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
            setPawn(purplePawn, 1, 9);
            setPawn(greenPawn, 1, 9);
            button.setVisible(true);

        } else if (blueCheckBox.isSelected() && nameBox.getText() != null){
            colour = "blue";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is green");
            purpleCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            redCheckBox.setDisable(true);
            redPawn.setVisible(false);
            greenCheckBox.setDisable(true);
            setPawn(bluePawn, 1, 9);
            setPawn(greenPawn, 1, 9);
            button.setVisible(true);
        } else if (redCheckBox.isSelected() && nameBox.getText() != null){
            colour = "red";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is green");
            blueCheckBox.setDisable(true);
            bluePawn.setVisible(false);
            purpleCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            greenCheckBox.setDisable(true);
            setPawn(redPawn, 1, 9);
            setPawn(greenPawn, 1, 9);
            button.setVisible(true);
        } else if(greenCheckBox.isSelected() && nameBox.getText() != null){
            colour = "green";
            playersList.setText(nameBox.getText() + " is " + colour);
            playersList1.setText("The Computer is red");
            blueCheckBox.setDisable(true);
            bluePawn.setVisible(false);
            redCheckBox.setDisable(true);
            purplePawn.setVisible(false);
            purpleCheckBox.setDisable(true);
            setPawn(greenPawn, 1, 9);
            setPawn(redPawn, 1, 9);
            button.setVisible(true);
        }
    }

    private void setPawn(ImageView pawn, int column, int row) {
        if (gridPane.getChildrenUnmodifiable().contains(pawn)) {
            gridPane.getChildren().remove(pawn);
        }
        gridPane.add(pawn, column, row);
    }

    public static double createRandomNumber(double min, double max) {
        return (Math.random() * ((max - min) + 1)) + min;
    }

    public Label diceRolling(){
        if(button.isPressed()) {
            result.setText(String.valueOf((int)createRandomNumber(1, 6)));
            dice.setVisible(true);
            doMove.setText("Move your pawn!");
            doMove.setVisible(true);
            go.setVisible(true);
            button.setVisible(false);
            changePositionPurple();
        }
        return result;
    }

    public Label computersDiceRolling(){

            result.setText(String.valueOf((int)createRandomNumber(1, 6)));
            doMove.setVisible(true);
            go.setVisible(false);
            button.setVisible(true);
        changePositionGreen();

        return result;
    }
    public void hide(){
        go.setVisible(false);
        button.setVisible(false);
        dice.setVisible(false);
        doMove.setText("Players 2 move");
        computersDiceRolling();
        computersMove();
    }

    public void moveThePane(){

        int move = Integer.parseInt(result.getText());

        if(GridPane.getRowIndex(purplePawn) == 0 && GridPane.getColumnIndex(purplePawn)-move<1){

        } else

        if(GridPane.getRowIndex(purplePawn)%2 == 0){ // jeśli wiersz jest parzysty
                if(GridPane.getColumnIndex(purplePawn) - move < 1){ // jeśli długość kolumny - wynik rzutu < 1

                int column = move - GridPane.getColumnIndex(purplePawn)+1;
                int row = GridPane.getRowIndex(purplePawn)-1;

                setPawn(purplePawn, column, row);

                // jeśli długość kolumny - wynik rzutu > 1
            } else {
                int column = GridPane.getColumnIndex(purplePawn) - move;
                int row = GridPane.getRowIndex(purplePawn);
                setPawn(purplePawn, column, row);
            }
        }
        // jeśli wiersz jest nieparzysty
        else{
            if(GridPane.getColumnIndex(purplePawn) + move > 10){ // jeśli dlugość kolumny + wynik rzutu > 10
                int x = 10 - GridPane.getColumnIndex(purplePawn);
                int y = move - x - 1;

                int column = 10 - y;
                int row = GridPane.getRowIndex(purplePawn)-1;

                setPawn(purplePawn, column, row);

                // jeśli długość kolumny + wynik rzutu < 10
            } else {
                int column = GridPane.getColumnIndex(purplePawn) + move;
                int row = GridPane.getRowIndex(purplePawn);
                setPawn(purplePawn, column, row);
            }
        }
    }

     public void computersMove(){

        int move = Integer.parseInt(result.getText());

         if(GridPane.getRowIndex(greenPawn) == 0 && GridPane.getColumnIndex(greenPawn)-move<1){

         } else
        if(GridPane.getRowIndex(greenPawn)%2 == 0){ // jeśli wiersz jest parzysty
             if(GridPane.getColumnIndex(greenPawn) - move < 1){ // jeśli długość kolumny - wynik rzutu < 1

                int column = move - GridPane.getColumnIndex(greenPawn)+1;
                int row = GridPane.getRowIndex(greenPawn)-1;

                setPawn(greenPawn, column, row);

                // jeśli długość kolumny - wynik rzutu > 1
            } else {
                int column = GridPane.getColumnIndex(greenPawn) - move;
                int row = GridPane.getRowIndex(greenPawn);
                setPawn(greenPawn, column, row);
            }
        }
        // jeśli wiersz jest nieparzysty (dodajemy wynik rzutu)
        else{
            if(GridPane.getColumnIndex(greenPawn) + move > 10){ // jeśli dlugość kolumny + wynik rzutu > 10
                int x = 10 - GridPane.getColumnIndex(greenPawn);
                int y = move - x - 1;

                int column = 10 - y;
                int row = GridPane.getRowIndex(greenPawn)-1;

                setPawn(greenPawn, column, row);

                // jeśli długość kolumny + wynik rzutu < 10
            } else {
                int column = GridPane.getColumnIndex(greenPawn) + move;
                int row = GridPane.getRowIndex(greenPawn);
                setPawn(greenPawn, column, row);
            }
    }
    }

    // zachowanie pól specjalnych
//21(1,7) -> 17(4,8), 30(10,7) -> 27(7,7), 94(7,0) -> 71(10,2), 98(3,0) -> 57(4,4)
//16(5,8) -> 76(5,2), 33(8,6) -> 53(8,4), 39(2,6) -> 58(3,4), 55(6,4) -> 95(6,0)

    public void changePositionPurple(){
        if(GridPane.getColumnIndex(purplePawn) == 1 && GridPane.getRowIndex(purplePawn) == 7){
            setPawn(purplePawn, 4, 8);
        } else if (GridPane.getColumnIndex(purplePawn) == 10 && GridPane.getRowIndex(purplePawn) == 7){
            setPawn(purplePawn, 7, 7);
        } else if(GridPane.getColumnIndex(purplePawn) == 7 && GridPane.getRowIndex(purplePawn) == 0) {
            setPawn(purplePawn, 10, 2);
        } else  if(GridPane.getColumnIndex(purplePawn) == 3 && GridPane.getRowIndex(purplePawn) == 0){
            setPawn(purplePawn, 4, 4);
        } else if(GridPane.getColumnIndex(purplePawn) == 5 && GridPane.getRowIndex(purplePawn) == 8){
            setPawn(purplePawn, 5, 2);
        } else if(GridPane.getColumnIndex(purplePawn) == 8 && GridPane.getRowIndex(purplePawn) == 6){
            setPawn(purplePawn, 8, 4);
        } else if(GridPane.getColumnIndex(purplePawn) == 2 && GridPane.getRowIndex(purplePawn) == 6){
            setPawn(purplePawn, 3, 4);
        } else if(GridPane.getColumnIndex(purplePawn) == 6 && GridPane.getRowIndex(purplePawn) == 4){
            setPawn(purplePawn, 6, 0);
        } else if(GridPane.getColumnIndex(purplePawn) == 1 && GridPane.getRowIndex(purplePawn) == 0){
            winner.setText("Congratulations! You won!");
            winner.setVisible(true);
            go.setVisible(false);
        }
    }

    public void changePositionGreen(){
        if(GridPane.getColumnIndex(greenPawn) == 1 && GridPane.getRowIndex(greenPawn) == 7){
            setPawn(greenPawn, 4, 8);
        } else if (GridPane.getColumnIndex(greenPawn) == 10 && GridPane.getRowIndex(greenPawn) == 7){
            setPawn(greenPawn, 7, 7);
        } else if(GridPane.getColumnIndex(greenPawn) == 7 && GridPane.getRowIndex(greenPawn) == 0){
            setPawn(greenPawn, 10, 2);
        } else if(GridPane.getColumnIndex(greenPawn) == 3 && GridPane.getRowIndex(greenPawn) == 0){
            setPawn(greenPawn, 4, 4);
        } else if(GridPane.getColumnIndex(greenPawn) == 5 && GridPane.getRowIndex(greenPawn) == 8){
            setPawn(greenPawn, 5, 2);
        } else if(GridPane.getColumnIndex(greenPawn) == 8 && GridPane.getRowIndex(greenPawn) == 6){
            setPawn(greenPawn, 8, 4);
        } else if(GridPane.getColumnIndex(greenPawn) == 2 && GridPane.getRowIndex(greenPawn) == 6){
            setPawn(greenPawn, 3, 4);
        } else if(GridPane.getColumnIndex(greenPawn) == 6 && GridPane.getRowIndex(greenPawn) == 4){
            setPawn(greenPawn, 6, 0);
        } else if(GridPane.getColumnIndex(greenPawn) == 1 && GridPane.getRowIndex(greenPawn) == 0){
            winner.setText("The Computer won");
            winner.setVisible(true);
            go.setVisible(false);
        }
    }
}
