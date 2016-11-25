import javax.swing.*;
import java.awt.*;

/**
 * Created by Rita on 2016.11.25..
 */
public class ImageGallery extends JFrame{
    JPanel mainPanel;
    JPanel insidePanel;
    JPanel bottomPanel;

    JLabel gallery;
    JLabel imageName;

    JButton rightArrow;
    JButton leftArrow;

    ImageDisplay mainImage;



    //set up frame in constructor
    public ImageGallery() {
        setLayout(new FlowLayout());
        setUpPanelOut();

        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Advent Calendar");

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
        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setBackground(Color.red);



        gallery = new JLabel("GALLERY");
        mainPanel.add(gallery);
        gallery.setVerticalAlignment(SwingConstants.TOP);
        gallery.setPreferredSize(new Dimension(400, 30));

        leftArrow = new JButton("<");
        mainPanel.add(leftArrow);
        leftArrow.setAlignmentX( Component.LEFT_ALIGNMENT);
//        leftArrow.setBorderPainted(false);
//        leftArrow.setContentAreaFilled(false);

        setUpPanelIn();

        rightArrow = new JButton(">");
        mainPanel.add(rightArrow);
        rightArrow.setAlignmentX( Component.RIGHT_ALIGNMENT);

        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));

        bottomPanelSetUp();
    }

    //set up method for bottom panel
    private void bottomPanelSetUp() {
        bottomPanel = new JPanel();
        mainPanel.add(bottomPanel);
        setBackground(Color.orange);
        bottomPanel.setPreferredSize(new Dimension(400,150));

        bottomPanel.setAlignmentX( Component.BOTTOM_ALIGNMENT);
    }

    //set up method for inside panel: image name, image, arrows
    public void setUpPanelIn() {
        insidePanel = new JPanel();
        mainPanel.add(insidePanel);
        insidePanel.setPreferredSize(new Dimension(400 , 350));

        imageName = new JLabel("29 days left until Xmas");
        insidePanel.add(imageName);
        imageName.setPreferredSize(new Dimension(300,20));
        imageName.setMaximumSize(new Dimension(300,20));


        mainImage = new ImageDisplay();
        mainImage.setVisible(true);
        insidePanel.add(mainImage);

    }
    //set up main image label
    public class ImageDisplay extends JPanel {

        Image image;

        private ImageDisplay() {
            image = Toolkit.getDefaultToolkit().createImage("christmas.jpg");
            setPreferredSize(new Dimension(300,300));
        }
        @Override
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            requestFocus();
            graphics.drawImage(image, 0, 0, this);

        }







    }
}
