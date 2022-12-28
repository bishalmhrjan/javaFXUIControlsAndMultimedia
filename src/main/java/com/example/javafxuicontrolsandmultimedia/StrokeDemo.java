package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.stage.Stage;

public class StrokeDemo extends Application {
    @Override
    public void start(Stage stage){
        Rectangle rectangle = new Rectangle(20,20,70,120);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(15);
        rectangle.setStroke(Color.ORANGE);

        Rectangle rectangle1 = new Rectangle(20,20,70,120);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStrokeWidth(15);
        rectangle1.setStroke(Color.ORANGE);
        rectangle1.setTranslateX(100);
        rectangle1.setStrokeLineJoin(StrokeLineJoin.BEVEL);

        Rectangle rectangle2 = new Rectangle(20,20,70,120);
        rectangle2.setFill(Color.WHITE);
        rectangle2.setStrokeWidth(15);
        rectangle2.setStroke(Color.ORANGE);
        rectangle2.setTranslateX(200);
        rectangle2.setStrokeLineJoin(StrokeLineJoin.ROUND);

        Line line = new Line(320,20,420,20);
        line.setStrokeLineCap(StrokeLineCap.BUTT);
        line.setStrokeWidth(20);

        Line line1 = new Line(320,70,420,70);
        line1.setStrokeLineCap(StrokeLineCap.ROUND);
        line1.setStrokeWidth(20);

        Line line2 = new Line(320,120,420,120);
        line2.setStrokeLineCap(StrokeLineCap.SQUARE);
        line2.setStrokeWidth(20);


        Line line3 = new Line(460,20,560,120);
        line3.getStrokeDashArray().addAll(10.0,20.0,30.0,40.0);

        Pane pane = new Pane();
        pane.getChildren().addAll(rectangle,rectangle1,rectangle2,line,line1,line2,line3);

        Scene scene = new Scene(pane,610,180);
        stage.setScene(scene);
        stage.setTitle("Strokedemo");
        stage.show();


            }
}
