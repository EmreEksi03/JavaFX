package com.javafx.project.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Bullseye extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        primaryStage.setTitle("Circle Example");
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setFill(Color.RED);
        Circle circle2 = new Circle();
        circle2.setCenterX(200);
        circle2.setCenterY(200);
        circle2.setRadius(80);
        circle2.setFill(Color.GRAY);
        Circle circle3 = new Circle();
        circle3.setCenterX(200);
        circle3.setCenterY(200);
        circle3.setRadius(60);
        circle3.setFill(Color.RED);
        Circle circle4 = new Circle();
        circle4.setCenterX(200);
        circle4.setCenterY(200);
        circle4.setRadius(40);
        circle4.setFill(Color.GRAY);
        Circle circle5 = new Circle();
        circle5.setCenterX(200);
        circle5.setCenterY(200);
        circle5.setRadius(20);
        circle5.setFill(Color.RED);
        pane.getChildren().addAll(circle,circle2,circle3,circle4,circle5);
        Scene scene = new Scene(pane,400,500,Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}