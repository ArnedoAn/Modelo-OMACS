package Relations;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Relations {

    private Point p1;
    private Point p2;

    public Relations(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);

    }
    
    public void draw(Graphics g){
        g.drawLine((int)p1.getX(),(int) p1.getY(),(int) p2.getX(),(int) p2.getY());
    }
    
}
