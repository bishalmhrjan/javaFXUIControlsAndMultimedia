package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class TranslationDemo extends Application {
    @Override
    public  void start(Stage stage){
        Pane pane = new Pane();

        double x = 10;
        double y = 10;

        Random random = new Random();
        for(int i =0;i<10;i++){
            Rectangle rectangle = new Rectangle(10,10,50,60);
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.color(random.nextDouble(),random.nextDouble(), random.nextDouble()));
            rectangle.setTranslateX(x+=20);
            rectangle.setTranslateY(y+=5);
            pane.getChildren().add(rectangle);
        }

        Scene scene = new Scene(pane,250,300);
        stage.setTitle("TransitionDemo");
        stage.setScene(scene);
        stage.show();

    }
}
