package main;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Components.*;
import geometry.*;
import geometry.Point;

public class snakeCanvas extends JPanel implements ActionListener, SnakeConst {

    private Timer clock = new Timer(100, this);

    private ArrayList<component> components = new ArrayList<>();

    private snakeComp snake1;
    private boardComp board;

    snakeCanvas(){
        this.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.board = new boardComp();
        this.components.add(this.board);
        this.snake1 = new snakeComp(new Point(10, 4), direction.UP, this.board);
        this.components.add(this.snake1);
        this.setFocusable(true);
        this.requestFocusInWindow();

        this.getInputMap().put(KeyStroke.getKeyStroke("W"), "lookUp");
        this.getInputMap().put(KeyStroke.getKeyStroke("S"), "lookDown");
        this.getInputMap().put(KeyStroke.getKeyStroke("D"), "lookRight");
        this.getInputMap().put(KeyStroke.getKeyStroke("A"), "lookLeft");

        this.getActionMap().put("lookUp", this.lookUp);
        this.getActionMap().put("lookDown", this.lookDown);
        this.getActionMap().put("lookRight", this.lookRight);
        this.getActionMap().put("lookLeft", this.lookLeft);
    }

    Action lookUp = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            snake1.lookUp();
        }
    };

    Action lookDown = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            snake1.lookDown();
        }
    };

    Action lookRight = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            snake1.lookRight();
        }
    };

    Action lookLeft = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            snake1.lookLeft();
        }
    };

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
}
