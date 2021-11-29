/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.MainView;
/**
 *
 * @author PC GOOSE
 */
public class CntrlMain extends MainView implements MouseListener{

    private MainView mainView;
    
    public CntrlMain(MainView mainView){
        this.mainView = mainView;
        
        mainView.getMinimizeWindow().addMouseListener(this);
        mainView.getCloseWindow().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(mainView.getCloseWindow() == e.getSource()){
            mainView.dispose();
        }
        
        if(mainView.getMinimizeWindow() == e.getSource()){
            mainView.setState(mainView.ICONIFIED);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //No implementar alguna accion aqui, la aplicacion se muere.
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
}
