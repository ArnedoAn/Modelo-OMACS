package Elements;

import java.awt.Graphics;

public class Agents {

    private final int id;

    public Agents() {
        this.id = (int) (Math.random() * 10 + 1);
    }

    public static void drawAgents(Graphics g, int[] x, int[] y) {

        g.drawPolygon(x, y, 3);
    }
    
    public int getId(){
        return this.id;
    }
}
