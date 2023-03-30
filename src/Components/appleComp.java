package Components;

import geometry.Point;

import java.awt.Image;

import javax.swing.ImageIcon;

public class appleComp extends collectiblesComp{

    public appleComp(Point point) {
        super(point);
        this.icon = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_UP_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);
    }

    @Override
    public void update() {

    }
    
}
