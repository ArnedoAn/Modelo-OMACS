package Relations;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public abstract class Relations {

    private int x1, y1, x2, y2;
    private final int relacion;
    private String valor;

    public Relations(int x1, int y1, int x2, int y2, int relacion, String valor) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.relacion = relacion;
        this.valor=valor; 
    }

    public int getRelacion() {
        return relacion;
    }
    
    

    public void draw(Graphics g) {
        switch (this.getRelacion()) {
            case 5,7:
                if (this.getY1() == this.getY2() || this.getY1() < this.getY2()) {
                    g.drawLine(this.getX1(), this.getY1() + 20, this.getX2(), this.getY2() - 20);
                    g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() + 5, this.getY2() - 25);
                    g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() - 5, this.getY2() - 25);
                    if(x1>x2&&y1>y1){
                        g.drawString(valor,x1-Math.abs((x1-x2)/2),y1-Math.abs((y1-y2)/2));
                    }
                    if(x1<x2&&y1<y2){
                        g.drawString(valor,x2-Math.abs((x1-x2)/2),y2-Math.abs((y1-y2)/2));
                    }
                    if(x1>x2&&y1<y2){
                        g.drawString(valor,x1-Math.abs((x1-x2)/2),y2-Math.abs((y1-y2)/2));
                    }
                    if(x1<x2&&y1>y2){
                        g.drawString(valor,x2-Math.abs((x1-x2)/2),y1-Math.abs((y1-y2)/2));
                    }
                } else if (this.getY1() > this.getY2()) {
                    g.drawLine(this.getX1(), this.getY1() - 20, this.getX2(), this.getY2() + 20);
                    g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() + 5, this.getY2() + 25);
                    g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() - 5, this.getY2() + 25);
                    if(x1>x2&&y1>y1){
                        g.drawString(valor,x1-Math.abs((x1-x2)/2),y1-Math.abs((y1-y2)/2));
                    }
                    if(x1<x2&&y1<y2){
                        g.drawString(valor,x2-Math.abs((x1-x2)/2),y2-Math.abs((y1-y2)/2));
                    }
                    if(x1>x2&&y1<y2){
                        g.drawString(valor,x1-Math.abs((x1-x2)/2),y2-Math.abs((y1-y2)/2));
                    }
                    if(x1<x2&&y1>y2){
                        g.drawString(valor,x1-Math.abs((x1-x2)/2),y1-Math.abs((y1-y2)/2));
                    }
                }   break;
           
            case 6:
                Graphics2D g2 = (Graphics2D) g;
                int ancho=1;
                float guion[]={4};
                float guion1[]={10};
                if (this.getY1() == this.getY2() || this.getY1() < this.getY2()) {
                    g2.setStroke(new BasicStroke(ancho,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,guion,0));
                    g.drawLine(this.getX1(), this.getY1() + 20, this.getX2(), this.getY2() - 20);
                    g2.setStroke(new BasicStroke(ancho,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,guion1,0));
                    g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() + 5, this.getY2() - 27);
                    g.drawLine(this.getX2(), this.getY2() - 20, this.getX2() - 5, this.getY2() - 27);
                } else if (this.getY1() > this.getY2()) {
                    g2.setStroke(new BasicStroke(ancho,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,guion,0));
                    g.drawLine(this.getX1(), this.getY1() - 20, this.getX2(), this.getY2() + 20);
                    g2.setStroke(new BasicStroke(ancho,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,guion1,0));
                    g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() + 5, this.getY2() + 27);
                    g.drawLine(this.getX2(), this.getY2() + 20, this.getX2() - 5, this.getY2() + 27);
                }   break;
                
            default:break;
        }

    }

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
