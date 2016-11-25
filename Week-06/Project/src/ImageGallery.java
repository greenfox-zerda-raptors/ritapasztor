import com.sun.scenario.effect.ImageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.11.25..
 */
public class ImageGallery extends JFrame{
    JPanel mainPanel;
    JPanel container;
    JPanel insidePanel;
    JPanel bottomPanel;

    JLabel gallery;
    JLabel imageName;


    JButton rightArrow;
    JButton leftArrow;

    ImageDisplay mainImage;

    int daysLeft;



    ArrayList<ImageDisplay> pictures = new ArrayList<>();




    //set up frame in constructor
    public ImageGallery() {
        //setLayout(new FlowLayout());
        setUpPanelOut();

        pack();
        //setSize(500,500);
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

    //MAIN panel
    public void setUpPanelOut() {
        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setBackground(Color.red);

        gallery = new JLabel("GALLERY");
        mainPanel.add(gallery);
        gallery.setVerticalAlignment(SwingConstants.TOP);
        gallery.setPreferredSize(new Dimension(300, 30));

        container = new JPanel();
        mainPanel.add(container);
        leftArrow = new JButton("<");
        container.add(leftArrow);
        leftArrow.setAlignmentX( Component.LEFT_ALIGNMENT);

        ListenForLeftArrow forLeftArrow = new ListenForLeftArrow();
        leftArrow.addActionListener(forLeftArrow);


        setUpPanelIn();

        rightArrow = new JButton(">");
        container.add(rightArrow);
        rightArrow.setAlignmentX( Component.RIGHT_ALIGNMENT);
        ListenForRightArrow forRightArrow = new ListenForRightArrow();
        rightArrow.addActionListener(forRightArrow);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        bottomPanelSetUp();
    }

    //Bottom panel
    private void bottomPanelSetUp() {
        bottomPanel = new JPanel();
        mainPanel.add(bottomPanel);

        bottomPanel.setBackground(Color.orange);
        bottomPanel.setPreferredSize(new Dimension(400,150));
        bottomPanel.setAlignmentX( Component.BOTTOM_ALIGNMENT);
        //bottomPanel.setLayout( new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        String[] names = new String[] {"miku.jpg","hohab.jpg"};
        for (String name : names) {
            ImageDisplay image = new ImageDisplay(name);
            image.setPreferredSize(new Dimension(50,50));
            pictures.add(image);
        }

        for(ImageDisplay pic : pictures) {
            bottomPanel.add(pic);
        }

//        image01 = new ImageDisplay("miku.jpg");
//        image01.setPreferredSize();
//        bottomPanel.add(image01);
//
//        image02 = new ImageDisplay("hohab.jpg");
//        image02.setPreferredSize(new Dimension(50,50));
//        bottomPanel.add(image02);



    }

    //Inside panel
    public void setUpPanelIn() {
        insidePanel = new JPanel();
        container.add(insidePanel);
        insidePanel.setPreferredSize(new Dimension(400 , 350));

        daysLeft = 29;
        imageName = new JLabel(daysLeft + " days left until Xmas");
        insidePanel.add(imageName);
        imageName.setPreferredSize(new Dimension(300,20));
        imageName.setMaximumSize(new Dimension(300,20));

        mainImage = new ImageDisplay("christmas.jpg");
        mainImage.setVisible(true);
        mainImage.setPreferredSize(new Dimension(380,310));
        insidePanel.add(mainImage);
    }

    private class ListenForLeftArrow implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            daysLeft++;

        }
    }

    private class ListenForRightArrow implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            daysLeft--;
            if(daysLeft > pictures.size()-1) {

            }

        }
    }
}
