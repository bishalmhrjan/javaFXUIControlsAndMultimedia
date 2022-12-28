package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StyleSheetDemo extends Application {
    @Override
    public  void start(Stage stage){
        HBox hBox = new HBox(5);
        Scene scene  = new Scene(hBox,300,300);
        scene.getStylesheets().add("mystyle.css");

        Pane pane1 = new Pane();
        Circle circle = new Circle(50,50,30);
        Circle circle1 = new Circle(150,50,30);
        Circle circle2 = new Circle(100,100,30);

        pane1.getChildren().addAll(circle,circle1,circle2);
        pane1.getStylesheets().add("border");

        circle.getStyleClass().add("plaincircle");
        circle1.getStyleClass().add("plaincircle");
        circle2.setId("redcircle");

        Pane pane = new Pane();
        Circle circle3 = new Circle(100,100,30);
        circle3.getStyleClass().addAll("circleborder", "plaincircle");
        circle3.setId("greencircle");
        pane.getChildren().add(circle3);
        pane.getStyleClass().add("border");

        hBox.getChildren().addAll(pane,pane1);
        stage.setTitle("stylesheetdemo");
        stage.setScene(scene);
        stage.show();

    }
}
