import javax.swing.*;

/**
 * Created by Rita on 2016.12.05..
 */
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.add(new Board());
            frame.pack();
        frame.setVisible(true);


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
