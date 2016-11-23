import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rita on 2016.11.23..
 */
public class CounterApp extends JFrame{
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private  int clicks = 0;

    public CounterApp(){
        setUpPanel();

        setTitle("Click Me");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void setUpPanel() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks = 0;
                        updateCounter();
                    }
        });
        panel.add(buttonReset);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension( 200, 30));
        panel.add(labelCount);
        updateCounter();
    }

    private void updateCounter() {
        labelCount.setText("Clicked " + clicks + " times");
    }

    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CounterApp();
            }
        });
    }


}
