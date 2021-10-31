package Relations;

import java.awt.Graphics;

public class Achieves extends Relations {

    public Achieves(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2, 7, "");
    }
    
    @Override
    public void draw(Graphics g) {
        if (this.getY1() == this.getY2() || this.getY1() < this.getY2()) {
            g.drawLine(this.getX1(), this.getY1() + 20, this.getX2(), this.getY2() - 20);
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() + 5, this.getY2() - 25);
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() - 5, this.getY2() - 25);
            
        } else if (this.getY1() > this.getY2()) {
            g.drawLine(this.getX1(), this.getY1() - 20, this.getX2(), this.getY2() + 20);
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() + 5, this.getY2() + 25);
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() - 5, this.getY2() + 25);
            
        }
    }

}
