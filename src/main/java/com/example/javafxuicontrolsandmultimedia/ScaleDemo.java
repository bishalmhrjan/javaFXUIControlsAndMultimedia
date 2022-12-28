package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScaleDemo extends Application {
    @Override
    public void start(Stage stage){
        Polyline polyline = new Polyline();
        for(double angle =-350;angle<=360;angle++){
            polyline.getPoints().addAll(angle,Math.sin(Math.toRadians(angle)));

        }
        polyline.setTranslateX(200);
        polyline.setTranslateY(100);
        polyline.setScaleX(0.5);
        polyline.setTranslateY(50);
        polyline.setStrokeWidth(1.0/25);

        Line line1 = new Line(10,100,420,100);
        Line line2 = new Line(420,100,400,90);
        Line line3 = new Line(420,100,400,110);


        Line line4 = new Line(200,10,200,200);
        Line line5 = new Line(200,10,190,30);
        Line line6 = new Line(200,10,210,30);

        Text text1 = new Text(380,70,"X");
        Text text2 = new Text(220,20,"Y");

        Pane pane = new Pane();
        pane.getChildren().addAll(polyline,line1,line2,line3,line4,line5,line6,text1,text2);
        Scene scene = new Scene(pane,450,200);
        stage.setTitle("Scaledemo");
        stage.setScene(scene);
        stage.show();
    }
}
