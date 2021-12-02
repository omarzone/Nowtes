package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import view.AddNote.AddNote;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.PendingNotes.PendingNotesPanel;



public class CntrlAddNote implements ActionListener {
    
    private Note note;
    private DAONote DaoNote = new DAONote();
    private CntrlMain cntrlMain;
    private CntrlPendingPanel cntrlPendingPanel;
    private AddNote addNotePanel;
    
    public CntrlAddNote (CntrlPendingPanel pendingPanel, CntrlMain cntrlMain){
        System.out.println("Controlador CntrlAddNote inicializado");
        this.cntrlMain = cntrlMain;
        this.cntrlPendingPanel = pendingPanel;
        this.addNotePanel = cntrlPendingPanel.getAddNotePanel();
        
        addNotePanel.getBtnCancelar().addActionListener(this);
        addNotePanel.getBtnGuardar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(addNotePanel.getBtnCancelar() == e.getSource()){
            
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
            //System.out.println("Acción Cancelar - Cambio a pantalla Home");
            
            addNotePanel.getTxtDescripcion().setText(null);
            addNotePanel.getTxtTitulo().setText(null);
            addNotePanel.getCbEndedTask().setSelected(false);
            addNotePanel.getOptionDate().setDate(null);
            addNotePanel.getCmbPriority().setSelectedIndex(0);
            addNotePanel.getTxtErrTitleField().setText(null);
            addNotePanel.getTxtErrDescriptionField().setText(null);
            addNotePanel.getTxtErrDateField().setText(null);
            
      }
      if(addNotePanel.getBtnGuardar() == e.getSource()){
          validateFields(addNotePanel);
           
      }
    }
    
    
    public void validateFields(AddNote addNotePanel){
        boolean hasTitle = false;
          boolean hasDescription = false;
          boolean hasDeadLine = false;
          String title = "";
          String description = "";
          SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
          int prioritySelected =  addNotePanel.getCmbPriority().getSelectedIndex();
          boolean deleteEndTaskOption = addNotePanel.getCbEndedTask().isSelected();
          String date = "";
          
          
          
           if(addNotePanel.getTxtTitulo().getText().equals("")){
               addNotePanel.getTxtErrTitleField().setText("Rellenar campo");
               hasTitle = false;
           }else{
               title = addNotePanel.getTxtTitulo().getText();
               addNotePanel.getTxtErrTitleField().setText(null);
               hasTitle = true;
           }
           
           if(addNotePanel.getTxtDescripcion().getText().equals("")){
               addNotePanel.getTxtErrDescriptionField().setText("Rellenar campo");
               hasDescription = false;
           }else{
               description = addNotePanel.getTxtDescripcion().getText();
               addNotePanel.getTxtErrDescriptionField().setText(null);
               hasDescription = true;
           }
           
           try{
                date = dcn.format(addNotePanel.getOptionDate().getDate());
                System.out.println(date);    
                hasDeadLine = true;
                if(date != null){
                    addNotePanel.getTxtErrDateField().setText("");
                }
           }catch(NullPointerException ex){
               addNotePanel.getTxtErrDateField().setText("Rellenar campo");
               hasDeadLine = false;
           }
           
           System.out.println(date);
           
           if(hasTitle && hasDescription && hasDeadLine){
               note = new Note(title, description, date, prioritySelected, deleteEndTaskOption, false);
               try{
                    DaoNote.add(note);
                    
                    PendingNotesPanel newPendingNotesPanel = new PendingNotesPanel();
                    cntrlPendingPanel = new CntrlPendingPanel(cntrlMain, newPendingNotesPanel);
                    
                    cntrlMain.setPendingNotesView(newPendingNotesPanel);
                    cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
                    
               }catch(SQLException ex){
                   JOptionPane.showMessageDialog(addNotePanel, "Hubo un error con el guardado de la nota");
                   System.err.println(ex);
               }
               
           }
    }
}


