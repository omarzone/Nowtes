/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainView;
import view.SplashScreen.Splash;

/**
 *
 * @author PC GOOSE
 */
public class CntrlSplashScreen implements Runnable{
    
    private Thread tiempo = null;
    private Splash splashScreen;
    
    public CntrlSplashScreen(Splash splashScreen){
        this.splashScreen = splashScreen;
        
        splashScreen.setLocationRelativeTo(null);
        splashScreen.setVisible(true);
        tiempo = new Thread(this);
        tiempo.start();
    }

    @Override
    public void run() {
       try {
                Thread.sleep(750);
                MainView mainView = new MainView();
                CntrlMain cntrlMain = new CntrlMain(mainView);
                mainView.setVisible(true);
                mainView.setLocationRelativeTo(null);
                this.splashScreen.dispose();
            } catch (InterruptedException ex) {
                Logger.getLogger(CntrlSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
