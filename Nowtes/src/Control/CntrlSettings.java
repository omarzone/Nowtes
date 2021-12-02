package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CntrlSettings implements ActionListener {

    private CntrlMain cntrlMain;

    public CntrlSettings(CntrlMain cntrlMain) {
        System.out.println("Controlador CntrlSettings inicializado");
        this.cntrlMain = cntrlMain;

        cntrlMain.getSettingsView().getBtnDeleteData().addActionListener(this);
        cntrlMain.getSettingsView().getBtnDarkTheme().addActionListener(this);
        cntrlMain.getSettingsView().getCbmPriority().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (cntrlMain.getSettingsView().getBtnDeleteData() == e.getSource()) {
            System.out.println("Datos borrados");
        }

        if (cntrlMain.getSettingsView().getBtnDarkTheme() == e.getSource()) {
            System.out.println("Tema actualizado");
        }

        if (cntrlMain.getSettingsView().getCbmPriority() == e.getSource()) {
            System.out.println("Prioridad actualizada");
        }

    }

}
