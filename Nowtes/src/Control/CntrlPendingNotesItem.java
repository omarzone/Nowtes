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
public class CntrlPendingNotesItem extends PendingNotesItem implements MouseListener{
    
    private MainView mainView;
    EditNote addEditNote = new EditNote();
    
    
    
    
    public CntrlPendingNotesItem (MainView mainView){
        
        this.mainView = mainView;
        
        mainView.getPendingNotePanel().getPendingNotesItem1().getBtnEditNote().addMouseListener(this);
        
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(mainView.getPendingNotePanel().getPendingNotesItem1().getBtnEditNote() == e.getSource()){
            //System.out.println("xd");
            mainView.getMainContent().removeAll();
            mainView.getMainContent().add(addEditNote);
            mainView.getMainContent().repaint();
            mainView.getMainContent().revalidate();
            
        }
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
