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
import Control.CntrlAddNote;
import Control.CntrlAlertDialog;
import Control.CntrlSettings;
import view.AlertDialog.AlertDialog;
/**
 *
 * @author PC GOOSE
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MainView mainView = new MainView();
       AlertDialog alertDialogView = new AlertDialog();
       //CntrlPendingPanel pendingPanel = new CntrlPendingPanel(xd);
       //CntrlMain menuControl = new CntrlMain(xd);
       //CntrlPendingNotesItem pendingNotesItem = new CntrlPendingNotesItem(xd);
       //CntrlAddNote addNote = new CntrlAddNote(xd, pendingPanel);
       
       
       CntrlMain cntrlMain = new CntrlMain(mainView);
       CntrlPendingPanel cntrlPendingPanel = new CntrlPendingPanel(cntrlMain);
       CntrlPendingNotesItem test = new CntrlPendingNotesItem(cntrlPendingPanel, cntrlMain);
       CntrlSettings settings = new CntrlSettings(cntrlMain);
       
       mainView.setVisible(true);
       mainView.setLocationRelativeTo(null);
    }
    
}
