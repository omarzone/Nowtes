package view.EditNote;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EditNote extends javax.swing.JPanel {


    public EditNote() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
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
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtErrTitleField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtErrDescriptionField = new javax.swing.JLabel();
        txtErrDateField = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(130, 156, 188));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1037, 714));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(930, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1020, -1));

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
        optionDate.setForeground(new java.awt.Color(0, 0, 0));
        roundedBorders1.add(optionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, -1));

        cbEndedTask.setForeground(new java.awt.Color(0, 0, 0));
        cbEndedTask.setText("Borrar la tarea al cambiar el estado por \"Finalizada\"     ");
        roundedBorders1.add(cbEndedTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        btnSave.setBackground(new java.awt.Color(31, 72, 126));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Guardar");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedBorders1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 80, 30));

        btnCancel.setBackground(new java.awt.Color(254, 91, 107));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedBorders1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, 30));

        txtErrTitleField.setForeground(new java.awt.Color(255, 51, 51));
        roundedBorders1.add(txtErrTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 90, 20));
        roundedBorders1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 50, 20));

        txtErrDescriptionField.setForeground(new java.awt.Color(255, 0, 0));
        roundedBorders1.add(txtErrDescriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 90, 30));

        txtErrDateField.setForeground(new java.awt.Color(255, 0, 0));
        roundedBorders1.add(txtErrDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, 20));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addComponent(roundedBorders1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1020, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbEndedTask;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser optionDate;
    private view.components.RoundedBorders roundedBorders1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JLabel txtErrDateField;
    private javax.swing.JLabel txtErrDescriptionField;
    private javax.swing.JLabel txtErrTitleField;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

 
    
    
   

    public JCheckBox getCbEndedTask() {
        return cbEndedTask;
    }

    public JComboBox<String> getCmbPriority() {
        return cmbPriority;
    }

    public JTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public JLabel getTxtErrDateField() {
        return txtErrDateField;
    }

    public JLabel getTxtErrDescriptionField() {
        return txtErrDescriptionField;
    }

    public JLabel getTxtErrTitleField() {
        return txtErrTitleField;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }
    

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }

    public JDateChooser getOptionDate() {
        return optionDate;
    }
    
    
    

}
