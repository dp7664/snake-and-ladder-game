package com.example.snakeladdergame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    public Tile (int tileSize){
        setWidth(tileSize);
        setHeight(tileSize);
        setFill(Color.LIGHTGREEN);
        setStroke(Color.BLACK);
    }
}
