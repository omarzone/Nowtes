/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.MainView;

/**
 *
 * @author polilxd
 */
public class CntrlPendingNotesItem implements MouseListener{
    
    CntrlMain cntrlMain;
    CntrlPendingPanel cntrlPendingPanel;
    EditNote addEditNote = new EditNote();

    public CntrlPendingNotesItem(CntrlPendingPanel cntrlPendingPanel, CntrlMain cntrlMain) {
        //super(mainView);
        this.cntrlMain = cntrlMain;
        this.cntrlPendingPanel = cntrlPendingPanel;
        
        cntrlPendingPanel.getNoteItem().getBtnEditNote().addMouseListener(this);
        

    }

   
    @Override
    public void mouseClicked(MouseEvent e) {
        if (cntrlPendingPanel.getNoteItem().getBtnEditNote() == e.getSource()) {

            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(addEditNote);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
