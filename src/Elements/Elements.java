package Elements;

import java.awt.Graphics;


public abstract class Elements {

    private int x = 0, y = 0;
    private String name = null;

    
    public Elements(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
