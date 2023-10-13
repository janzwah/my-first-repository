package com.example.myfirstfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloWorld extends Application {
    public void start(Stage primaryStage) {
        Label l1 = new Label("Hallo");
        l1.setStyle("-fx-font-size: 140px; -fx-text-fill: red; -fx-alignment: center; -fx-effect: dropshadow( gaussian , rgba(255,255,255,0.5) , 0,0,0,1 );");
        Label l2 = new Label("Welt");
        l2.setStyle("-fx-font-size: 140px; -fx-text-fill: blue;");
        VBox root = new VBox();
        root.getChildren().add(l1);
        root.getChildren().add(l2);
        root.getChildren().add(createButton());
        root.getChildren().add(createButton());
        Scene scene = new Scene(root, 1240, 1140);
        scene.getFill();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    Pane createButton() {
        final Button btn = new Button();
        btn.setStyle("-fx-background-color: yellow;");
        btn.setPrefSize(200, 50);
        btn.setText("Add 'Hello World' Label");
        final FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(7, 7, 7, 7));
        pane.getChildren().add(btn);
        pane.setStyle("-fx-text-fill: blue;");
            // ActionHandler registrieren
        btn.setOnAction(event -> {
                    Label label = new Label("Hello World!");
                    label.setStyle("-fx-text-fill: red;");
                    pane.getChildren().add(label);


                }
        );
        return pane;
    }
}

