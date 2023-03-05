package Components;

import java.awt.event.*;
import java.util.ArrayList;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import geometry.Point;
import geometry.direction;
import main.SnakeConst;
import main.component;

public class snakeComp extends JFrame implements component, SnakeConst, KeyListener {

    private Image headUp = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_UP_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image headDown = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_DOWN_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image headRight = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_RIGHT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image headLeft = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_LEFT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    private Image bodyHor = new ImageIcon(MEDIA_PATH + SNAKE_BODY_HORIZONTAL_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image bodyVer = new ImageIcon(MEDIA_PATH + SNAKE_BODY_VERTICAL_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    private Image bodyUpRight = new ImageIcon(MEDIA_PATH + SNAKE_BODY_UP_RIGHT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image bodyRightDown = new ImageIcon(MEDIA_PATH + SNAKE_BODY_RIGHT_DOWN_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image bodyDownLeft = new ImageIcon(MEDIA_PATH + SNAKE_BODY_DOWN_LEFT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image bodyLeftUp = new ImageIcon(MEDIA_PATH + SNAKE_BODY_LEFT_UP_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    private Image tailUp = new ImageIcon(MEDIA_PATH + SNAKE_TAIL_UP_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image tailDown = new ImageIcon(MEDIA_PATH + SNAKE_TAIL_DOWN_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image tailRight = new ImageIcon(MEDIA_PATH + SNAKE_TAIL_RIGHT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    private Image tailLeft = new ImageIcon(MEDIA_PATH + SNAKE_TAIL_LEFT_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    int size = 3;
    ArrayList<Point> body = new ArrayList<>();
    direction headDir = direction.UP;

    int delay = 0;

    private int getPrintX(Point point){
        return point.x() * TILE_SIZE;
    }

    private int getPrintY(Point point){
        return (SCREEN_ROW - point.y()) * TILE_SIZE;
    }

    public snakeComp(Point head, direction dir){
        this.body.add(head);
        this.headDir = dir;
        for (int i = 0; i < this.size - 1; i++) {
            switch (dir) {
                case UP:
                    head = head.Down();
                    break;
                case DOWN:
                    head = head.Up();
                    break;
                case RIGHT:
                    head = head.Left();
                    break;
                case LEFT:
                    head = head.Right();
                    break;
            }
            this.body.add(head);
        }
    }

    @Override
    public void update() {
        this.delay++;
        if (this.delay > MOVE_DELAY) {
            this.delay = 0;
            
        }
    }

    @Override
    public void draw(Graphics g) {
        Image snakeImage = this.headUp;
        if (this.headDir == direction.UP) {
            snakeImage = this.headUp;
        }
        if (this.headDir == direction.DOWN) {
            snakeImage = this.headDown;
        }
        if (this.headDir == direction.RIGHT) {
            snakeImage = this.headRight;
        }
        if (this.headDir == direction.LEFT) {
            snakeImage = this.headLeft;
        }
        g.drawImage(snakeImage, getPrintX(this.body.get(0)), getPrintY(this.body.get(0)), this);
        for (int i = 1; i < this.body.size() - 1; i++) {
            Point prev = this.body.get(i - 1);
            Point curr = this.body.get(i);
            Point next = this.body.get(i + 1);

            if ((prev.equals(curr.Up()) && next.equals(curr.Down())) || (prev.equals(curr.Down()) && next.equals(curr.Up()))) {
                snakeImage = this.bodyVer;
            }
            if ((prev.equals(curr.Left()) && next.equals(curr.Right())) || (prev.equals(curr.Right()) && next.equals(curr.Left()))) {
                snakeImage = this.bodyHor;
            }
            if ((prev.equals(curr.Up()) && next.equals(curr.Right())) || (prev.equals(curr.Right()) && next.equals(curr.Up()))) {
                snakeImage = this.bodyUpRight;
            }
            if ((prev.equals(curr.Down()) && next.equals(curr.Right())) || (prev.equals(curr.Right()) && next.equals(curr.Down()))) {
                snakeImage = this.bodyRightDown;
            }
            if ((prev.equals(curr.Left()) && next.equals(curr.Down())) || (prev.equals(curr.Down()) && next.equals(curr.Left()))) {
                snakeImage = this.bodyDownLeft;
            }
            if ((prev.equals(curr.Left()) && next.equals(curr.Up())) || (prev.equals(curr.Up()) && next.equals(curr.Left()))) {
                snakeImage = this.bodyLeftUp;
            }
            g.drawImage(snakeImage, getPrintX(this.body.get(i)), getPrintY(this.body.get(i)), this);
        }
        Point prev = this.body.get(this.body.size() - 2);
        Point last = this.body.get(this.body.size() - 1);

        if (prev.equals(last.Up())) {
            snakeImage = this.tailUp;
        }
        if (prev.equals(last.Down())) {
            snakeImage = this.tailDown;
        }
        if (prev.equals(last.Right())) {
            snakeImage = this.tailRight;
        }
        if (prev.equals(last.Left())) {
            snakeImage = this.tailLeft;
        }
        g.drawImage(snakeImage, getPrintX(this.body.get(this.body.size() - 1)), getPrintY(this.body.get(this.body.size() - 1)), this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    
}
