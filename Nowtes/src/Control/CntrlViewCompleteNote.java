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
    private CntrlPendingNotesItem cntrlPendingNotesItem;
    public CntrlViewCompleteNote(CntrlMain cntrlMain, ViewCompleteNote viewCompleteNote, Note note, CntrlPendingNotesItem cntrlPendingNotesItem){
        System.out.println("Controlador CntrlViewCompleteNote inicializado");
        this.cntrlMain = cntrlMain;
        this.note = note;
        this.viewCompleteNote = viewCompleteNote;
        this.cntrlPendingNotesItem = cntrlPendingNotesItem;
        
        
        //Seteamos la data en la vista
        setData();
        setTheme();
        viewCompleteNote.getBtnEditNote().addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if (viewCompleteNote.getBtnEditNote() == e.getSource()) {
            if(cntrlPendingNotesItem.getCntrlEditNote() == null){
                cntrlPendingNotesItem.setCntrlEditNote(new CntrlEditNote(cntrlMain,cntrlPendingNotesItem.getEditNotePanel(), note));
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(cntrlPendingNotesItem.getEditNotePanel());
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();

        }
        
    }
    
    public void setData(){
        viewCompleteNote.getNote_title().setText(note.getTitle());
        viewCompleteNote.getNote_description().setText(note.getDescription());
        viewCompleteNote.getNote_id().setText("Nota #"+note.getId());
        viewCompleteNote.getNote_date().setText(note.getDate());
        
        if(note.isStatus()){
            viewCompleteNote.getNote_status().setText("En proceso");
            viewCompleteNote.getNote_status().setBackground(new Color(245,223,83));
        }else{
            viewCompleteNote.getNote_status().setText("Finalizado");
            viewCompleteNote.getNote_status().setBackground(new Color(153,212,172));
        }
        
        this.setBGPriority(new Color(0, 187, 163), new Color(255, 163, 16), new Color(246, 91, 93));
       
    }
    
    
    private void setTheme(){
        this.viewCompleteNote.getRoundedInnerPanel().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.viewCompleteNote.getLblDate().setForeground(cntrlMain.getThemeApp().getFONT());
        this.viewCompleteNote.getLblPriority().setForeground(cntrlMain.getThemeApp().getFONT());
        this.viewCompleteNote.getLblStatus().setForeground(cntrlMain.getThemeApp().getFONT());
        
        
        
        if(cntrlMain.isDarkThemeOn()){
           this.viewCompleteNote.getNote_date().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.viewCompleteNote.getNote_title().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.viewCompleteNote.getNote_id().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.viewCompleteNote.getNote_description().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.viewCompleteNote.getNote_priority().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.viewCompleteNote.getNote_status().setForeground(cntrlMain.getThemeApp().getWHITE());
           this.setBGPriority(cntrlMain.getThemeApp().getLOW_STATUS(),cntrlMain.getThemeApp().getMEDIUM_STATUS(), cntrlMain.getThemeApp().getHIGHT_STATUS());
           this.viewCompleteNote.getNote_description().setBackground(new Color(48, 49, 52));

        }
        
        
    }
    
    public void setBGPriority(Color colorLOWP, Color colorMIP, Color colorHIGHP){
        if(note.getPriority() == 0) {
            viewCompleteNote.getNote_priority().setText("Baja");
            viewCompleteNote.getNote_priority().setBackground(colorLOWP);
        }else if (note.getPriority() == 1) {
            viewCompleteNote.getNote_priority().setText("Media");
            viewCompleteNote.getNote_priority().setBackground(colorMIP);
        }else {
            viewCompleteNote.getNote_priority().setText("Alta");
            viewCompleteNote.getNote_priority().setBackground(colorHIGHP);
        }
    }
    
}
