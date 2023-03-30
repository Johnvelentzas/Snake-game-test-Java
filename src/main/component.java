package main;

import java.awt.Graphics;

import geometry.Point;
import main.component;

public interface component extends SnakeConst {
    public void update();

    public void draw(Graphics g);

    public static int getPrintX(Point point){
        return point.x() * TILE_SIZE;
    }

    public static int getPrintY(Point point){
        return (SCREEN_ROW - point.y()) * TILE_SIZE;
    }
}
