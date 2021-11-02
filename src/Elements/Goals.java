package Elements;

import java.awt.Graphics;

public class Goals extends Elements{

    public Goals(int x, int y, String name) {
        super(x, y, name, 4, "");
    }

    @Override
    public void draw(Graphics c) {
        c.drawRect(this.getX()-20, this.getY()-20, 40, 40);
        c.drawString(this.getName(), getX()-2, getY()+6);
    }
    
}
