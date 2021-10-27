package GUI;

import Elements.Elements;
import Elements.Cababilities;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import GUI.Panel;
import javax.swing.JOptionPane;

public class Panel extends JPanel implements MouseListener {

    ArrayList<Elements> elms = null;

    private int tipo;

    public Panel() {
        elms = new ArrayList<>();
        addMouseListener(this);
        this.tipo = 0;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Elements elm : elms) {
            elm.draw(g);
        }
    }

    public ArrayList<Elements> getElms() {
        return elms;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (this.getTipo() == 1) {
            for (Elements elm : elms) {
                if (e.getButton() == 1) {
                    elms.add(new Cababilities(e.getX() - 30, e.getY() - 30, 1));
                    repaint();
                }
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e
    ) {

    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {

    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

}
