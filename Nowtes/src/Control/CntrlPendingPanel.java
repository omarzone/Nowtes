/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.PendingNotes.PendingNotesPanel;
import view.addNote.AddNote;
import view.MainView;


/**
 *
 * @author PC GOOSE
 */
public class CntrlPendingPanel extends PendingNotesPanel implements ActionListener{
    AddNote addNotePanel = new AddNote();
    
    MainView mainView;
    PendingNotesPanel pendingNotes = new PendingNotesPanel();
    
    
    public CntrlPendingPanel(MainView mainView){
        //this.pendingNotes = pendingNotes;
        this.mainView = mainView;
        
        mainView.getPendingNotePanel().getBtnAddNote().addActionListener(this);
        
       
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(mainView.getPendingNotePanel().getBtnAddNote() == e.getSource()){
            mainView.getMainContent().removeAll();
            mainView.getMainContent().add(addNotePanel);
            mainView.getMainContent().repaint();
            mainView.getMainContent().revalidate();
        }
    }
    
    
    
    
}
