/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author polilxd
 */
public class CntrlSettings implements ActionListener {

    private CntrlMain cntrlMain;
    
    public CntrlSettings(CntrlMain cntrlMain) {
       this.cntrlMain = cntrlMain;
       
       
        cntrlMain.getSettingsView().getBtnDeleteData().addActionListener(this);
        cntrlMain.getSettingsView().getBtnDarkTheme().addActionListener(this);
        cntrlMain.getSettingsView().getCbmPriority().addActionListener(this);
        

    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (cntrlMain.getSettingsView().getBtnDeleteData() == e.getSource()) {
            System.out.println("Datos borrados");
        }
        
        if (cntrlMain.getSettingsView().getBtnDarkTheme() == e.getSource()) {
            System.out.println("Tema actualizado");
        }
        
        if (cntrlMain.getSettingsView().getCbmPriority() == e.getSource()) {
            System.out.println("Prioridad actualizada");
        }

        
    }
    
}
