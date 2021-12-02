package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.AlertDialog.AlertDialog;
import view.CompletedNote.ViewCompleteNote;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;

public class CntrlPendingNotesItem implements MouseListener {
    
    private CntrlMain cntrlMain;
    private EditNote addEditNote = new EditNote();
    private PendingNotesItem pendingNotesItemView;
    AlertDialog alertDialog = new AlertDialog();
    CntrlAlertDialog cntrlAlertDialog;
    ViewCompleteNote viewCompleteNote = new ViewCompleteNote();

    public CntrlPendingNotesItem(CntrlMain cntrlMain, PendingNotesItem pendingNotesItemView) {
        System.out.println("Controlador CntrlPendingNotesItem inicializado");
        this.cntrlMain = cntrlMain;
        this.pendingNotesItemView = pendingNotesItemView;
        pendingNotesItemView.getBtnEditNote().addMouseListener(this);
        pendingNotesItemView.getBtnViewNote().addMouseListener(this);
        pendingNotesItemView.getBtnDeleteNote().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (pendingNotesItemView.getBtnEditNote() == e.getSource()) {

            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(addEditNote);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();

        }

        if (pendingNotesItemView.getBtnViewNote() == e.getSource()) {

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

            alertDialog.setVisible(true);
            alertDialog.setLocationRelativeTo(null);
            System.out.println("Accion del boton DeleteNote: " + pendingNotesItemView.getNote_title().getText());;

        }
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
