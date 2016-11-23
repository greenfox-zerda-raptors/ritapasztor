import javax.swing.*;

/**
 * Created by Rita on 2016.11.23..
 */
public class HelloWorld extends JFrame {
    public HelloWorld() {
        this.setTitle("Hello World");
        this.setVisible(true);
        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("Hello World");
        thePanel.add(label1);
        this.add(thePanel);
        label1.setText("Hello Rita!");
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });
    }
}
