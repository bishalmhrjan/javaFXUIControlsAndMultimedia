package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ContextMenusDemo extends Application {
    @Override
    public void start(Stage stage){
        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem = new MenuItem("New");

        MenuItem menuItemOpen = new MenuItem("Open");
        MenuItem menuItemPrint = new MenuItem("Print");
        MenuItem menuItemExit = new MenuItem("Exit");

        Pane pane = new Pane();
        contextMenu.getItems().addAll(menuItem,menuItemOpen,menuItemPrint,menuItemExit);
        Scene scene = new Scene(pane,300,250);
        stage.setScene(scene);
        stage.setTitle("ContextMenu");
        stage.show();

        pane.setOnMousePressed(e->contextMenu.show(pane,e.getSceneX(),e.getSceneY()));

        menuItem.setOnAction(e-> System.out.println("New"));
        menuItemOpen.setOnAction(e->System.out.println("Open"));
        menuItemPrint.setOnAction(e->System.out.println("Print"));
        menuItemExit.setOnAction(e->System.exit(0));


    }
}
