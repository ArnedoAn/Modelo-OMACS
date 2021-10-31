package Relations;

import java.awt.Graphics;

public class Possesses extends Relations {

    public Possesses(int x1, int y1, int x2, int y2, String valor) {
        super(x1, y1, x2, y2, 5, valor);
    }

    @Override
    public void draw(Graphics g) {
        if (this.getY1() == this.getY2() || this.getY1() < this.getY2()) {
            g.drawLine(this.getX1(), this.getY1() + 20, this.getX2(), this.getY2() - 20);
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() + 5, this.getY2() - 25);
            g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() - 5, this.getY2() - 25);
            if (this.getX1() > this.getX1() && this.getY1() > this.getY2()) {
                g.drawString(this.getValor(), this.getX1() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY1() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() < this.getX1() && this.getY1() < this.getY2()) {
                g.drawString(this.getValor(), this.getX2() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY2() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() > this.getX1() && this.getY1() < this.getY2()) {
                g.drawString(this.getValor(), this.getX1() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY2() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() < this.getX1() && this.getY1() > this.getY2()) {
                g.drawString(this.getValor(), this.getX2() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY1() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
        } else if (this.getY1() > this.getY2()) {
            g.drawLine(this.getX1(), this.getY1() - 20, this.getX2(), this.getY2() + 20);
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() + 5, this.getY2() + 25);
            g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() - 5, this.getY2() + 25);
            if (this.getX1() > this.getX1() && this.getY1() > this.getY2()) {
                g.drawString(this.getValor(), this.getX1() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY1() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() < this.getX1() && this.getY1() < this.getY2()) {
                g.drawString(this.getValor(), this.getX2() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY2() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() > this.getX1() && this.getY1() < this.getY2()) {
                g.drawString(this.getValor(), this.getX1() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY2() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
            if (this.getX1() < this.getX1() && this.getY1() > this.getY2()) {
                g.drawString(this.getValor(), this.getX2() - Math.abs((this.getX1() - this.getX2()) / 2), this.getY1() - Math.abs((this.getY1() - this.getY2()) / 2));
            }
        }
    }

}
