package Elements;

import java.awt.Point;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class Agents extends Elements {

    private int[] xP = new int[]{this.getX()-20, this.getX(), this.getX()+20};
    private int[] yP = new int[]{this.getY()+20, this.getY()-20, this.getY()+20};
    
    private String costo = null;
    
    
    public Agents(int x, int y, String name, String costo) {
        super(x, y, name);
        this.costo = costo;
    }

    @Override
    public void draw(Graphics c) {
        c.drawPolygon(xP, yP, 3);
        c.drawString(this.getName(), getX()-4, getY()+12);
        c.drawString(costo, getX()-25, getY()-20);
    }
    
       
    
}
