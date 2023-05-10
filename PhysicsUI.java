package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhysicsUI {

        JFrame physicsFrame = new JFrame("PhysicsUI");
        JButton kineticEnergyButton = new JButton("kinetic energy");
        JButton momentumButton = new JButton("momentum");
        JOptionPane physicsOptionPane = new JOptionPane("physics");
                public void mainUI() {
                        JPanel panel = new JPanel(new GridLayout(3, 1));
                        panel.add(kineticEnergyButton);
                        panel.add(momentumButton);
                        panel.add(physicsOptionPane);
                        physicsFrame.add(panel);
                        physicsFrame.pack();
                        physicsFrame.setVisible(true);

                        kineticEnergyButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        // create a new JFrame object
                                        JFrame newFrame = new JFrame("Kinetic Energy");

                                        // add some components to the new frame
                                        JPanel newPanel = new JPanel();
                                        JLabel label = new JLabel("This is the kinetic energy panel.");
                                        newPanel.add(label);
                                        newFrame.add(newPanel);

                                        // set the size and visibility of the new frame
                                        newFrame.setSize(300, 200);
                                        newFrame.setVisible(true);
                                }
                        });

                        // add ActionListener to momentumButton
                        momentumButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        // code to be executed when the button is clicked
                                        System.out.println("Momentum button clicked!");
                                }
                        });
                }
}
