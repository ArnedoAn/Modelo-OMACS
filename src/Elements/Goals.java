package Elements;

import java.awt.Graphics;

public class Goals extends Elements{

    public Goals(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public void draw(Graphics c) {
        c.drawRect(this.getX(), this.getY(), 40, 40);
        c.drawString(this.getName(), getX()+13, getY()+25);
    }
    
}
