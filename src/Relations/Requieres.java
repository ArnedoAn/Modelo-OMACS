package Relations;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Requieres extends Relations {

    public Requieres(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2, 6, "");
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int ancho = 1;
        float guion[] = {4};
        float guion1[] = {10};
        if (this.getY1() == this.getY2() || this.getY1() < this.getY2()) {
            g2.setStroke(new BasicStroke(ancho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guion, 0));
            g.drawLine(this.getX1(), this.getY1() + 20, this.getX2(), this.getY2() - 20);
            g2.setStroke(new BasicStroke(ancho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guion1, 0));
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() + 5, this.getY2() - 27);
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() - 5, this.getY2() - 27);
        } else if (this.getY1() > this.getY2()) {
            g2.setStroke(new BasicStroke(ancho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guion, 0));
            g.drawLine(this.getX1(), this.getY1() - 20, this.getX2(), this.getY2() + 20);
            g2.setStroke(new BasicStroke(ancho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guion1, 0));
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() + 5, this.getY2() + 27);
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() - 5, this.getY2() + 27);
        }
    }

}
