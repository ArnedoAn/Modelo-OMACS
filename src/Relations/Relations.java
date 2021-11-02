package Relations;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public abstract class Relations {

    private int x1, y1, x2, y2;
    private final int relacion;
    private String valor;
    private Line2D imgLine;

    public Relations(int x1, int y1, int x2, int y2, int relacion, String valor) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        imgLine = new Line2D.Double(x1, y1, x2, y2);
        this.relacion = relacion;
        this.valor = valor;
    }

    public int getRelacion() {
        return relacion;
    }

    abstract public void draw(Graphics g);

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
