/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AlertDialog.AlertDialog;

/**
 *
 * @author polilxd
 */
public class CntrlAlertDialog implements ActionListener {
    
    
    private AlertDialog alertDialog;
    public CntrlAlertDialog( AlertDialog alertDialog) {
       
       this.alertDialog = alertDialog;

        alertDialog.getBtnCancel().addActionListener(this);
        alertDialog.getBtnAcept().addActionListener(this);
        

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (alertDialog.getBtnCancel() == e.getSource()) {
            alertDialog.setVisible(false);
            alertDialog.dispose();
            System.out.println("Cancelado");
        }
        
        if (alertDialog.getBtnAcept() == e.getSource()) {
            alertDialog.setVisible(false);
            alertDialog.dispose();
            System.out.println("Aceptado");
        }
        
    }
    
}
