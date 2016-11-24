import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rita on 2016.11.24..
 */
public class WrapperApp extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu menu;
    JMenu menu2;
    JMenuItem menuItem;

    //main method
    public static void main(String... args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp().setVisible(true);
            }
        });
    }

    //constructor to set up frame
    public WrapperApp() {
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Set up Menu");

        //Create menu bar
        menuBar = new JMenuBar();

        //build menu
        menu = new JMenu("File");
        menuBar.add(menu);
        menu2 = new JMenu("Edit");
        menuBar.add(menu2);


        //add menu items
        menuItem = new JMenuItem("Exit");
        menu.add(menuItem);
        menuItem.addActionListener(this);

        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //this.setDefaultCloseOperation(0);
        System.exit(0);

    }
}
