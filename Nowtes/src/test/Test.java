/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import view.MainView;
import Control.CntrlPendingPanel;
import Control.CntrlMain;
import Control.CntrlPendingNotesItem;
/**
 *
 * @author PC GOOSE
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MainView xd = new MainView();
       CntrlPendingPanel pendingPanel = new CntrlPendingPanel(xd);
       CntrlMain menuControl = new CntrlMain(xd);
       CntrlPendingNotesItem pendingNotesItem = new CntrlPendingNotesItem(xd);
       
       xd.setVisible(true);
       xd.setLocationRelativeTo(null);
    }
    
}
