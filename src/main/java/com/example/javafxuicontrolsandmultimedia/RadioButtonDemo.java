package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends  CheckDemo {
    @Override
    protected BorderPane getPane(){
        BorderPane borderPane = new BorderPane();
        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5,5,5,5));
        paneForRadioButtons.setStyle("-fx-border-with:2px;-fx-border-color:green");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRadioButtons.getChildren().addAll(rbRed,rbGreen,rbBlue);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);


        rbRed.setOnAction(e->{
            if(rbRed.isSelected()){
                text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(e->{
            if (rbGreen.isSelected()) {

                text.setFill(Color.GREEN);
            }
        });

        rbBlue.setOnAction(e->{
            if(rbBlue.isSelected()){
                text.setFill(Color.BLUE);
            }
        });


        return borderPane;
    }
    public static void main(String [] args){
        launch(args);
    }
}
