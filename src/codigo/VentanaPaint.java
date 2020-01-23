/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo;
import codigo.formas.Cuadrado;
import codigo.formas.Forma;
import codigo.formas.Pentagono;
import codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Sarita
 */
public class VentanaPaint extends javax.swing.JFrame {

    BufferedImage buffer = null;
    Graphics2D bufferGraphics, jpanelGraphics = null;
    Circulo miCirculo = null;
    Forma miForma = null;

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
    }

    private void inicializaBuffers() {
        //CREO UNA IMAGEN DEL MISMO ALTO Y ANCHO QUE EL JPANEL1
        buffer = (BufferedImage) VentanaPintar.createImage(VentanaPintar.getWidth(), VentanaPintar.getHeight());
        //CREO UNA IMAGEN MODIFICABLE
        bufferGraphics = buffer.createGraphics();
        //INICIALIZO EL BUFFER PARA QUE SE PINTE DE BLANCO ENTERO
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, VentanaPintar.getWidth(), VentanaPintar.getHeight());
        //ENLAZAMOS EL JPANEL1 CON EL JPANELGRAPHICS
        jpanelGraphics = (Graphics2D) VentanaPintar.getGraphics();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //PINTO EL BUFFER SOBRE EL JPANEL 
        jpanelGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPintar = new javax.swing.JPanel();
        panelDeColores1 = new codigo.PanelDeColores();
        jPanel1 = new javax.swing.JPanel();
        barraHerramientas2 = new codigo.BarraHerramientas();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        edit = new javax.swing.JMenu();
        edit1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPintar.setBackground(new java.awt.Color(255, 255, 255));
        VentanaPintar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VentanaPintar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                VentanaPintarMouseDragged(evt);
            }
        });
        VentanaPintar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentanaPintarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout VentanaPintarLayout = new javax.swing.GroupLayout(VentanaPintar);
        VentanaPintar.setLayout(VentanaPintarLayout);
        VentanaPintarLayout.setHorizontalGroup(
            VentanaPintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        VentanaPintarLayout.setVerticalGroup(
            VentanaPintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barraHerramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(barraHerramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        file.setText("File");
        jMenuBar1.add(file);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        edit1.setText("Help");
        jMenuBar1.add(edit1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VentanaPintar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panelDeColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(VentanaPintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDeColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentanaPintarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentanaPintarMouseDragged
        switch (barraHerramientas2.formaElegida) {
            case 0:
                bufferGraphics.setColor(panelDeColores1.colorSeleccionado);
                bufferGraphics.fillOval(evt.getX(), evt.getY(), 4, 4);
                break;
            case 1:
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_VentanaPintarMouseDragged

    private void VentanaPintarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentanaPintarMousePressed
        switch (barraHerramientas2.formaElegida) {
            case 0:
                break;
            case 1:
                miCirculo = new Circulo(evt.getX(), evt.getY(), 1,
                        panelDeColores1.colorSeleccionado, true);
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5,
                        panelDeColores1.colorSeleccionado, true);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4,
                        panelDeColores1.colorSeleccionado, true);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 3,
                        panelDeColores1.colorSeleccionado, true);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;

        }
    }//GEN-LAST:event_VentanaPintarMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VentanaPintar;
    private codigo.BarraHerramientas barraHerramientas2;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu edit1;
    private javax.swing.JMenu file;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private codigo.PanelDeColores panelDeColores1;
    // End of variables declaration//GEN-END:variables
}
