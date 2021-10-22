//Codificado por Andrés Arnedo Escalante :D

package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    
    //Reescalar iconos 
    public ImageIcon iconResize(String fileDirectory){
        Image img = new ImageIcon(getClass().getResource(fileDirectory)).getImage();
        Image newimg = img.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }
     

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChoose = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        menuBarra = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        newModel = new javax.swing.JMenuItem();
        openModel = new javax.swing.JMenuItem();
        closeApp = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        addAll = new javax.swing.JMenu();
        addElement = new javax.swing.JMenu();
        addAgents = new javax.swing.JMenuItem();
        addCababilities = new javax.swing.JMenuItem();
        addRoles = new javax.swing.JMenuItem();
        addGoals = new javax.swing.JMenuItem();
        addRelation = new javax.swing.JMenu();
        addPossesses = new javax.swing.JMenuItem();
        addRequieres = new javax.swing.JMenuItem();
        addAchieves = new javax.swing.JMenuItem();

        fileChoose.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBarra.setBorder(null);
        menuBarra.setEnabled(false);
        menuBarra.setFocusable(false);
        menuBarra.setOpaque(false);

        menuArchivo.setText("Archivo");

        newModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newModel.setText("Nuevo Modelo");
        menuArchivo.add(newModel);

        openModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openModel.setText("Abrir Modelo");
        openModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openModelActionPerformed(evt);
            }
        });
        menuArchivo.add(openModel);

        closeApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        closeApp.setText("Cerrar ");
        closeApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppActionPerformed(evt);
            }
        });
        menuArchivo.add(closeApp);

        menuBarra.add(menuArchivo);

        menuEditar.setText("Editar");

        addAll.setText("Adicionar");

        addElement.setText("Elemento");

        addAgents.setIcon(iconResize("/Images/triangulo.png"));
        addAgents.setText("Agents");
        addAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAgentsActionPerformed(evt);
            }
        });
        addElement.add(addAgents);

        addCababilities.setIcon(iconResize("/Images/pentagono.png"));
        addCababilities.setText("Cababilities");
        addElement.add(addCababilities);

        addRoles.setIcon(iconResize("/Images/circulo.png"));
        addRoles.setText("Roles");
        addElement.add(addRoles);

        addGoals.setIcon(iconResize("/Images/cuadrado.png"));
        addGoals.setText("Goals");
        addElement.add(addGoals);

        addAll.add(addElement);

        addRelation.setText("Relación");

        addPossesses.setText("Possesses");
        addRelation.add(addPossesses);

        addRequieres.setText("Requieres");
        addRelation.add(addRequieres);

        addAchieves.setText("Achieves");
        addRelation.add(addAchieves);

        addAll.add(addRelation);

        menuEditar.add(addAll);

        menuBarra.add(menuEditar);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeAppActionPerformed

    private void openModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openModelActionPerformed

        fileChoose.showOpenDialog(fileChoose);
    }//GEN-LAST:event_openModelActionPerformed

    private void addAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAgentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAgentsActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAchieves;
    private javax.swing.JMenuItem addAgents;
    private javax.swing.JMenu addAll;
    private javax.swing.JMenuItem addCababilities;
    private javax.swing.JMenu addElement;
    private javax.swing.JMenuItem addGoals;
    private javax.swing.JMenuItem addPossesses;
    private javax.swing.JMenu addRelation;
    private javax.swing.JMenuItem addRequieres;
    private javax.swing.JMenuItem addRoles;
    private javax.swing.JMenuItem closeApp;
    private javax.swing.JFileChooser fileChoose;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem newModel;
    private javax.swing.JMenuItem openModel;
    // End of variables declaration//GEN-END:variables
}
