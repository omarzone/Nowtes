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
import view.Settings.SettingsView;
import Model.Settings;
import DAONote.DAOSettings;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class CntrlMain implements MouseListener, MouseMotionListener {
    
    private int xMouse, yMouse;
    private MainView mainView;
    //private DAOSettings daoSettings = new DAOSettings();
    private PendingNotesPanel pendingNotesView = new PendingNotesPanel();
    private Settings settingsUser;
    private CompleteNotesPanel completeNotesView = new CompleteNotesPanel();
    private Help helpView = new Help();
    private SettingsView settingsView = new SettingsView();
    private ThemeData themeData = new ThemeData();
    private CntrlPendingPanel cntrlPendingPanel;
    private CntrlSettings cntrlSettings;
    private Theme themeApp;
    private ArrayList<Settings> settingsList = new ArrayList<Settings>();
    

    public CntrlMain(MainView mainView){
        
        
        System.out.println("Controlador CntrlMain inicializado");
        this.mainView = mainView;
        
        
       
       DAOSettings daoSettings = new DAOSettings();
        try {
            settingsList = daoSettings.query(null);
            settingsUser = settingsList.get(0);
            if(settingsUser.isThemeDark()){
                themeApp = themeData.getDarkTheme();
            }else{
                themeApp = themeData.getLightTheme();
           }
            
            System.out.println(settingsUser.getPriorityOrder() );
            
        } catch (SQLException ex) {
            //Cuando ocurra cualquier error con la base de datos, que cree un objeto settings con estos valores
            settingsUser = new Settings(true,0);
            ex.printStackTrace();
        }
        
        
        if(cntrlPendingPanel == null){
                
                cntrlPendingPanel = new CntrlPendingPanel(this,pendingNotesView);
            
            }
        
        setTheme();
       
        
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

    public SettingsView getSettingsView() {
        return settingsView;
    }

    public void setPendingNotesView(PendingNotesPanel pendingNotesView) {
        this.pendingNotesView = pendingNotesView;
    }

    public Theme getThemeApp() {
        return themeApp;
    }

    public CntrlPendingPanel getCntrlPendingPanel() {
        return cntrlPendingPanel;
    }

    public void setCntrlPendingPanel(CntrlPendingPanel cntrlPendingPanel) {
        this.cntrlPendingPanel = cntrlPendingPanel;
    }

    public Settings getSettingsUser() {
        return settingsUser;
    }

    
    
    
    
    private void setTheme(){
        //Cambios relacionados con el tema de la aplicación de la vista principal
        this.mainView.getHeaderPanel().setBackground(themeApp.getHEADER_PANEL());
        this.mainView.getContent().setBackground(themeApp.getBG());
        this.mainView.getMenu().setBackground(themeApp.getMENU_BG());
        this.mainView.getBtnHelp().setForeground(themeApp.getFONT());
        this.mainView.getBtnHistory().setForeground(themeApp.getFONT());
        this.mainView.getBtnHome().setForeground(themeApp.getFONT());
        this.mainView.getBtnSettings().setForeground(themeApp.getFONT());
        this.mainView.getTitleApp().setForeground(themeApp.getTITLE_APP());
        
        
        //Comprobación para seleccionar que logo usar cuando se cambie el darktheme
        if(settingsUser.isThemeDark()){
            this.mainView.getLogo().setIcon(new ImageIcon(getClass().getResource("/resources/LogoMakr (1).png")));
        }
       
        
       
    }

}
