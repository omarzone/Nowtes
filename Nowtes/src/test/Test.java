package test;
import view.MainView;

import Control.CntrlMain;


public class Test {

    public static void main(String[] args) {
       MainView mainView = new MainView();
       CntrlMain cntrlMain = new CntrlMain(mainView);
       mainView.setVisible(true);
       mainView.setLocationRelativeTo(null);
    }
    
}
