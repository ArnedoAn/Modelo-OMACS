package GUI;
//Comentario

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
import Relations.Achieves;
import Relations.Relations;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import Relations.Possesses;
import Relations.Requieres;
import java.awt.event.MouseMotionListener;
import GUI.Panel;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {

    private ArrayList<Elements> elms = null;
    private ArrayList<Relations> listaRelations = null;
    private ArrayList<Relations> auxRelations = null;

    private Point p1, p2;
    private Elements auxElement;
    private int iElement;
    private int tipo;
    private static final int sizeLine = 20;

    public Panel() {
        this.elms = new ArrayList<>();
        this.listaRelations = new ArrayList<>();
        this.auxRelations = new ArrayList<>();
        addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Comprobacion para no sobreponer elementos
    private boolean isOn(Point p) {
        Rectangle element = new Rectangle(p.x - 20, p.y - 20, 40, 40);
        for (Elements elements : elms) {
            if (new Rectangle(elements.getX() - 20, elements.getY() - 20, 40, 40).intersects(element)) {
                return true;
            }
        }
        return false;
    }

    public void actualizarElements(int tipo) {

        ArrayList<String> listName = new ArrayList<String>();
        for (Elements element : elms) {
            if (element.getTipo() == tipo) {
                listName.add(element.getName());

            }
        }

        Object cin = JOptionPane.showInputDialog(null, "Elija la figura a actualizar", "Seleccion", JOptionPane.QUESTION_MESSAGE, null, listName.toArray(), null);
        listName.clear();

        for (Elements element : elms) {
            if (element.getTipo() == 2) {
                if (element.getName().equals(cin)) {
                    String[] options = {"Nombre", "Valor"};
                    int opcion = JOptionPane.showOptionDialog(null, "Seleccione atributo", "Seleccion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    if (opcion == 0) {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre");
                        element.setName(nombre);
                    } else {
                        String valor = JOptionPane.showInputDialog(null, "Ingrese valor");
                        element.setCosto(valor);
                    }
                }
            } else if (element.getTipo() == tipo) {
                if (element.getName().equals(cin)) {
                    element.setName(JOptionPane.showInputDialog("Ingrese nuevo nombre"));
                }

            }
        }
        repaint();

    }

    public void actualizarRelation(int tipo) {
        ArrayList<String> listValor = new ArrayList<String>();
        for (Relations relation : listaRelations) {
            if (relation.getRelacion() == tipo) {
                listValor.add(relation.getValor());

            }
        }
        Object cin = JOptionPane.showInputDialog(null, "Elija la figura a actualizar", "Seleccion", JOptionPane.QUESTION_MESSAGE, null, listValor.toArray(), null);
        listValor.clear();

        for (Relations relation : listaRelations) {
            if (relation.getRelacion() == tipo) {
                listaRelations.indexOf(relation);
                if (relation.getValor().equals(cin)) {
                    String valor = JOptionPane.showInputDialog(null, "Ingrese valor");
                    relation.setValor(valor);
                }
            }
        }
        repaint();
    }

    public void openFile(File file) {

    }

    public void saveFile() {
        try {
            String ruta = "datos.txt";
            File file = new File(ruta);

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Elements elements : elms) {

                    bw.write((int) elements.getId() + ";" + elements.getX()
                            + ";" + elements.getY() + ";" + elements.getTipo()
                            + ";" + elements.getName() + ";" + elements.getCosto() + "\n");
                }

                for (Relations relation : listaRelations) {
                    bw.write(relation.getX1() + ";" + relation.getY1() + ";" + relation.getX2()
                            + ";" + relation.getY2() + ";" + relation.getRelacion()
                            + ";" + relation.getValor() + "\n");
                }
                bw.close();
            } else {
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Elements elements : elms) {

                    bw.write((int) elements.getId() + ";" + elements.getX()
                            + ";" + elements.getY() + ";" + elements.getTipo()
                            + ";" + elements.getName() + ";" + elements.getCosto() + "\n");
                }

                for (Relations relation : listaRelations) {
                    bw.write(relation.getX1() + ";" + relation.getY1() + ";" + relation.getX2()
                            + ";" + relation.getY2() + ";" + relation.getRelacion()
                            + ";" + relation.getValor() + "\n");
                }
                bw.close();
                
            }

            System.out.println("Guardado");
        } catch (Exception e) {
            e.printStackTrace();
        }
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

                    if (!isOn(e.getPoint())) {
                        elms.add(new Roles(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre")));
                        repaint();
                    }

                }
                break;

            case 2:
                if (e.getButton() == 1) {

                    if (!isOn(e.getPoint())) {
                        elms.add(new Agents(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre"), JOptionPane.showInputDialog("Ingrese costo")));
                        repaint();
                    }

                }
                break;

            case 3:
                if (e.getButton() == 1) {

                    if (!isOn(e.getPoint())) {
                        elms.add(new Cababilities(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre")));
                        repaint();
                    }

                }
                break;

            case 4:

                if (e.getButton() == 1) {

                    if (!isOn(e.getPoint())) {
                        elms.add(new Goals(e.getX(), e.getY(), JOptionPane.showInputDialog("Ingrese nombre")));
                        repaint();
                    }

                }
                break;

            case 5:
                if (e.getButton() == 1) {
                    for (Elements elm : elms) {
                        if (new Rectangle(elm.getX() - 30, elm.getY() - 30, 60, 60).contains(e.getPoint())) {

                            if (p1 == null) {
                                if (elm.getTipo() == 2) {
                                    p1 = new Point(elm.getX(), elm.getY());
                                }
                            } else {
                                if (elm.getTipo() == 3) {
                                    p2 = new Point(elm.getX(), elm.getY());
                                    String valor = JOptionPane.showInputDialog("Ingrese valor:");
                                    this.listaRelations.add(new Possesses(p1.x, p1.y, p2.x, p2.y, valor));
                                    repaint();
                                    p1 = null;
                                    p2 = null;
                                }
                            }

                        }
                    }
                }
                break;

            case 6:
                if (e.getButton() == 1) {

                    for (Elements elm : elms) {
                        if (new Rectangle(elm.getX() - 30, elm.getY() - 30, 60, 60).contains(e.getPoint())) {

                            if (p1 == null) {
                                if (elm.getTipo() == 1) {
                                    p1 = new Point(elm.getX(), elm.getY());
                                }
                            } else {
                                if (elm.getTipo() == 3) {
                                    p2 = new Point(elm.getX(), elm.getY());
                                    this.listaRelations.add(new Requieres(p1.x, p1.y, p2.x, p2.y));
                                    repaint();
                                    p1 = null;
                                    p2 = null;
                                }
                            }

                        }
                    }
                }
                break;

            case 7:
                if (e.getButton() == 1) {

                    for (Elements elm : elms) {
                        if (new Rectangle(elm.getX() - 30, elm.getY() - 30, 60, 60).contains(e.getPoint())) {

                            if (p1 == null) {
                                if (elm.getTipo() == 1) {
                                    p1 = new Point(elm.getX(), elm.getY());
                                }
                            } else {
                                if (elm.getTipo() == 4) {
                                    p2 = new Point(elm.getX(), elm.getY());
                                    this.listaRelations.add(new Achieves(p1.x, p1.y, p2.x, p2.y));
                                    repaint();
                                    p1 = null;
                                    p2 = null;
                                }
                            }

                        }
                    }
                }
                break;

            case -2:
                if (e.getButton() == 1) {
                    if (isOn(e.getPoint())) {

                        int Tipo = 0;
                        Point p = null;

                        for (Elements elm : elms) {
                            if (new Rectangle(elm.getX() - 30, elm.getY() - 30, 60, 60).contains(e.getPoint())) {
                                Tipo = elm.getTipo();
                                p = new Point(elm.getX(), getY());
                                elms.remove(elm);
                                break;
                            }
                        }

                        for (Relations relations : listaRelations) {
                            if (new Rectangle(relations.getX1() - 30, relations.getY1() - 30, 60, 60).contains(e.getPoint())) {
                                auxRelations.add(relations);
                            } else if (new Rectangle(relations.getX2() - 30, relations.getY2() - 30, 60, 60).contains(e.getPoint())) {
                                auxRelations.add(relations);
                            }
                        }

                        for (Relations relations : auxRelations) {
                            listaRelations.remove(relations);

                        }

                        auxRelations.clear();

                    } else {

                        int boxX = e.getX() - sizeLine / 2;
                        int boxY = e.getY() - sizeLine / 2;

                        int width = sizeLine;
                        int height = sizeLine;

                        Line2D auxLine;
                        for (Relations line : listaRelations) {
                            auxLine = new Line2D.Double(line.getX1(), line.getY1(), line.getX2(), line.getY2());
                            if (auxLine.intersectsLine(e.getX() + 20, e.getY() - 20, e.getX() - 20, e.getY() + 20)) {

                                listaRelations.remove(line);
                                break;
                            }

                        }

                    }

                    repaint();
                }
                break;

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.getTipo() == -1) {
            int iAux = 0;
            for (Elements elm : elms) {
                if (new Rectangle(elm.getX() - 30, elm.getY() - 30, 60, 60).contains(e.getPoint())) {
                    auxElement = elm;
                    iElement = iAux;
                    break;
                }
                iAux++;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.getTipo() == -1) {
            auxElement = null;
            iElement = -1;
        }

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
        if (this.getTipo() == -1) {
            if (auxElement != null) {

                switch (auxElement.getTipo()) {
                    case 1:
                        this.elms.set(iElement, new Roles(e.getX(), e.getY(), auxElement.getName()));
                        break;
                    case 2:

                        this.elms.set(iElement, new Agents(e.getX(), e.getY(), auxElement.getName(), auxElement.getCosto()));
                        break;
                    case 3:
                        this.elms.set(iElement, new Cababilities(e.getX(), e.getY(), auxElement.getName()));
                        break;
                    case 4:
                        this.elms.set(iElement, new Goals(e.getX(), e.getY(), auxElement.getName()));
                        break;
                }

                int iR = 0;
                for (Relations relations : listaRelations) {

                    if (new Rectangle(relations.getX1() - 30, relations.getY1() - 30, 60, 60).contains(e.getPoint())) {

                        switch (relations.getRelacion()) {

                            case 5:
                                if (auxElement.getTipo() == 2) {
                                    this.listaRelations.set(iR, new Possesses(e.getX(), e.getY(), relations.getX2(), relations.getY2(), relations.getValor()));
                                } else if (auxElement.getTipo() == 3) {
                                    this.listaRelations.set(iR, new Possesses(relations.getX1(), relations.getY1(), e.getX(), e.getY(), relations.getValor()));

                                }
                                break;

                            case 6:
                                if (auxElement.getTipo() == 1) {
                                    this.listaRelations.set(iR, new Requieres(e.getX(), e.getY(), relations.getX2(), relations.getY2()));
                                } else if (auxElement.getTipo() == 3) {
                                    this.listaRelations.set(iR, new Requieres(relations.getX1(), relations.getY1(), e.getX(), e.getY()));

                                }
                                break;

                            case 7:
                                if (auxElement.getTipo() == 1) {
                                    this.listaRelations.set(iR, new Achieves(e.getX(), e.getY(), relations.getX2(), relations.getY2()));
                                } else if (auxElement.getTipo() == 4) {
                                    this.listaRelations.set(iR, new Achieves(relations.getX1(), relations.getY1(), e.getX(), e.getY()));

                                }
                                break;
                        }

                    } else if (new Rectangle(relations.getX2() - 30, relations.getY2() - 30, 60, 60).contains(e.getPoint())) {

                        switch (relations.getRelacion()) {
                            case 5:
                                if (auxElement.getTipo() == 3) {
                                    this.listaRelations.set(iR, new Possesses(relations.getX1(), relations.getY1(), e.getX(), e.getY(), relations.getValor()));
                                } else if (auxElement.getTipo() == 2) {
                                    this.listaRelations.set(iR, new Possesses(e.getX(), e.getY(), relations.getX2(), relations.getY2(), relations.getValor()));

                                }
                                break;

                            case 6:
                                if (auxElement.getTipo() == 3) {
                                    this.listaRelations.set(iR, new Requieres(relations.getX1(), relations.getY1(), e.getX(), e.getY()));
                                } else if (auxElement.getTipo() == 1) {
                                    this.listaRelations.set(iR, new Requieres(e.getX(), e.getY(), relations.getX2(), relations.getY2()));
                                }
                                break;

                            case 7:
                                if (auxElement.getTipo() == 4) {
                                    this.listaRelations.set(iR, new Achieves(relations.getX1(), relations.getY1(), e.getX(), e.getY()));
                                } else if (auxElement.getTipo() == 1) {
                                    this.listaRelations.set(iR, new Achieves(e.getX(), e.getY(), relations.getX2(), relations.getY2()));

                                }
                                break;

                        }

                    }
                    iR++;
                }

            }

            repaint();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e
    ) {

    }

}
