
package Control;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import view.CompletedNotes.CompleteNotesPanel;
import view.Help.Help;
import view.MainView;
import view.PendingNotes.PendingNotesPanel;
import view.Settings.Settings;


public class CntrlMain extends MainView implements MouseListener, MouseMotionListener{
    private int xMouse, yMouse;
    private MainView mainView;
    
    private PendingNotesPanel pendingNotes = new PendingNotesPanel();
    private CompleteNotesPanel completeNotes = new CompleteNotesPanel();
    private Help helpView = new Help(); 
    private Settings settingsView = new Settings();
     
    
    
    public CntrlMain(MainView mainView){
        this.mainView = mainView;
        mainView.getMainContent().add(pendingNotes);
        
        mainView.getMinimizeWindow().addMouseListener(this);
        mainView.getCloseWindow().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(mainView.getCloseWindow() == e.getSource()){
           mainView.dispatchEvent(new WindowEvent(mainView, WindowEvent.WINDOW_CLOSING));
        }
        
        if(mainView.getMinimizeWindow() == e.getSource()){
            mainView.setState(mainView.ICONIFIED);
        }
        
        if(mainView.getBtnHome() == e.getSource()){
            switchPanels(pendingNotes);
        }
        
        if(mainView.getBtnHelp() == e.getSource()){
            switchPanels(helpView);
        }
        
        if(mainView.getBtnHistory() == e.getSource()){
            switchPanels(completeNotes);
        }
        
        if(mainView.getBtnSettings() == e.getSource()){
            switchPanels(settingsView);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        xMouse = e.getX();
        yMouse = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         //No implementar alguna accion aqui, la aplicacion se muere
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       if(mainView.getCloseWindow() == e.getSource()){
           mainView.getCloseWindow().setOpaque(true);
           mainView.getCloseWindow().setBackground(new Color(237,66,69));
       }
       
       if(mainView.getMinimizeWindow() == e.getSource()){
           mainView.getMinimizeWindow().setOpaque(true);
           mainView.getMinimizeWindow().setBackground(new Color(145,176,213));
       }
       
       

    }

    @Override
    public void mouseExited(MouseEvent e) {
       if(mainView.getCloseWindow() == e.getSource()){
           mainView.getCloseWindow().setOpaque(false);
           mainView.getCloseWindow().setBackground(null);
       }
       
       if(mainView.getMinimizeWindow() == e.getSource()){
           mainView.getMinimizeWindow().setOpaque(false);
           mainView.getMinimizeWindow().setBackground(null);
       }
    } 
    
    
    public void  switchPanels(JPanel panel){
        mainView.getMainContent().removeAll();
        mainView.getMainContent().add(panel);
        mainView.getMainContent().repaint();
        mainView.getMainContent().revalidate();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(mainView.getHeaderPanel() == e.getSource()){
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            mainView.setLocation(x - xMouse, y - yMouse);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public PendingNotesPanel getPendingNotesPanel(){
        
        return pendingNotes;
    }

    public MainView getMainView() {
        return mainView;
    }
    
    
}
