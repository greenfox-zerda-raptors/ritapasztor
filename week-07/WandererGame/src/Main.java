import javax.swing.*;

/**
 * Created by Rita on 2016.12.05..
 */
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Board board = new Board();
        frame.add(board);
            frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(board);

    }
}
