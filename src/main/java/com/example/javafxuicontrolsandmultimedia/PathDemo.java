package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class PathDemo extends Application {
    @Override
    public  void start(Stage stage){

        Pane pane = new Pane();

        Path path = new Path();
        path.getElements().add(new MoveTo(50.0,50.0));
        path.getElements().add(new HLineTo(150.0));
        path.getElements().add(new VLineTo(100.5));
        path.getElements().add(new LineTo(200.5,150.5));

        ArcTo arcTo = new ArcTo(45,45,250,100.5,30, false, true);
        path.getElements().add(arcTo);

        path.getElements().add(new QuadCurveTo(50,50,350,100));
        path.getElements().add(new CubicCurveTo(250,100,350,250,450,10));
        path.getElements().add(new ClosePath());

        pane.getChildren().add(path);

        path.setFill(null);

        Scene scene = new Scene(pane,300,250);
        stage.setTitle("PathDemo");
        stage.setScene(scene);
        stage.show();


    }
}
