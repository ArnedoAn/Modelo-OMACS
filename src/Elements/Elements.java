/*Programa desarrollado por:
Jaime Andrés Navarro Urbina
Andrés Eduardo Arnedo Escalante*/

package Elements;

import java.awt.Graphics;

public abstract class Elements {
    
    private double id;
    private int x = 0, y = 0;
    private String name = null;
    private int tipo;
    private String costo;

    public Elements(int x, int y, String name, int tipo, String costo) {
        this.id=Math.random()*100;
        this.x = x;
        this.y = y;
        this.name = name;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getCosto() {
        return costo;
    }

    
    public int getTipo() {
        return tipo;
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

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    public double getId() {
        return id;
    }

    public void setId(double Id) {
        this.id = Id;
    }
}
