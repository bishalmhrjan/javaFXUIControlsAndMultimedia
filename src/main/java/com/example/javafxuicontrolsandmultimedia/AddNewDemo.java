package com.example.javafxuicontrolsandmultimedia;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AddNewDemo extends Application {
    @Override
    public void start(Stage stage) {
        TableView<Country> tableView = new TableView<>();
        ObservableList<Country> data = FXCollections.observableArrayList(
                new  Country("USA", "Washington DC", 280, true),
                new  Country("Canada", "Ottawa", 32, true),
                new  Country("United Kingdom", "London", 60, true),
                new  Country("Germany", "Berlin", 83, true),
                new  Country("France", "Paris", 60, true));


        tableView.setItems(data);
        TableColumn countryColumn = new TableColumn<>("Country");
        countryColumn.setMinWidth(100);
        countryColumn.setCellValueFactory(new PropertyValueFactory<Country,String>("country"));


        TableColumn capitalColumn = new TableColumn("Capital");
        capitalColumn.setMinWidth(100);
        capitalColumn.setCellValueFactory(new PropertyValueFactory<Country,String>("capital"));

        TableColumn populationColumn = new TableColumn("Population (million");
        populationColumn.setMinWidth(100);
        populationColumn.setCellValueFactory(new PropertyValueFactory<Country,Double>("population"));

        TableColumn democraticColumn = new TableColumn("Is Democratic?");
        democraticColumn.setMinWidth(100);
        democraticColumn.setCellValueFactory(new PropertyValueFactory<Country,Boolean>("democratic"));


        tableView.getColumns().addAll(countryColumn,capitalColumn,populationColumn,democraticColumn);

        FlowPane flowPane = new FlowPane(3,3);
        TextField tfCountry = new TextField();
        TextField tfCapital = new TextField();
        TextField tfPopulation = new TextField();

        CheckBox chkDemocratic = new CheckBox("Is democratic");

        Button btAddRow = new Button("Add new Row");
        tfCountry.setPrefColumnCount(5);
        tfCapital.setPrefColumnCount(5);
        tfPopulation.setPrefColumnCount(5);

        flowPane.getChildren().addAll(new Label("Country: "),tfCountry, new Label("Capital"),tfCapital,
                new Label("Population"),tfPopulation,chkDemocratic,btAddRow);
        btAddRow.setOnAction(e->{
            data.add(new Country(tfCountry.getText(),tfCapital.getText(),Double.parseDouble(tfPopulation.getText()),chkDemocratic.isSelected()));
            tfCountry.clear();
            tfCapital.clear();
            tfPopulation.clear();
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(tableView);
        pane.setBottom(flowPane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("AddNewDemo");
        stage.show();

    }




    public static     class Country {
        private final SimpleStringProperty country;
        private  final SimpleStringProperty capital;
        private  final SimpleDoubleProperty population;
        private  final SimpleBooleanProperty democratic;


        public Country(String country, String capital, double population, boolean democratic) {
            this.country = new SimpleStringProperty(country);
            this.capital = new SimpleStringProperty(capital);
            this.population = new SimpleDoubleProperty(population);
            this.democratic = new SimpleBooleanProperty(democratic);
        }

        public String getCountry() {
            return country.get();
        }

        public SimpleStringProperty countryProperty() {
            return country;
        }

        public void setCountry(String country) {
            this.country.set(country);
        }

        public String getCapital() {
            return capital.get();
        }

        public SimpleStringProperty capitalProperty() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital.set(capital);
        }

        public double getPopulation() {
            return population.get();
        }

        public SimpleDoubleProperty populationProperty() {
            return population;
        }

        public void setPopulation(double population) {
            this.population.set(population);
        }

        public boolean isDemocratic() {
            return democratic.get();
        }

        public SimpleBooleanProperty democraticProperty() {
            return democratic;
        }

        public void setDemocratic(boolean democratic) {
            this.democratic.set(democratic);
        }
    }
}
