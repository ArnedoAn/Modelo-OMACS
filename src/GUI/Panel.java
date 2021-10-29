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
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import Relations.Possesses;
import java.awt.event.MouseMotionListener;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Elements> elms = null;
    ArrayList<Relations> listaRelations = null;
    private Point p1,p2;
    private Elements auxElement;
    private int iElement;
    private int tipo = 0;

    public Panel() {
        elms = new ArrayList<>();
        listaRelations = new ArrayList<>();
        addMouseListener(this);
        this.addMouseMotionListener(this);

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
                if(e.getButton()==1){
                    for(Elements elm : elms){
                        if(new Rectangle(elm.getX()-30, elm.getY()-30, 60, 60).contains(e.getPoint())){
                            if(p1==null){
                                p1=new Point(elm.getX(),elm.getY());
                            }else{
                                p2=new Point (elm.getX(),elm.getY());
                                this.listaRelations.add(new Possesses(p1.x, p1.y, p2.x, p2.y));
                                repaint();
                                p1=null;
                                p2=null;
                            }
                        }
                    }
                }
                break;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        int iAux=0;
//        for(Elements elm : elms){
//            if(new Rectangle(elm.getX()-30,elm.getY()-30,60,60).contains(e.getPoint())){
//                auxElement=elm;
//                iElement=iAux;
//                break;
//            }
//            iAux++;
//        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        auxElement=null;
//        iElement=-1;
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
        
        
        
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(auxElement!=null){
            this.elms.set(iElement, new Roles(e.getX(), e.getY(), auxElement.getName()));
            int iR=0;
            for(Relations relations : listaRelations){
                if(new Rectangle(relations.getX1()-30,relations.getY1()-30,60,60).contains(e.getPoint())){
                    this.listaRelations.set(iR, new Possesses(e.getX(), e.getY(), relations.getX2(), relations.getY2()));
                }else if(new Rectangle(relations.getX2()-30,relations.getY2()-30,60,60).contains(e.getPoint())){
                    this.listaRelations.set(iR, new Possesses(relations.getX1(), relations.getY1(), e.getX(), e.getY()));
                }
                iR++;
            }
        }
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }

}
