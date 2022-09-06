package com.javafx.project.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class EvenlySpacedCircles extends Application {
    @Override
    public void start(Stage stage) {
        List<Circle> circles = new ArrayList();
        int x = 250;
        int scenex = 500;
        for (int i=0;i<4;i++){
            Circle circle = new Circle();
            circle.setCenterX(x);
            circle.setCenterY(135);
            circle.setRadius(100);
            circles.add(circle);
            x+=250;
            scenex+=250;
        }



        Pane pane = new Pane();
        pane.getChildren().addAll(circles);

        Scene scene = new Scene(pane, scenex, 300);

        stage.setTitle("Evenly spaced circles");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
