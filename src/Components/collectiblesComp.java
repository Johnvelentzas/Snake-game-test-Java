package Components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

import geometry.Point;
import main.component;

public abstract class collectiblesComp extends JFrame implements component{

    protected Image icon;
    private Point coords;

    public collectiblesComp(Point point){
        this.coords = point;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.icon, component.getPrintX(this.coords), component.getPrintY(this.coords), this);
    }

    public Point getCoords(){
        return this.coords;
    }
    
}
