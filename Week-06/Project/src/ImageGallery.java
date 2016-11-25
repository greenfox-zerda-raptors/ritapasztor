import javax.swing.*;
import java.awt.*;

/**
 * Created by Rita on 2016.11.25..
 */
public class ImageGallery extends JFrame{
    JPanel panelOut;
    JPanel panelIn;
    JLabel gallery;
    JLabel imageName;
    JButton rightArrow;
    JButton leftArrow;
    ImageDisplay mainImage;



    //set up frame in constructor
    public ImageGallery() {
        setUpPanelOut();

        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Christmas is coming");

    }
    //main method
    public static void main(String... args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageGallery();
            }
        });
    }

    //set up method for outside panel
    public void setUpPanelOut() {
        panelOut = new JPanel();
        add(panelOut);
        panelOut.setBackground(Color.red);


        gallery = new JLabel("GALLERY");
        panelOut.add(gallery);
        gallery.setVerticalAlignment(SwingConstants.TOP);
        gallery.setPreferredSize(new Dimension(400, 30));
        gallery.setBackground(Color.BLUE);

        leftArrow = new JButton("<");
        panelOut.add(leftArrow);
        leftArrow.setHorizontalAlignment(SwingConstants.LEFT);

        setUpPanelIn();

        rightArrow = new JButton(">");
        panelOut.add(rightArrow);
        rightArrow.setHorizontalAlignment(SwingConstants.RIGHT);

        //panelOut.setLayout(new BoxLayout(panelOut, BoxLayout.LINE_AXIS));

    }

    //set up method for inside panel: image name, image, arrows
    public void setUpPanelIn() {
        panelIn = new JPanel();
        panelOut.add(panelIn);
        panelIn.setPreferredSize(new Dimension(400 , 350));

        imageName = new JLabel("29 days left until Xmas");
        panelIn.add(imageName);

        mainImage = new ImageDisplay();
        mainImage.setVisible(true);
        panelIn.add(mainImage);

    }
    //set up main image label
    public class ImageDisplay extends JPanel {

        Image image;

        private ImageDisplay() {
            image = Toolkit.getDefaultToolkit().createImage("christmas.jpg");
            setPreferredSize(new Dimension(200,200));
        }
        @Override
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            requestFocus();
            graphics.drawImage(image, 0, 0, this);

        }







    }
}
