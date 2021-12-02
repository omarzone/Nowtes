package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNote.AddNote;


public class CntrlAddNote implements ActionListener {
    
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
            System.out.println("Acción Cancelar - Cambio a pantalla Home");
      }
      if(addNotePanel.getBtnGuardar() == e.getSource()){
            
            if(validateData()){
                cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
                System.out.println("Nota guardada");
            }else{
                System.out.println("No se pudo guardar, verificar datos de la nota");
            }
            
      }
    }
    
    
    public boolean validateData(){
        return false;
    }
    
    
}
