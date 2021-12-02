package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.PendingNotes.PendingNotesItem;

import view.PendingNotes.PendingNotesPanel;

import view.AddNote.AddNote;
import view.components.CustomScrollBar;

public class CntrlPendingPanel implements ActionListener {

    private AddNote addNotePanel = new AddNote();
    private PendingNotesPanel pendingNotesView;
    private CntrlMain cntrlMain;

    private CntrlPendingNotesItem cntrlPendingNotesItem;
    private CntrlAddNote cntrlAddNote;
    private ArrayList<Note> notesList = new ArrayList<Note>();

    public CntrlPendingPanel(CntrlMain cntrlMain, PendingNotesPanel pendingNotesView) {
        System.out.println("Controlador CntrlPendingPanel inicializado");
        this.pendingNotesView = pendingNotesView;
        this.cntrlMain = cntrlMain;
        
        
        this.cntrlAddNote = new  CntrlAddNote(this,cntrlMain);
        

        
        pendingNotesView.getBtnAddNote().addActionListener(this);

        //Nuevo
        generateData();
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

    public void generateData() {
        //Realizamos la consulta a la base de datos
        DAONote daoNote = new DAONote();
        try {
            notesList = daoNote.query(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Creamos el scroll y seteamos propiedades
        JScrollPane scrollListNotes = new JScrollPane();
        scrollListNotes.setOpaque(false);
        scrollListNotes.getViewport().setOpaque(false);
        scrollListNotes.setViewportBorder(null);
        scrollListNotes.setBorder(null);
        scrollListNotes.setVerticalScrollBar(new CustomScrollBar());

        //Creamos el Panel y el gridLayout  que estara dentro del scroll
        JPanel gridNotePanel = new JPanel();
        gridNotePanel.setOpaque(false);
        GridLayout gridLayoutNotes = new GridLayout();
        gridLayoutNotes.setColumns(1);
        gridLayoutNotes.setVgap(15);
        gridLayoutNotes.setRows(notesList.size());

        gridNotePanel.setLayout(gridLayoutNotes);

        //Por cada item en el arraylist, agregamos un row al gridNotePanel
        for (Note note : notesList) {
            
            PendingNotesItem noteItemView = new PendingNotesItem(note);
            CntrlPendingNotesItem cntrlPendingNotesItem = new CntrlPendingNotesItem(cntrlMain,noteItemView);
            gridNotePanel.add(noteItemView);
        }
        
        
        //seteamos la vista que estara dentro del scroll
        scrollListNotes.setViewportView(gridNotePanel);
        
        //Agregamos el scroll al ContentPanel
        pendingNotesView.getContentPanel().add(scrollListNotes);
    }

}
