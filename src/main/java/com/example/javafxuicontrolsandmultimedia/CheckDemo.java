package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CheckDemo extends ButtonDemo {


    @Override
    protected BorderPane getPane() {
        BorderPane borderPane = super.getPane();


        Font fontBoldI = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);
        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color:green");
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox checkItalic = new CheckBox("Italic");
        paneForCheckBoxes.getChildren().addAll(chkBold, checkItalic);

        EventHandler<ActionEvent> handler = e -> {
            if (chkBold.isSelected() && checkItalic.isSelected()) {
                text.setFont(fontBoldI);
            } else if (chkBold.isSelected()) {
                text.setFont(fontBoldI);
            } else if (checkItalic.isSelected()) {
                text.setFont(fontItalic);
            } else {
                text.setFont(fontNormal);
            }
        };

        chkBold.setOnAction(handler);
        checkItalic.setOnAction(handler);
        return borderPane;

    }


}
