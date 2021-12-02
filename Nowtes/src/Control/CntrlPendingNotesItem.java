package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.MainView;

public class CntrlPendingNotesItem implements MouseListener {

    private CntrlMain cntrlMain;
    private EditNote addEditNote = new EditNote();
    private PendingNotesItem pendingNotesItemView;

    public CntrlPendingNotesItem(CntrlMain cntrlMain, PendingNotesItem pendingNotesItemView) {

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

            System.out.println("Accion del boton ViewNote: " + pendingNotesItemView.getNote_title().getText());

        }

        if (pendingNotesItemView.getBtnDeleteNote() == e.getSource()) {

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
