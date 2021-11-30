/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.addNote.AddNote;
import view.MainView;
import view.PendingNotes.PendingNotesPanel;

/**
 *
 * @author polilxd
 */
public class CntrlAddNote extends AddNote implements ActionListener {
    
    private MainView mainView;
    private CntrlPendingPanel cntrlPendingPanel;
    private PendingNotesPanel pendingPanel;
    
    public CntrlAddNote (MainView mainView, CntrlPendingPanel cntrlPendingPanel, PendingNotesPanel pendingPanel){
        
        this.mainView = mainView;
        this.cntrlPendingPanel = cntrlPendingPanel;
        this.pendingPanel  = pendingPanel;
        
        cntrlPendingPanel.getAddNotePanel().getBtnCancelar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(cntrlPendingPanel.getAddNotePanel().getBtnCancelar() == e.getSource()){
            mainView.getMainContent().removeAll();
            mainView.getMainContent().add(this.pendingPanel);
            mainView.getMainContent().repaint();
            mainView.getMainContent().revalidate();
            System.out.println("xd");
      }
    }
    
    
}
