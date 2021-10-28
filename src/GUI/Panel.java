package GUI;

import Elements.Agents;
import Elements.Cababilities;
import Elements.Elements;
import Elements.Goals;
import Elements.Roles;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import GUI.Panel;
import Relations.Relations;
import java.awt.Point;
import javax.swing.JOptionPane;

public class Panel extends JPanel implements MouseListener {

    ArrayList<Elements> elms = null;
    ArrayList<Relations> listaRelations = null;
    Point p1, p2;
    private int tipo = 0;

    public Panel() {
        elms = new ArrayList<>();
        listaRelations = new ArrayList<>();
        addMouseListener(this);

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

        for (Relations relation : listaRelations) {
            relation.draw(g);
        }
    }

    public ArrayList<Relations> getListaRelations() {
        return listaRelations;
    }

    public void setListaRelations(ArrayList<Relations> listaRelations) {
        this.listaRelations = listaRelations;
    }

    public ArrayList<Elements> getElms() {
        return elms;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        switch (this.getTipo()) {
            case 1:
                if (e.getButton() == 1) {

                    elms.add(new Roles(e.getX() - 20, e.getY() - 20, JOptionPane.showInputDialog("Ingrese nombre")));

                    repaint();
                }
                break;

            case 2:
                if (e.getButton() == 1) {

                    elms.add(new Agents(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre"), JOptionPane.showInputDialog("Ingrese costo")));
                    repaint();

                }
                break;

            case 3:
                if (e.getButton() == 1) {

                    elms.add(new Cababilities(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre")));
                    repaint();
                }
                break;

            case 4:
                if (e.getButton() == 1) {

                    elms.add(new Goals(e.getX() - 20, e.getY() - 20, JOptionPane.showInputDialog("Ingrese nombre")));
                    repaint();
                }
                break;

            case 5:
                
                break;
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
