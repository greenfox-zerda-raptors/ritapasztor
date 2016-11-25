import javax.swing.*;
import java.awt.*;

/**
 * Created by Rita on 2016.11.25..
 */

public class ImageDisplay extends JPanel {

    Image image;

    public ImageDisplay(String name) {
        image = Toolkit.getDefaultToolkit().createImage(name);
    }
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image, 0, 0, this);
    }
}