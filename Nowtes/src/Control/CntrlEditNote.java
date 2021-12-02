package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.EditNote.EditNote;

public class CntrlEditNote implements ActionListener {

    private Note note;
    private DAONote DaoNote = new DAONote();
    private CntrlMain cntrlMain;
    private CntrlPendingPanel cntrlPendingPanel;
    private EditNote editNotePanel;

    public CntrlEditNote(CntrlMain cntrlMain, EditNote editNotePanel, Note note) {
        System.out.println("Controlador CntrlAddNote inicializado");
        this.cntrlMain = cntrlMain;
        this.editNotePanel = editNotePanel;

        editNotePanel.getBtnCancel().addActionListener(this);
        editNotePanel.getBtnSave().addActionListener(this);

        editNotePanel.getTxtDescripcion().setText(note.getDescription());
        editNotePanel.getTxtTitulo().setText(note.getTitle());
        editNotePanel.getCbEndedTask().setSelected(note.isStatus());
        try {
            editNotePanel.getOptionDate().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(note.getDate()));
        } catch (ParseException ex) {
            //
        }
        editNotePanel.getCmbPriority().setSelectedIndex(0);
        editNotePanel.getTxtErrTitleField().setText(null);
        editNotePanel.getTxtErrDescriptionField().setText(null);
        editNotePanel.getTxtErrDateField().setText(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (editNotePanel.getBtnCancel() == e.getSource()) {

            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
//            editNotePanel.getTxtDescripcion().setText(null);
//            editNotePanel.getTxtTitulo().setText(null);
//            editNotePanel.getCbEndedTask().setSelected(false);
//            editNotePanel.getOptionDate().setDate(null);
//            editNotePanel.getCmbPriority().setSelectedIndex(0);
//            editNotePanel.getTxtErrTitleField().setText(null);
//            editNotePanel.getTxtErrDescriptionField().setText(null);
//            editNotePanel.getTxtErrDateField().setText(null);

        }

        if (editNotePanel.getBtnSave() == e.getSource()) {
            validateFields(editNotePanel);

        }
    }

    public void validateFields(EditNote editNotePanel) {
        boolean hasTitle = false;
        boolean hasDescription = false;
        boolean hasDeadLine = false;
        String title = "";
        String description = "";
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        int prioritySelected = editNotePanel.getCmbPriority().getSelectedIndex();
        boolean deleteEndTaskOption = editNotePanel.getCbEndedTask().isSelected();
        String date = "";

        if (editNotePanel.getTxtTitulo().getText().equals("")) {
            editNotePanel.getTxtErrTitleField().setText("Rellenar campo");
            hasTitle = false;
        } else {
            title = editNotePanel.getTxtTitulo().getText();
            editNotePanel.getTxtErrTitleField().setText(null);
            hasTitle = true;
        }

        if (editNotePanel.getTxtDescripcion().getText().equals("")) {
            editNotePanel.getTxtErrDescriptionField().setText("Rellenar campo");
            hasDescription = false;
        } else {
            description = editNotePanel.getTxtDescripcion().getText();
            editNotePanel.getTxtErrDescriptionField().setText(null);
            hasDescription = true;
        }

        try {
            date = dcn.format(editNotePanel.getOptionDate().getDate());
            System.out.println(date);
            hasDeadLine = true;
            if (date != null) {
                editNotePanel.getTxtErrDateField().setText("");
            }
        } catch (NullPointerException ex) {
            editNotePanel.getTxtErrDateField().setText("Rellenar campo");
            hasDeadLine = false;
        }

        System.out.println(date);

        if (hasTitle && hasDescription && hasDeadLine) {

            System.out.println("Todo Oki para la BD");

//            note = new Note(title, description, date, prioritySelected, deleteEndTaskOption, false);
//            try {
//                DaoNote.add(note);
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(editNotePanel, "Hubo un error con el guardado de la nota");
//                System.err.println(ex);
//            }
        }
    }

}
