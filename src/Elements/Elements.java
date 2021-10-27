package Elements;

import java.awt.Graphics;


public abstract class Elements {

    private int x = 0, y = 0, tipo;

    public Elements(int x, int y, int tipo) {
        this.x = x;
        this.y = y;
        this.tipo = 0;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw(Graphics c);
}
