
package view.ViewCompleteNote;

import Model.Note;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ViewCompleteNote extends javax.swing.JPanel {


    public ViewCompleteNote() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        note_id = new javax.swing.JLabel();
        btnEditNote = new javax.swing.JButton();
        btnDeleteNote = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        roundedBorders1 = new view.components.RoundedBorders();
        note_priority = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        note_description = new javax.swing.JTextArea();
        note_title = new javax.swing.JLabel();
        note_date = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        note_status = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        note_id.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        note_id.setForeground(new java.awt.Color(255, 255, 255));
        note_id.setText("Nota #");

        btnEditNote.setBackground(new java.awt.Color(0, 0, 0));
        btnEditNote.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditNote.setForeground(new java.awt.Color(255, 255, 255));
        btnEditNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        btnEditNote.setText("Editar");
        btnEditNote.setFocusable(false);
        btnEditNote.setIconTextGap(5);
        btnEditNote.setMargin(new java.awt.Insets(5, 5, 5, 14));
        btnEditNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNoteActionPerformed(evt);
            }
        });

        btnDeleteNote.setBackground(new java.awt.Color(199, 0, 0));
        btnDeleteNote.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteNote.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnDeleteNote.setText("Eliminar");
        btnDeleteNote.setFocusable(false);
        btnDeleteNote.setIconTextGap(5);
        btnDeleteNote.setMargin(new java.awt.Insets(5, 5, 5, 14));
        btnDeleteNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(note_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(btnDeleteNote, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditNote)
                .addGap(14, 14, 14))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note_id)
                    .addComponent(btnEditNote)
                    .addComponent(btnDeleteNote, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1020, -1));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setOpaque(false);

        note_priority.setBackground(new java.awt.Color(254, 91, 107));
        note_priority.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        note_priority.setForeground(new java.awt.Color(29, 52, 97));
        note_priority.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        note_priority.setText("status");
        note_priority.setOpaque(true);
        roundedBorders1.add(note_priority, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 52, 97));
        jLabel3.setText("Estatus:");
        roundedBorders1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        note_description.setEditable(false);
        note_description.setBackground(new java.awt.Color(255, 255, 255));
        note_description.setColumns(20);
        note_description.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        note_description.setForeground(new java.awt.Color(31, 72, 126));
        note_description.setRows(5);
        note_description.setText("Description");
        note_description.setBorder(null);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setViewportView(note_description);

        roundedBorders1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 680, 230));

        note_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        note_title.setForeground(new java.awt.Color(29, 52, 97));
        note_title.setText("Title");
        roundedBorders1.add(note_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 680, -1));

        note_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        note_date.setForeground(new java.awt.Color(29, 52, 97));
        note_date.setText("00/00/0000");
        roundedBorders1.add(note_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 52, 97));
        jLabel7.setText("Prioridad:");
        roundedBorders1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(29, 52, 97));
        jLabel8.setText("Realizar antes de:");
        roundedBorders1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        note_status.setBackground(new java.awt.Color(245, 223, 83));
        note_status.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        note_status.setForeground(new java.awt.Color(29, 52, 97));
        note_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        note_status.setText("status");
        note_status.setOpaque(true);
        roundedBorders1.add(note_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 130, 40));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1020, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditNoteActionPerformed

    private void btnDeleteNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteNoteActionPerformed

    public JLabel getNote_date() {
        return note_date;
    }

    public void setNote_date(JLabel note_date) {
        this.note_date = note_date;
    }

    public JTextArea getNote_description() {
        return note_description;
    }

    public void setNote_description(JTextArea note_description) {
        this.note_description = note_description;
    }

    public JLabel getNote_id() {
        return note_id;
    }

    public void setNote_id(JLabel note_id) {
        this.note_id = note_id;
    }

    public JLabel getNote_priority() {
        return note_priority;
    }

    public void setNote_priority(JLabel note_priority) {
        this.note_priority = note_priority;
    }

    public JLabel getNote_status() {
        return note_status;
    }

    public void setNote_status(JLabel note_status) {
        this.note_status = note_status;
    }

    public JLabel getNote_title() {
        return note_title;
    }

    public void setNote_title(JLabel note_title) {
        this.note_title = note_title;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JButton btnDeleteNote;
    private javax.swing.JButton btnEditNote;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel note_date;
    private javax.swing.JTextArea note_description;
    private javax.swing.JLabel note_id;
    private javax.swing.JLabel note_priority;
    private javax.swing.JLabel note_status;
    private javax.swing.JLabel note_title;
    private view.components.RoundedBorders roundedBorders1;
    // End of variables declaration//GEN-END:variables
}
