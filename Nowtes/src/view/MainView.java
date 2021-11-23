/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.CompletedNotes.CompletedNotesPanel;
import view.PendingNotes.PendingNotesPanel;

/**
 *
 * @author PC
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        PendingNotesPanel test = new PendingNotesPanel();
        
        
        //Codigo para probar el panel PendingNotes
//        jPanel2.removeAll();
        jPanel2.add(test);
//        jPanel2.revalidate();
//        jPanel2.repaint();
        // Finaliza codigo para probar el panel PendingNotes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        CustomSeparator = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        CustomSeparator1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        CustomSeparator2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        CustomSeparator3 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nowtes");
        setPreferredSize(new java.awt.Dimension(1209, 727));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(31, 72, 126));
        jButton1.setText("Inicio");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        CustomSeparator.setBackground(new java.awt.Color(255, 255, 255));
        CustomSeparator.setPreferredSize(new java.awt.Dimension(140, 9));

        javax.swing.GroupLayout CustomSeparatorLayout = new javax.swing.GroupLayout(CustomSeparator);
        CustomSeparator.setLayout(CustomSeparatorLayout);
        CustomSeparatorLayout.setHorizontalGroup(
            CustomSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        CustomSeparatorLayout.setVerticalGroup(
            CustomSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomSeparatorLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(CustomSeparator);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(31, 72, 126));
        jButton2.setText("Historial");
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(160, 40));
        jPanel1.add(jButton2);

        CustomSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        CustomSeparator1.setPreferredSize(new java.awt.Dimension(140, 9));

        javax.swing.GroupLayout CustomSeparator1Layout = new javax.swing.GroupLayout(CustomSeparator1);
        CustomSeparator1.setLayout(CustomSeparator1Layout);
        CustomSeparator1Layout.setHorizontalGroup(
            CustomSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        CustomSeparator1Layout.setVerticalGroup(
            CustomSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomSeparator1Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(CustomSeparator1);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(31, 72, 126));
        jButton3.setText("Ayuda");
        jButton3.setBorderPainted(false);
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(160, 40));
        jPanel1.add(jButton3);

        CustomSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        CustomSeparator2.setPreferredSize(new java.awt.Dimension(140, 9));

        javax.swing.GroupLayout CustomSeparator2Layout = new javax.swing.GroupLayout(CustomSeparator2);
        CustomSeparator2.setLayout(CustomSeparator2Layout);
        CustomSeparator2Layout.setHorizontalGroup(
            CustomSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        CustomSeparator2Layout.setVerticalGroup(
            CustomSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomSeparator2Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(CustomSeparator2);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(31, 72, 126));
        jButton4.setText("Configuración");
        jButton4.setBorderPainted(false);
        jButton4.setFocusable(false);
        jButton4.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        CustomSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        CustomSeparator3.setPreferredSize(new java.awt.Dimension(140, 9));

        javax.swing.GroupLayout CustomSeparator3Layout = new javax.swing.GroupLayout(CustomSeparator3);
        CustomSeparator3.setLayout(CustomSeparator3Layout);
        CustomSeparator3Layout.setHorizontalGroup(
            CustomSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        CustomSeparator3Layout.setVerticalGroup(
            CustomSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomSeparator3Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(CustomSeparator3);

        jPanel2.setBackground(new java.awt.Color(130, 156, 188));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomSeparator;
    private javax.swing.JPanel CustomSeparator1;
    private javax.swing.JPanel CustomSeparator2;
    private javax.swing.JPanel CustomSeparator3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}