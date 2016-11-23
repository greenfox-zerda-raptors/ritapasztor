import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rita on 2016.11.23..
 */
public class UIControls extends JFrame implements ActionListener {
    JPanel panel;
    JTextField textField;
    JLabel inputText;
    JLabel memory;
    JButton clear;

    public UIControls() {
        setUpPanel();

        this.add(panel);
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UI Control sample");
    }

    public void setUpPanel() {
        panel = new JPanel();

        textField = new JTextField("My actual input");
        textField.setPreferredSize(new Dimension(300, 30));
        textField.setLayout(new FlowLayout());
        textField.addActionListener(this);

        inputText = new JLabel("Text : My actual input");

        memory = new JLabel("Memory : My prev input");

        clear = new JButton("Clear memory");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory.setText("Memory : My prev input");
            }
        });

        panel.add(textField);
        panel.add(inputText);
        panel.add(memory);
        panel.add(clear);
        panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5, true  ));
        panel.setBackground(Color.gray);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        memory.setText(inputText.getText());
        inputText.setText(textField.getText());
        textField.setText("");

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIControls();
            }
        });
    }
}
