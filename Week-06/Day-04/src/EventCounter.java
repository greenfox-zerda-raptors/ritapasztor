import javafx.beans.property.adapter.JavaBeanLongPropertyBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Rita on 2016.11.24..
 */
public class EventCounter extends JFrame {
    //class variables
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;
    private JLabel mousePosLabel;
    private JLabel mouseClickLabel;
    private JLabel keyLabel;
    private JLabel windowLabel;

    private JTextField keyTextField;

    private int buttonClicks = 0;

    //main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter();
            }
        });
    }

    //Constructor to set up frame
    public EventCounter(){
        setUpPanel();

        setTitle("Event counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    //method to set up panel


    //method to set up panel
    private void setUpPanel() {
        JPanel panel = new JPanel();
        add(panel);

        keyTextField = new JTextField("Write text here");
        keyTextField.setPreferredSize(new Dimension(300, 30));
        keyLabel = new JLabel("I'm watching your fingers");
        keyLabel.setPreferredSize(new Dimension(300,30));

        ListenForKeys lForKeys = new ListenForKeys();
        keyTextField.addKeyListener(lForKeys);

        windowLabel = new JLabel("window label");
        windowLabel.setPreferredSize(new Dimension(300,30));

        mousePosLabel = new JLabel("Mouse position: ");
        mousePosLabel.setPreferredSize(new Dimension(300,30));
        mouseClickLabel = new JLabel("Numbef of Mouse clicks: ");
        mouseClickLabel.setPreferredSize(new Dimension(300,30));
        ListenForMouse lForMouse = new ListenForMouse();
        panel.addMouseListener(lForMouse);

        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        buttonClicks = 0;
                        updateCounter();
                    }
                });
        panel.add(buttonReset);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension( 200, 30));
        panel.add(labelCount);
        updateCounter();


        panel.add(keyTextField);
        panel.add(keyLabel);
        panel.add(mouseClickLabel);
        panel.add(mousePosLabel);
        panel.add(windowLabel);
    }

    private void updateCounter() {
        labelCount.setText("Clicked " + buttonClicks + " times");
    }

    //buttoncounter
    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonClicks++;
            updateCounter();
        }
    }

    //keylistener
    private class ListenForKeys implements KeyListener {
        int counter = 0;
        @Override
        public void keyTyped(KeyEvent e) {
            counter++;
            keyLabel.setText(counter + " keys clicked");

        }
        @Override
        public void keyPressed(KeyEvent f) {
            //keyLabel.setText("Key hit: " + f.getKeyChar() + "\n");
        }

        @Override
        public void keyReleased(KeyEvent g) {
            //keyLabel.setText("Key released: " + g.getKeyChar() + "\n");
        }
    }

    //windowlistener
    private class ListenForWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            windowLabel.setText("Window is opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //not needed here
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //not need here
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //not need here
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            windowLabel.setText("Window deiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //not need here
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            windowLabel.setText("Window deactivated");
        }
    }

    //mouselistener
    private class ListenForMouse implements MouseListener{
        private  int mouseClicks = 0;

        @Override
        public void mouseClicked(MouseEvent e) {
            mouseClicks++;
            mouseClickLabel.setText("Mouse clicked: " + mouseClicks);
            mousePosLabel.setText("Mouse panel position: " + e.getX() + " " + e.getY() + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //not needed here
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //not needed here
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //not needed here
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //not needed here
        }
    }
}
