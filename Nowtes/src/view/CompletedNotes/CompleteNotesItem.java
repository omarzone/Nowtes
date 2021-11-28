package view.CompletedNotes;

import view.PendingNotes.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class CompleteNotesItem extends javax.swing.JPanel {

    public CompleteNotesItem() {
        initComponents();
        jScrollPane1.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DataPanel = new javax.swing.JPanel();
        note_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note_description = new javax.swing.JTextArea();
        DatePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StatusPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ActionsPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        IconsRowPanel = new javax.swing.JPanel();
        btnDeleteNote = new javax.swing.JLabel();
        btnViewNote = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        DataPanel.setOpaque(false);
        DataPanel.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        note_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        note_title.setForeground(new java.awt.Color(29, 52, 97));
        note_title.setText("Diseñar el prototipo de la app");
        DataPanel.add(note_title);

        note_description.setEditable(false);
        note_description.setBackground(new java.awt.Color(255, 255, 255));
        note_description.setColumns(45);
        note_description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        note_description.setForeground(new java.awt.Color(31, 72, 126));
        note_description.setRows(2);
        note_description.setText("La tarea consiste en dibujar los primeros diseños de nuestra app para entregársela\nal profesor. El diseño se deberá guardar en PDF y enviárselo por correo sin olvidar..");
        note_description.setBorder(null);
        jScrollPane1.setViewportView(note_description);
        note_description.setHighlighter(null);

        DataPanel.add(jScrollPane1);

        add(DataPanel);

        DatePanel.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 52, 97));
        jLabel4.setText("Fecha");

        jLabel5.setBackground(new java.awt.Color(153, 212, 172));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 52, 97));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("28/abril/2021");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout DatePanelLayout = new javax.swing.GroupLayout(DatePanel);
        DatePanel.setLayout(DatePanelLayout);
        DatePanelLayout.setHorizontalGroup(
            DatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DatePanelLayout.setVerticalGroup(
            DatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(DatePanel);

        StatusPanel.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 52, 97));
        jLabel2.setText("Estatus");

        jLabel3.setBackground(new java.awt.Color(153, 212, 172));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 52, 97));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Finalizado");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(StatusPanel);

        ActionsPanel.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 52, 97));
        jLabel6.setText("Acción");

        IconsRowPanel.setOpaque(false);
        IconsRowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 19, 0));

        btnDeleteNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baseline_delete_black_24dp.png"))); // NOI18N
        btnDeleteNote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconsRowPanel.add(btnDeleteNote);

        btnViewNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconmonstr-eye-9.png"))); // NOI18N
        btnViewNote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconsRowPanel.add(btnViewNote);

        javax.swing.GroupLayout ActionsPanelLayout = new javax.swing.GroupLayout(ActionsPanel);
        ActionsPanel.setLayout(ActionsPanelLayout);
        ActionsPanelLayout.setHorizontalGroup(
            ActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionsPanelLayout.createSequentialGroup()
                .addGroup(ActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActionsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconsRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ActionsPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ActionsPanelLayout.setVerticalGroup(
            ActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(IconsRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(ActionsPanel);
    }// </editor-fold>//GEN-END:initComponents
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(15, 15); //Border corners arcs {width,height}, change this to whatever you want
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint border
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionsPanel;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JPanel DatePanel;
    private javax.swing.JPanel IconsRowPanel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JLabel btnDeleteNote;
    private javax.swing.JLabel btnViewNote;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea note_description;
    private javax.swing.JLabel note_title;
    // End of variables declaration//GEN-END:variables
}
