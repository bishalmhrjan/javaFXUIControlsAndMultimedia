package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowDemoMenu extends Application {
    private TextField textField1 = new TextField();
    private TextField textField2 = new TextField();

    private  TextField textField3 = new TextField();

    @Override
    public  void start(Stage stage){
        MenuBar menuBar = new MenuBar();

        Menu menuOperation = new Menu("Operation");
        Menu menuExit = new Menu("Exit");

        menuBar.getMenus().addAll(menuOperation,menuExit);

        MenuItem menuItemAdd = new MenuItem("Add");
        MenuItem menuItemSubtract = new MenuItem("Subtract");
        MenuItem menuItemMultiply = new MenuItem("Multiply");
        MenuItem menuItemDivide = new MenuItem("Divide");

        menuOperation.getItems().addAll(menuItemAdd,menuItemSubtract,menuItemMultiply,menuItemDivide);
        MenuItem menuItemClose = new MenuItem("Close");
        menuExit.getItems().addAll(menuItemClose);

         menuItemAdd.setAccelerator(KeyCombination.keyCombination("ctrl+A"));
         menuItemSubtract.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
         menuItemMultiply.setAccelerator(KeyCombination.keyCombination("Ctrl+M"));
         menuItemDivide.setAccelerator(KeyCombination.keyCombination("Ctrl+D"));

        HBox hBox1 = new HBox(5);
        textField1.setPrefColumnCount(2);
        textField2.setPrefColumnCount(2);
        textField3.setPrefColumnCount(2);

        hBox1.getChildren().addAll(new Label("Number 1:"),textField1, new Label("Number 2:"), textField2, new Label("Result: ",textField3));
        hBox1.setAlignment(Pos.CENTER);

        HBox hbox2= new HBox(5);
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");

        hbox2.getChildren().addAll(btAdd,btDivide,btMultiply,btSubtract);
        hbox2.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(menuBar,hBox1,hbox2);

        Scene scene = new Scene(vBox,300,250);
        stage.setTitle("MenuDemo");
        stage.setScene(scene);
        stage.show();



        menuItemAdd.setOnAction(e->perform('+'));
        menuItemSubtract.setOnAction(e->perform('-'));
        menuItemDivide.setOnAction(e->perform('/'));
        menuItemMultiply.setOnAction(e->perform('*'));

        btAdd.setOnAction(e->perform('+'));
        btMultiply.setOnAction(e->perform('*'));
        btDivide.setOnAction(e->perform('/'));
        btSubtract.setOnAction(e->perform('-'));





            }

            private  void  perform(char operator){
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            double result = 0;
            switch (operator){
                case '+': result = number1 + number2; break;
                case '-': result= number1-number2;break;
                case '*': result= number1*number2;break;
                case '/':result= number1/number2;break;
            }
            textField3.setText(result+" ");
            }
}
