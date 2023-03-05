package main;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Components.*;
import geometry.*;
import geometry.Point;

public class snakeCanvas extends JPanel implements ActionListener, KeyListener, SnakeConst {

    private Timer clock = new Timer(100, this);

    private ArrayList<component> components = new ArrayList<>();

    private KeyListener controllComp;

    private snakeComp snake1;

    snakeCanvas(){
        this.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.components.add(new boardComp());
        this.snake1 = new snakeComp(new Point(10, 4), direction.UP);
        this.components.add(this.snake1);
        this.controllComp = this.snake1;
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    public void start(){
        clock.start();
    }

    public void update(){
        for (component component : components) {
            component.update();
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);

        for (component component : components) {
            component.draw(g);
        }
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        this.controllComp.keyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.controllComp.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.controllComp.keyReleased(e);
    }
}
