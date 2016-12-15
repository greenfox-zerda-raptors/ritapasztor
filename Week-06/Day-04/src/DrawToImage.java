import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rita on 2016.11.24..
 */
public class DrawToImage extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu menu;
    JMenu menu2;
    JMenuItem menuItem;
    ImagePanel imagePanel = new ImagePanel();

    //main method
    public static void main(String... args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawToImage();
            }
        });
    }

    //constructor to set up frame
    public DrawToImage() {
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Draw on an image");

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

        this.add(imagePanel);
        setVisible(true);
    }

    //create image panel
    private class ImagePanel extends JPanel {
        Image image;

        private ImagePanel() {
            image = Toolkit.getDefaultToolkit().createImage("image.jpg");
        }
        @Override
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            requestFocus();
            graphics.drawImage(image, 7, 25, this);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //this.setDefaultCloseOperation(0);
        System.exit(0);

    }
}
