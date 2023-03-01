import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class snakeComp extends JFrame implements component, SnakeConst {

    private ArrayList<snakeTile> snakeBody = new ArrayList<>();
    private int size;

    private Image snakeHead = new ImageIcon(MEDIA_PATH + SNAKE_HEAD_UP_PATH).getImage().getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_DEFAULT);

    public snakeComp(){
        this.snakeBody.add(null);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    public boolean moveUp(boolean eat){
        return true;
    }
    
}
