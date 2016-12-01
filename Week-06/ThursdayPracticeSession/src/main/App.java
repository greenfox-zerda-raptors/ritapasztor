package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rita on 2016.12.01..
 */
public class App extends JFrame{

    static ArrayList<Animal> animals = new ArrayList<>();


    public App() throws HeadlessException {
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Add an animal");

        JPanel thePanel = new JPanel();
        add(thePanel);
        JButton theButton = new JButton("Add a horse named Jani");
        thePanel.add(theButton);
        theButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animals.add(new Horse("Jani"));

            }
        });
    }




    public static void main(String[] args) {

        animals.add(new Horse("Paci"));
        animals.add(new Horse("Saci"));
        animals.add(new Horse("Paca"));
        animals.add(new Horse("Cic"));
        animals.add(new Horse("Rudy"));
        animals.add(new Horse("Siccc"));
        animals.add(new Ant());

        for (Animal animal : animals) {
            System.out.println(animal);
        }



        Iterator<Animal> iterator = animals.iterator();
        /*Animal animal = iterator.next();
        System.out.println("Iterator: " + animal);
        animal = iterator.next();
        System.out.println("Iterator: " + animal);*/ //bele lehet tenni egy loop-ba, h mukodjon

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

        iterator = animals.iterator();
        for (int i = 0; i < 3; i++) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }
        System.out.println("We're doing something else");

        while(iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });

    }
}
