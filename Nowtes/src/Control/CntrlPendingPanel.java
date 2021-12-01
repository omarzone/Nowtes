package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import view.PendingNotes.PendingNotesItem;

import view.PendingNotes.PendingNotesPanel;

import view.addNote.AddNote;

public class CntrlPendingPanel implements ActionListener {

    private AddNote addNotePanel = new AddNote();
    private PendingNotesPanel pendingNotesView;
    private CntrlMain cntrlMain;

    private CntrlPendingNotesItem cntrlPendingNotesItem;
    private DefaultListModel<Note> listModel = new DefaultListModel<>();

    public CntrlPendingPanel(CntrlMain cntrlMain, PendingNotesPanel pendingNotesView) {

        this.pendingNotesView = pendingNotesView;
        this.cntrlMain = cntrlMain;

        System.out.println("Controlador CntrlPendingNotesItem inicializado");
        this.cntrlPendingNotesItem = new CntrlPendingNotesItem(cntrlMain);
        pendingNotesView.getBtnAddNote().addActionListener(this);

        //Nuevo
        ArrayList<Note> notesList = new ArrayList<Note>();

        DAONote daoNote = new DAONote();
        try {
            notesList = daoNote.query(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Note note : notesList) {
            listModel.addElement(note);
        }
        
        
        JList<Note> lista = new JList<>(listModel);
        lista.setOpaque(false);
        lista.setBorder(null);
       // lista.setFixedCellHeight(130);
        lista.setCellRenderer(new PendingNotesItem());
        JScrollPane scrollListNotes = new JScrollPane(lista);
        scrollListNotes.setOpaque(false);
        scrollListNotes.getViewport().setOpaque(false);
        scrollListNotes.setViewportBorder(null);
        //scrollListNotes.setViewport(lista);
        pendingNotesView.getContentPanel().add(scrollListNotes);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pendingNotesView.getBtnAddNote() == e.getSource()) {
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(addNotePanel);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();
        }
    }

    public AddNote getAddNotePanel() {

        return this.addNotePanel;
    }

}
