package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class RotationsDemo extends Application {
    @Override
    public  void start(Stage stage){
        Pane pane = new Pane();
        Random random = new Random();
        double radius = 90;
        double width = 20;
        double height = 40;

        for( int i =0;i<12;i++){
            double x = 150 + radius * Math.cos(i * 2 * Math.PI /12);
            double y = 150 + radius * Math.sin(i*2*Math.PI /12);

            Rectangle rectangle = new Rectangle(x-width/2,y-height/2,width,height);
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
            rectangle.setRotate(i * 360/12);
            pane.getChildren().add(rectangle);
        }

        Scene scene = new Scene(pane,300,300);
        stage.setScene(scene);
        stage.setTitle("RotateDemo");
        stage.show();
    }
}
