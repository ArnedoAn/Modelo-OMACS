package Elements;

import java.awt.Graphics;

public class Cababilities extends Elements{
    
    private static final int d = 60;

    public Cababilities(int x, int y, int tipo) {
       super(x,y,tipo);
    }

    @Override
    public void draw(Graphics c) {
        c.drawOval(getX(), getY(), d, d);
    }

   

}
