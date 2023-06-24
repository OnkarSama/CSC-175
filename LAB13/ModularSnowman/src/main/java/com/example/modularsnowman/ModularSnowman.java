package com.example.modularsnowman;//****************************************************************************************
//  ModularSnowman.java       Author: Lewis/Loftus Revised by Chays
//
//  Demonstrates the use of a method to return a picture represented by a Group of shapes.
//****************************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class ModularSnowman extends Application
{
    //--------------------------------------------------------------------
    //  Presents a snowman scene.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        // Call a method to generate and return a Group of shapes representing a snowman.
        Group snowman = generateSnowman(0, 0); // The generateSnowman method is defined below.
        Group snowman2 = generateSnowman(200, 0);

        Circle sun = new Circle(50, 50, 30);
        sun.setFill(Color.GOLD);

        Rectangle ground = new Rectangle(0, 250, 700, 100);
        ground.setFill(Color.STEELBLUE);

        Group root = new Group(ground, sun, snowman, snowman2);
        Scene scene = new Scene(root, 700, 350, Color.LIGHTBLUE);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method name: generateSnowman
    // Parameter: dx = change in x value
    // Parameter: dy = change in y value.
    // Return a Group object representing a snowman.
    public Group generateSnowman(int dx, int dy)
    {
        Ellipse base = new Ellipse(80 + dx, 210 + dy, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse  dxdle = new Ellipse(80 + dx, 130 + dy, 50, 40);
        dxdle.setFill(Color.WHITE);

        Circle head = new Circle(80 + dx, 70 + dy, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(70 + dx, 60 + dy, 5);
        Circle leftEye = new Circle(90 + dx, 60 + dy, 5);
        Line mouth = new Line(70 + dx, 80+ dy, 90 + dx, 80 + dy);

        Circle  dyButton = new Circle(80 + dx, 120 + dy, 6);
        dyButton.setFill(Color.RED);
        Circle bottomButton = new Circle(80 + dx, 140 + dy, 6);
        bottomButton.setFill(Color.RED);

        Line leftArm = new Line(110 + dx, 130 + dy, 160 + dx, 130 + dy);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(50 + dx, 130 + dy, 0 + dx, 100 + dy);
        rightArm.setStrokeWidth(3);

        Rectangle stovepipe = new Rectangle(60 + dx, 0 + dy, 40, 50);
        Rectangle brim = new Rectangle(50 + dx, 45 + dy, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base,  dxdle, head, leftEye, rightEye,
                mouth,  dyButton, bottomButton, leftArm, rightArm, hat);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        return snowman;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}