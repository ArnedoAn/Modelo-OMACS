package GUI;

import Elements.Roles;
import Elements.Elements;
import Elements.Agents;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    
    Panel panel = new Panel();

    public GUI() {
        initComponents();

        this.setResizable(false);

        panel.setSize(981, 476);
        panel.setLocation(0, 0);
        panel.setBackground(Color.white);

        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    
    public ImageIcon iconRezise(String f) {
        Image img = new ImageIcon(getClass().getResource(f)).getImage();
        Image newimg = img.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }
    
    Image logo= new ImageIcon(getClass().getResource("/Images/modeloIcon.png")).getImage();
    
    JFileChooser selectFile = new JFileChooser();
    File file;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        agente = new javax.swing.JButton();
        cababilities = new javax.swing.JButton();
        roles = new javax.swing.JButton();
        goals = new javax.swing.JButton();
        possesses = new javax.swing.JButton();
        requires = new javax.swing.JButton();
        achieves = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemNuevoModelo = new javax.swing.JMenuItem();
        itemAbrirModelo = new javax.swing.JMenuItem();
        itemGuardarModelo = new javax.swing.JMenuItem();
        itemCerrar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenu();
        itemElementos = new javax.swing.JMenu();
        subItemAgents = new javax.swing.JMenuItem();
        subItemCababilities = new javax.swing.JMenuItem();
        subItemRoles = new javax.swing.JMenuItem();
        subItemGoals = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subItemPossesses = new javax.swing.JMenuItem();
        subItemRequires = new javax.swing.JMenuItem();
        subItemAchieves = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Modelo OMACS");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(logo);

        content.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setForeground(new java.awt.Color(0, 0, 0));
        select.setIcon(iconRezise("/Images/select.png"));
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        remove.setForeground(new java.awt.Color(0, 0, 0));
        remove.setIcon(iconRezise("/Images/trash.png"));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        agente.setForeground(new java.awt.Color(0, 0, 0));
        agente.setIcon(iconRezise("/Images/triangulo.png"));
        agente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenteActionPerformed(evt);
            }
        });
        jPanel1.add(agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 40));

        cababilities.setForeground(new java.awt.Color(0, 0, 0));
        cababilities.setIcon(iconRezise("/Images/pentagono.png"));
        cababilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cababilitiesActionPerformed(evt);
            }
        });
        jPanel1.add(cababilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 40));

        roles.setForeground(new java.awt.Color(0, 0, 0));
        roles.setIcon(iconRezise("/Images/circulo.png"));
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });
        jPanel1.add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 40));

        goals.setForeground(new java.awt.Color(0, 0, 0));
        goals.setIcon(iconRezise("/Images/cuadrado.png"));
        goals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalsActionPerformed(evt);
            }
        });
        jPanel1.add(goals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 40));

        possesses.setForeground(new java.awt.Color(0, 0, 0));
        possesses.setIcon(iconRezise("/Images/possesses.png"));
        possesses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                possessesActionPerformed(evt);
            }
        });
        jPanel1.add(possesses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 40));

        requires.setForeground(new java.awt.Color(0, 0, 0));
        requires.setIcon(iconRezise("/Images/requires.png"));
        requires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requiresActionPerformed(evt);
            }
        });
        jPanel1.add(requires, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        achieves.setForeground(new java.awt.Color(0, 0, 0));
        achieves.setIcon(iconRezise("/Images/achieves.png"));
        achieves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achievesActionPerformed(evt);
            }
        });
        jPanel1.add(achieves, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jMenuBar4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar4.setBorderPainted(false);
        jMenuBar4.setEnabled(false);

        menuArchivo.setText("Archivo");

        itemNuevoModelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemNuevoModelo.setText("Nuevo Modelo");
        menuArchivo.add(itemNuevoModelo);

        itemAbrirModelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAbrirModelo.setText("Abrir Modelo");
        itemAbrirModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirModeloActionPerformed(evt);
            }
        });
        menuArchivo.add(itemAbrirModelo);

        itemGuardarModelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemGuardarModelo.setText("Guardar Modelo");
        itemGuardarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarModeloActionPerformed(evt);
            }
        });
        menuArchivo.add(itemGuardarModelo);

        itemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemCerrar.setText("Cerrar");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(itemCerrar);

        jMenuBar4.add(menuArchivo);

        menuActualizar.setText("Actualizar");

        itemElementos.setText("Elementos");

        subItemAgents.setText("Agents");
        itemElementos.add(subItemAgents);

        subItemCababilities.setText("Cababilities");
        subItemCababilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemCababilitiesActionPerformed(evt);
            }
        });
        itemElementos.add(subItemCababilities);

        subItemRoles.setText("Roles");
        itemElementos.add(subItemRoles);

        subItemGoals.setText("Goals");
        itemElementos.add(subItemGoals);

        menuActualizar.add(itemElementos);

        jMenu2.setText("Relaciones");

        subItemPossesses.setText("Possesses");
        jMenu2.add(subItemPossesses);

        subItemRequires.setText("Requires");
        jMenu2.add(subItemRequires);

        subItemAchieves.setText("Achieves");
        jMenu2.add(subItemAchieves);

        menuActualizar.add(jMenu2);

        jMenuBar4.add(menuActualizar);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        panel.setTipo(-1);
    }//GEN-LAST:event_selectMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        panel.setTipo(-2);
    }//GEN-LAST:event_removeMouseClicked

    private void agenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenteActionPerformed
         panel.setTipo(2);
    }//GEN-LAST:event_agenteActionPerformed

    private void cababilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cababilitiesActionPerformed
        panel.setTipo(3);
    }//GEN-LAST:event_cababilitiesActionPerformed

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed
        panel.setTipo(1);
    }//GEN-LAST:event_rolesActionPerformed

    private void goalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalsActionPerformed
        panel.setTipo(4);
    }//GEN-LAST:event_goalsActionPerformed

    private void possessesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_possessesActionPerformed
        panel.setTipo(5);
    }//GEN-LAST:event_possessesActionPerformed

    private void requiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requiresActionPerformed
        panel.setTipo(6);
    }//GEN-LAST:event_requiresActionPerformed

    private void achievesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achievesActionPerformed
        panel.setTipo(7);
    }//GEN-LAST:event_achievesActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemGuardarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarModeloActionPerformed
        
    }//GEN-LAST:event_itemGuardarModeloActionPerformed

    private void itemAbrirModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirModeloActionPerformed
        selectFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectFile.showOpenDialog(this);
        file=selectFile.getSelectedFile();
        if((file==null)||(file.getName().equals(""))){
           JOptionPane.showMessageDialog(this, "Nombre de archivo inválido", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_itemAbrirModeloActionPerformed

    private void subItemCababilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemCababilitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subItemCababilitiesActionPerformed

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
    private javax.swing.JButton achieves;
    private javax.swing.JButton agente;
    private javax.swing.JButton cababilities;
    private javax.swing.JPanel content;
    private javax.swing.JButton goals;
    private javax.swing.JMenuItem itemAbrirModelo;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenu itemElementos;
    private javax.swing.JMenuItem itemGuardarModelo;
    private javax.swing.JMenuItem itemNuevoModelo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuActualizar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JButton possesses;
    private javax.swing.JButton remove;
    private javax.swing.JButton requires;
    private javax.swing.JButton roles;
    private javax.swing.JButton select;
    private javax.swing.JMenuItem subItemAchieves;
    private javax.swing.JMenuItem subItemAgents;
    private javax.swing.JMenuItem subItemCababilities;
    private javax.swing.JMenuItem subItemGoals;
    private javax.swing.JMenuItem subItemPossesses;
    private javax.swing.JMenuItem subItemRequires;
    private javax.swing.JMenuItem subItemRoles;
    // End of variables declaration//GEN-END:variables
}
