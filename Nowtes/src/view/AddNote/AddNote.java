package view.AddNote;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddNote extends javax.swing.JPanel {

    public AddNote() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelAddNote = new javax.swing.JPanel();
        HeadPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        roundedBorders1 = new view.components.RoundedBorders();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        cmbPriority = new javax.swing.JComboBox<>();
        optionDate = new com.toedter.calendar.JDateChooser();
        cbEndedTask = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        JPanelAddNote.setBackground(new java.awt.Color(130, 156, 188));
        JPanelAddNote.setPreferredSize(new java.awt.Dimension(1037, 714));
        JPanelAddNote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Añadir Nota");

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(841, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JPanelAddNote.add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1020, -1));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Prioridad:");
        roundedBorders1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Título:");
        roundedBorders1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción:");
        roundedBorders1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha:");
        roundedBorders1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(130, 156, 188));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 72, 126), 1, true));
        jScrollPane2.setViewportView(txtDescripcion);

        roundedBorders1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 680, 230));

        txtTitulo.setBackground(new java.awt.Color(130, 156, 188));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 72, 126), 1, true));
        roundedBorders1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 680, 40));

        cmbPriority.setBackground(new java.awt.Color(130, 156, 188));
        cmbPriority.setForeground(new java.awt.Color(255, 255, 255));
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja", "media", "alta" }));
        cmbPriority.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 72, 126), 1, true));
        roundedBorders1.add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        optionDate.setBackground(new java.awt.Color(130, 156, 188));
        roundedBorders1.add(optionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, -1));

        cbEndedTask.setForeground(new java.awt.Color(0, 0, 0));
        cbEndedTask.setText("Borrar la tarea al cambiar el estado por \"Finalizada\"     ");
        roundedBorders1.add(cbEndedTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(31, 72, 126));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedBorders1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 80, 30));

        btnCancelar.setBackground(new java.awt.Color(254, 91, 107));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedBorders1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, 30));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        JPanelAddNote.add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1020, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanelAddNote, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanelAddNote, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JPanel JPanelAddNote;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cbEndedTask;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser optionDate;
    private view.components.RoundedBorders roundedBorders1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JCheckBox getCbEndedTask() {
        return cbEndedTask;
    }

    public JComboBox<String> getCmbPriority() {
        return cmbPriority;
    }

    public JDateChooser getOptionDate() {
        return optionDate;
    }

    public JTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    


}
