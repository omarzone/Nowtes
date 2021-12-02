package Control;

import Model.Note;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewCompleteNote.ViewCompleteNote;


public class CntrlViewCompleteNote implements ActionListener {
    private CntrlMain cntrlMain;
    private Note note;
    private ViewCompleteNote viewCompleteNote;
    public CntrlViewCompleteNote(CntrlMain cntrolMain, ViewCompleteNote viewCompleteNote, Note note){
        System.out.println("Controlador CntrlViewCompleteNote inicializado");
        this.cntrlMain = cntrlMain;
        this.note = note;
        this.viewCompleteNote = viewCompleteNote;
        
        
        //Seteamos la data en la vista
        setData();
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setData(){
        viewCompleteNote.getNote_title().setText(note.getTitle());
        viewCompleteNote.getNote_description().setText(note.getDescription());
        viewCompleteNote.getNote_id().setText("Nota #0000");
        viewCompleteNote.getNote_date().setText(note.getDate());
        
        if(note.isStatus()){
            viewCompleteNote.getNote_status().setText("En proceso");
            viewCompleteNote.getNote_status().setBackground(new Color(245,223,83));
        }else{
            viewCompleteNote.getNote_status().setText("Finalizado");
            viewCompleteNote.getNote_status().setBackground(new Color(153,212,172));
        }
        
        if(note.getPriority() == 0){
            viewCompleteNote.getNote_priority().setText("Baja");
            viewCompleteNote.getNote_priority().setBackground(new Color(0,187,163));
        }else if(note.getPriority()== 1){
            viewCompleteNote.getNote_priority().setText("Media");
            viewCompleteNote.getNote_priority().setBackground(new Color(255,163,16));
        }else{
            viewCompleteNote.getNote_priority().setText("Alta");
            viewCompleteNote.getNote_priority().setBackground(new Color(246,91,93));
        }
    }
    
}
