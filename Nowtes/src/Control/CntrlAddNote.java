/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Note;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNote.AddNote;


/**
 *
 * @author polilxd
 */
public class CntrlAddNote implements ActionListener {
    private Note note;
    private CntrlMain cntrlMain;
    private CntrlPendingPanel cntrlPendingPanel;
    private AddNote addNotePanel;
    
    public CntrlAddNote (CntrlPendingPanel pendingPanel, CntrlMain cntrlMain){
        this.cntrlMain = cntrlMain;
        this.cntrlPendingPanel = pendingPanel;
        this.addNotePanel = cntrlPendingPanel.getAddNotePanel();
        
        addNotePanel.getBtnCancelar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(addNotePanel.getBtnCancelar() == e.getSource()){
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
      }
      
      /*
      if(addNotePanel.getBtnGuardar() == e.getSource()){
          note = new Note(addNotePanel.getTxtTitulo());
      }
      */
    }
    
    
}
