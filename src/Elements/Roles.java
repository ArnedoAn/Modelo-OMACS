package Elements;

import java.awt.Graphics;

public class Roles extends Elements{
    
    private static final int d = 40;

    public Roles(int x, int y, String name) {
       super(x,y, name, 1, "");
    }

    @Override
    public void draw(Graphics c) {
        c.drawOval(getX()-20, getY()-20, d, d);
        c.drawString(this.getName(), getX()+15, getY()+25);
    }

   

}
