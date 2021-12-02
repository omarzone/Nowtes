package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNote.AddNote;
import view.MainView;
import view.PendingNotes.PendingNotesPanel;


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
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(addNotePanel.getBtnCancelar() == e.getSource()){
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
            System.out.println("Acción Cancelar - Cambio a pantalla Home");
      }
    }
    
    
}
