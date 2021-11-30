package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainView;

import view.addNote.AddNote;

public class CntrlPendingPanel extends CntrlMain implements ActionListener {

    private AddNote addNotePanel = new AddNote();
    
    public CntrlPendingPanel(MainView mainView) {
        super(mainView);
        

        getPendingNotesPanel().getBtnAddNote().addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getPendingNotesPanel().getBtnAddNote() == e.getSource()) {
            getMainView().getMainContent().removeAll();
            getMainView().getMainContent().add(addNotePanel);
            getMainView().getMainContent().repaint();
            getMainView().getMainContent().revalidate();
        }
    }

    public AddNote getAddNotePanel() {

        return this.addNotePanel;
    }

}
