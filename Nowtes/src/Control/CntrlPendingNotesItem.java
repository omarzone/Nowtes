/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.MainView;

/**
 *
 * @author polilxd
 */
public class CntrlPendingNotesItem extends CntrlMain {

    private MainView mainView;
    EditNote addEditNote = new EditNote();

    public CntrlPendingNotesItem(MainView mainView) {
        super(mainView);
        this.mainView = mainView;

        getPendingNotesPanel().getPendingNotesItem1().getBtnEditNote().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomMouseClicked(evt);
            }
        });

    }

    public void CustomMouseClicked(MouseEvent e) {
        if (getPendingNotesPanel().getPendingNotesItem1().getBtnEditNote() == e.getSource()) {

            getMainView().getMainContent().removeAll();
            getMainView().getMainContent().add(addEditNote);
            getMainView().getMainContent().repaint();
            getMainView().getMainContent().revalidate();

        }

    }

}
