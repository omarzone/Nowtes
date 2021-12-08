package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.PendingNotes.PendingNotesItem;

import view.PendingNotes.PendingNotesPanel;

import view.AddNote.AddNote;
import view.PendingNotes.SearchPanel;
import view.components.CustomScrollBar;

public class CntrlPendingPanel implements ActionListener, MouseListener {

    private AddNote addNotePanel = new AddNote();
    private PendingNotesPanel pendingNotesView;
    private CntrlMain cntrlMain;
    private SearchPanel searchPanelView;
    private CntrlPendingNotesItem cntrlPendingNotesItem;
    private CntrlAddNote cntrlAddNote;
    private ArrayList<Note> notesList = new ArrayList<Note>();

    public CntrlPendingPanel(CntrlMain cntrlMain, PendingNotesPanel pendingNotesView) {
        System.out.println("Controlador CntrlPendingPanel inicializado");
        this.pendingNotesView = pendingNotesView;
        this.cntrlMain = cntrlMain;
        
        
        this.cntrlAddNote = new  CntrlAddNote(this,cntrlMain);
        

        
        pendingNotesView.getBtnAddNote().addActionListener(this);
        pendingNotesView.getBtnSearch().addMouseListener(this);
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
            notesList = daoNote.query("status = false");
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
        scrollListNotes.getVerticalScrollBar().setUnitIncrement(16);

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
            
            PendingNotesItem noteItemView = new PendingNotesItem();
            noteItemView.setBackground(cntrlMain.getThemeApp().getNOTE_BG());
            CntrlPendingNotesItem cntrlPendingNotesItem = new CntrlPendingNotesItem(cntrlMain,noteItemView,note);
            gridNotePanel.add(noteItemView);
            
        }
        
        
        
        //seteamos la vista que estara dentro del scroll
        scrollListNotes.setViewportView(gridNotePanel);
        
        //Agregamos el scroll al ContentPanel
        pendingNotesView.getContentPanel().add(scrollListNotes);
    }

    public void setPendingNotesView(PendingNotesPanel pendingNotesView) {
        this.pendingNotesView = pendingNotesView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (pendingNotesView.getBtnSearch() == e.getSource()) {

            ArrayList<Note> searchResults = new ArrayList<Note>();
            String searchTitle = pendingNotesView.getTxtSearch().getText();
            DAONote daoNote = new DAONote();
            try {
                searchResults = daoNote.querySearch(searchTitle);
            } catch (Exception ee) {
                ee.printStackTrace();
            }
            //Creamos el scroll y seteamos propiedades
            JScrollPane scrollListNotes = new JScrollPane();
            scrollListNotes.setOpaque(false);
            scrollListNotes.getViewport().setOpaque(false);
            scrollListNotes.setViewportBorder(null);
            scrollListNotes.setBorder(null);
            scrollListNotes.setVerticalScrollBar(new CustomScrollBar());
            scrollListNotes.getVerticalScrollBar().setUnitIncrement(16);

            //Creamos el Panel y el gridLayout  que estara dentro del scroll
            JPanel gridNotePanel = new JPanel();
            gridNotePanel.setOpaque(false);
            GridLayout gridLayoutNotes = new GridLayout();
            gridLayoutNotes.setColumns(1);
            gridLayoutNotes.setVgap(15);
            gridLayoutNotes.setRows(searchResults.size());

            gridNotePanel.setLayout(gridLayoutNotes);
            for (Note note : searchResults) {

                PendingNotesItem noteItemView = new PendingNotesItem();
                CntrlPendingNotesItem cntrlPendingNotesItem = new CntrlPendingNotesItem(cntrlMain, noteItemView, note);
                gridNotePanel.add(noteItemView);
                //System.out.println(note.getTitle());

            }
            //System.out.println(searchResults.size());
             //seteamos la vista que estara dentro del scroll
            scrollListNotes.setViewportView(gridNotePanel);
            this.searchPanelView = new SearchPanel(); 
            //Agregamos el scroll al ContentPanel
            searchPanelView.getContentPanel().add(scrollListNotes);
            searchPanelView.getResultsLabel().setText("Resultados de: "+ searchTitle);
            CntrlSearchPanel cntrlSearchPanel = new CntrlSearchPanel(cntrlMain, searchPanelView);
            cntrlMain.switchPanels(searchPanelView);
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    

}
