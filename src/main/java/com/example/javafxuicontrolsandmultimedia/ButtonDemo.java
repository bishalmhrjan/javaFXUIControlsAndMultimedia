package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
    protected Text text = new Text();
    @Override
    public void  start(Stage stage){
        Scene scen = new Scene(getPane(),450,200);
        stage.setTitle("ButtonDemo");
        stage.setScene(scen);
        stage.show();

    }

    protected BorderPane getPane(){
        HBox paneForBottons = new HBox(20);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        paneForBottons.getChildren().addAll(btLeft,btRight);
        paneForBottons.setAlignment(Pos.CENTER);
        paneForBottons.setStyle("-fx-border-color:green");

        BorderPane pane = new BorderPane();

        pane.setBottom(paneForBottons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e->text.setX(text.getX()-10));
        btRight.setOnAction(e->text.setX(text.getX()-10));

        return  pane;
    }
}
