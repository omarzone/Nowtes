package Control;

import DAONote.DAOSettings;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CntrlSettings implements ActionListener {
    
    private CntrlMain cntrlMain;
    private DAOSettings daoSetting = new DAOSettings();
    public CntrlSettings(CntrlMain cntrlMain) {
        System.out.println("Controlador CntrlSettings inicializado");
        this.cntrlMain = cntrlMain;

        cntrlMain.getSettingsView().getBtnDeleteData().addActionListener(this);
        cntrlMain.getSettingsView().getBtnDarkTheme().addActionListener(this);
        cntrlMain.getSettingsView().getCbmPriority().addActionListener(this);
        
        cntrlMain.getSettingsView().getBtnDarkTheme().setSelected(cntrlMain.isDarkThemeOn());
        
        //seteamos el Texto del darkThemeSettings
        if(cntrlMain.isDarkThemeOn()){
            cntrlMain.getSettingsView().getBtnDarkTheme().setText("Activado");
        }else{
            cntrlMain.getSettingsView().getBtnDarkTheme().setText("Desactivado");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (cntrlMain.getSettingsView().getBtnDeleteData() == e.getSource()) {
            System.out.println("Datos borrados");
        }

        if (cntrlMain.getSettingsView().getBtnDarkTheme() == e.getSource()) {
            
           if(cntrlMain.getSettingsView().getBtnDarkTheme().isSelected()){
               cntrlMain.getSettingsView().getBtnDarkTheme().setText("Activado");
               
               try{
                   daoSetting.modify(cntrlMain.getSettingsView().getBtnDarkTheme().isSelected());
               }catch(SQLException ex){
                   System.out.println(ex);
               }
               
           }else{
               cntrlMain.getSettingsView().getBtnDarkTheme().setText("Desactivado");
               try{
                   daoSetting.modify(cntrlMain.getSettingsView().getBtnDarkTheme().isSelected());
               }catch(Exception ex){
                   System.out.println(ex);
               }
           }
        }

        if (cntrlMain.getSettingsView().getCbmPriority() == e.getSource()) {
            System.out.println("Prioridad actualizada");
        }

    }

}
