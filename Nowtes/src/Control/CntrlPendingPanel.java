package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.CntrlMain;

import view.addNote.AddNote;
import view.PendingNotes.PendingNotesItem;

public class CntrlPendingPanel implements ActionListener {

    private AddNote addNotePanel = new AddNote();
    private CntrlMain cntrlMain;
    
    public CntrlPendingPanel(CntrlMain cntrlMain) {
       this.cntrlMain = cntrlMain;
       

        cntrlMain.getPendingNotesPanel().getBtnAddNote().addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (cntrlMain.getPendingNotesPanel().getBtnAddNote() == e.getSource()) {
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(this.addNotePanel);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();
        }
    }

    public AddNote getAddNotePanel() {

        return this.addNotePanel;
    }

    
    public PendingNotesItem getNoteItem(){
        return cntrlMain.getPendingNotesPanel().getPendingNotesItem1();
    }
}
