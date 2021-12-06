package Control;

import Model.Theme;
import domain.ThemeData;
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
    private ThemeData themeData = new ThemeData();
    private CntrlPendingPanel cntrlPendingPanel;
    private CntrlSettings cntrlSettings;
    private Theme themeApp;
    

    public CntrlMain(MainView mainView) {
        System.out.println("Controlador CntrlMain inicializado");
        this.mainView = mainView;
        
        
        
        boolean themeDark = true;
        
        if(themeDark){
            themeApp = themeData.getDarkTheme();
        }else{
            themeApp = themeData.getLightTheme();
        }
        
        
        if(cntrlPendingPanel == null){
                
                cntrlPendingPanel = new CntrlPendingPanel(this,pendingNotesView);
            
            }
        
        
        mainView.getHeaderPanel().setBackground(themeApp.getHEADER_PANEL());
        mainView.getContent().setBackground(themeApp.getBG());
        mainView.getMenu().setBackground(themeApp.getMENU_BG());
        
        
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
            if(cntrlSettings == null){
                
                cntrlSettings = new CntrlSettings(this);
            
            }
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

    public ThemeData getThemeData() {
        return themeData;
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

    public Settings getSettingsView() {
        return settingsView;
    }

    public void setPendingNotesView(PendingNotesPanel pendingNotesView) {
        this.pendingNotesView = pendingNotesView;
    }

    public Theme getThemeApp() {
        return themeApp;
    }
    

}
