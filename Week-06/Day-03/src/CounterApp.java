import javax.swing.*;

/**
 * Created by Rita on 2016.11.23..
 */
public class CounterApp extends JFrame{
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private  int clicks = 0;

    public CounterApp(){
        JPanel panel = new JPanel();
        
        createView();

    }
    public void createView() {

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
