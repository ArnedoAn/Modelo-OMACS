package Elements;

import java.awt.Graphics;

public class Cababilities extends Elements{

    private int[] xP = new int[]{this.getX(), this.getX()-20, this.getX()-10, this.getX()+10, this.getX()+20};
    private int[] yP = new int[]{this.getY()-20, this.getY(), this.getY()+20, this.getY()+20, this.getY()};
    
    
    
    public Cababilities(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public void draw(Graphics c) {
       c.drawPolygon(xP, yP, 5);
       c.drawString(this.getName(), getX()-6, getY()+10);
    }

}
