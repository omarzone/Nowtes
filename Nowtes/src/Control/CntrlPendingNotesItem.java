package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.MainView;

public class CntrlPendingNotesItem implements MouseListener {

    private CntrlMain cntrlMain;
    private EditNote addEditNote = new EditNote();

    public CntrlPendingNotesItem(CntrlMain cntrlMain) {

        this.cntrlMain = cntrlMain;

       // cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnEditNote().addMouseListener(this);
        //cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnViewNote().addMouseListener(this);
       // cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnDeleteNote().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        if (cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnEditNote() == e.getSource()) {
//
//            cntrlMain.getMainView().getMainContent().removeAll();
//            cntrlMain.getMainView().getMainContent().add(addEditNote);
//            cntrlMain.getMainView().getMainContent().repaint();
//            cntrlMain.getMainView().getMainContent().revalidate();
//
//        }
//
//        if (cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnViewNote() == e.getSource()) {
//
//            System.out.println("Accion del boton ViewNote");
//
//        }
//
//        if (cntrlMain.getPendingNotesPanel().getPendingNotesItem1().getBtnDeleteNote() == e.getSource()) {
//
//            System.out.println("Accion del boton DeleteNote");
//
//        }
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
