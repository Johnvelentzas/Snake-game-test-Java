package Components;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import geometry.Point;
import main.component;

public class boardComp extends JFrame implements component{

    private Image tileImage = new ImageIcon(MEDIA_PATH + BACKGROUND_ICON_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    private ArrayList<Point> apples = new ArrayList<>();

    public Boolean eatApple(Point head){
        for (Point apple : apples) {
            if (apple.equals(head)) {
                this.apples.remove(apple);
                return true;
            }
        }
        return false;
    }

    public boolean canGo(Point point){
        return true;
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < SCREEN_COL; i++) {
            for (int j = 0; j < SCREEN_ROW; j++) {
                g.drawImage(tileImage, i * TILE_SIZE, j * TILE_SIZE, this);
            }
        }
    }
    
}
