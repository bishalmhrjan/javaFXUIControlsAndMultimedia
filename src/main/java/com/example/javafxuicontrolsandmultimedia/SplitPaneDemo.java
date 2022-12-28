package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplitPaneDemo extends Application {
    private Image usImage = new Image("");
    private Image ukImage = new Image("");
    private Image caImage = new Image("");

    private String usDescription = "Description for US...";
    private String ukDescription = "Description for UK...";
    private String caDescription = "Description for CA...";


    @Override
    public void start(Stage stage) {
        VBox vBox = new VBox(10);
        RadioButton rbUS = new RadioButton("US");
        RadioButton rbUK = new RadioButton("UK");
        RadioButton rbCA = new RadioButton("CA");
        vBox.getChildren().addAll(rbUS, rbUK, rbCA);
        SplitPane content = new SplitPane();
        content.setOrientation(Orientation.VERTICAL);
        ImageView imageView = new ImageView(usImage);
        StackPane imagePane = new StackPane();
        imagePane.getChildren().add(imageView);

        TextArea taDescription = new TextArea();
        taDescription.setText(usDescription);
        content.getItems().addAll(imagePane,new ScrollPane(taDescription));

        SplitPane sp = new SplitPane();
        sp.getItems().addAll(vBox,content);

        Scene scene = new Scene(sp,300,250);
        stage.setTitle("Splitpanedemo");
        stage.setScene(scene);
        stage.show();


        ToggleGroup group = new ToggleGroup();
        rbUS.setToggleGroup(group);
        rbUK.setToggleGroup(group);
        rbCA.setToggleGroup(group);

        rbUS.setSelected(true);
        rbUS.setOnAction(e->{
            imageView.setImage(usImage);
            taDescription.setText(usDescription);
        });


        rbUK.setOnAction(e->{

            imageView.setImage(ukImage);
            taDescription.setText(ukDescription);
        });

        rbCA.setOnAction(e->{
            imageView.setImage(caImage);
            taDescription.setText(caDescription);
        });

    }
}
