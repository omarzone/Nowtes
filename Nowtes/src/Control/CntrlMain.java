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

public class CntrlMain implements MouseListener, MouseMotionListener {

    private int xMouse, yMouse;
    private MainView mainView;

    private PendingNotesPanel pendingNotesView = new PendingNotesPanel();
    private CompleteNotesPanel completeNotesView = new CompleteNotesPanel();
    private Help helpView = new Help();
    private Settings settingsView = new Settings();
    
    private CntrlPendingPanel cntrlPendingPanel;
    
    public CntrlMain(){
    
    }

    public CntrlMain(MainView mainView) {
        this.mainView = mainView;
        
        if(cntrlPendingPanel == null){
                System.out.println("Controlador CntrlPendingPanel inicializado");
                cntrlPendingPanel = new CntrlPendingPanel(this,pendingNotesView);
            
            }
        mainView.getMainContent().add(pendingNotesView);
        
        
        //Listeners para windows Actions
        mainView.getMinimizeWindow().addMouseListener(this);
        mainView.getCloseWindow().addMouseListener(this);
        
        //Listeners para botones menu
        mainView.getBtnHelp().addMouseListener(this);
        mainView.getBtnHome().addMouseListener(this);
        mainView.getBtnHistory().addMouseListener(this);
        mainView.getBtnSettings().addMouseListener(this);
        
        //Listeners para el panel superior
        mainView.getHeaderPanel().addMouseListener(this);
        mainView.getHeaderPanel().addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (mainView.getCloseWindow() == e.getSource()) {
            mainView.dispatchEvent(new WindowEvent(mainView, WindowEvent.WINDOW_CLOSING));
        }

        if (mainView.getMinimizeWindow() == e.getSource()) {
            mainView.setState(mainView.ICONIFIED);
        }

        if (mainView.getBtnHome() == e.getSource()) {
            if(cntrlPendingPanel == null){
                System.out.println("Controlador CntrlPendingPanel inicializado");
                cntrlPendingPanel = new CntrlPendingPanel(this,pendingNotesView);
            
            }
            switchPanels(pendingNotesView);
            
        }

        if (mainView.getBtnHelp() == e.getSource()) {
            switchPanels(helpView);
        }

        if (mainView.getBtnHistory() == e.getSource()) {
            switchPanels(completeNotesView);
        }

        if (mainView.getBtnSettings() == e.getSource()) {
            switchPanels(settingsView);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (mainView.getHeaderPanel() == e.getSource()) {
            xMouse = e.getX();
            yMouse = e.getY();
            
            
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //No implementar alguna accion aqui, la aplicacion se muere
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (mainView.getCloseWindow() == e.getSource()) {
            mainView.getCloseWindow().setOpaque(true);
            mainView.getCloseWindow().setBackground(new Color(237, 66, 69));
        }

        if (mainView.getMinimizeWindow() == e.getSource()) {
            mainView.getMinimizeWindow().setOpaque(true);
            mainView.getMinimizeWindow().setBackground(new Color(145, 176, 213));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (mainView.getCloseWindow() == e.getSource()) {
            mainView.getCloseWindow().setOpaque(false);
            mainView.getCloseWindow().setBackground(null);
        }

        if (mainView.getMinimizeWindow() == e.getSource()) {
            mainView.getMinimizeWindow().setOpaque(false);
            mainView.getMinimizeWindow().setBackground(null);
        }
    }

    public void switchPanels(JPanel panel) {
        mainView.getMainContent().removeAll();
        mainView.getMainContent().add(panel);
        mainView.getMainContent().repaint();
        mainView.getMainContent().revalidate();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (mainView.getHeaderPanel() == e.getSource()) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            
            mainView.setLocation(x - xMouse, y - yMouse);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //No implementar alguna accion aqui, la aplicacion se muere
    }

    public PendingNotesPanel getPendingNotesPanel() {

        return pendingNotesView;
    }

    public MainView getMainView() {
        return mainView;
    }

}
