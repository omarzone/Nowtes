package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.AlertDialog.AlertDialog;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.ViewCompleteNote.ViewCompleteNote;

public class CntrlPendingNotesItem implements MouseListener {

    private CntrlMain cntrlMain;
    private EditNote editNotePanel = new EditNote();
    private PendingNotesItem pendingNotesItemView;
    private Note note;
    private AlertDialog alertDialog = new AlertDialog();
    private CntrlAlertDialog cntrlAlertDialog;
    private ViewCompleteNote viewCompleteNote = new ViewCompleteNote();
    private CntrlViewCompleteNote cntrlViewCompleteNote;
    private CntrlEditNote cntrlEditNote;

    public CntrlPendingNotesItem(CntrlMain cntrlMain, PendingNotesItem pendingNotesItemView, Note note) {
        System.out.println("Controlador CntrlPendingNotesItem inicializado");
        this.cntrlMain = cntrlMain;
        this.pendingNotesItemView = pendingNotesItemView;
        this.note = note;
        //Seteamos data en la vista
        setData();

        //Inicializamos los listeners
        pendingNotesItemView.getBtnEditNote().addMouseListener(this);
        pendingNotesItemView.getBtnViewNote().addMouseListener(this);
        pendingNotesItemView.getBtnDeleteNote().addMouseListener(this);

    }
    
    public EditNote getEditNotePanel() {
        return editNotePanel;
    }

    public void setCntrlEditNote(CntrlEditNote cntrlEditNote) {
        this.cntrlEditNote = cntrlEditNote;
    }

    public CntrlEditNote getCntrlEditNote() {
        return cntrlEditNote;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (pendingNotesItemView.getBtnEditNote() == e.getSource()) {

            if (cntrlEditNote == null) {
                cntrlEditNote = new CntrlEditNote(cntrlMain, editNotePanel, note);
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(editNotePanel);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();

        }

        if (pendingNotesItemView.getBtnViewNote() == e.getSource()) {


            if(cntrlViewCompleteNote == null){
                cntrlViewCompleteNote = new CntrlViewCompleteNote(cntrlMain,viewCompleteNote, note, this);
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(viewCompleteNote);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();
            System.out.println("Accion del boton ViewNote: " + pendingNotesItemView.getNote_title().getText());

        }

        if (pendingNotesItemView.getBtnDeleteNote() == e.getSource()) {
            if (cntrlAlertDialog == null) {

                cntrlAlertDialog = new CntrlAlertDialog(alertDialog);

            }
            String condition;
            condition = " id = " + note.getId();
//            DAONote daoCliente = new DAONote();
//            try {
//                daoCliente.delete(condition);
//            } catch (Exception exep) {
//                exep.printStackTrace();
//            }

            alertDialog.setVisible(true);
            alertDialog.setLocationRelativeTo(null);
            System.out.println("Accion del boton DeleteNote: " + pendingNotesItemView.getNote_title().getText());;

        }
    }

    public void setData() {
        pendingNotesItemView.getNote_title().setText(note.getTitle());
        pendingNotesItemView.getNote_description().setText(note.getDescription());

        if (note.isStatus()) {
            pendingNotesItemView.getNote_status().setText("En proceso");
            pendingNotesItemView.getNote_status().setBackground(new Color(245, 223, 83));
        } else {
            pendingNotesItemView.getNote_status().setText("Finalizado");
            pendingNotesItemView.getNote_status().setBackground(new Color(153, 212, 172));
        }

        pendingNotesItemView.getNote_date().setText(note.getDate());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
