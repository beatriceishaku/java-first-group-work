package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhysicsUI {

        JFrame physicsFrame = new JFrame("PhysicsUI");
        JButton kineticEnergyButton = new JButton("kinetic energy");
        JButton momentumButton = new JButton("momentum");
        JButton Velocity = new JButton("velocity");
        JButton PotentialEnergy = new JButton("Potential Energy");
        JOptionPane physicsOptionPane = new JOptionPane("physics");
        JFrame PotentialEnergyFrame = new JFrame("potentialEnergy");
        JTextField enterLengthOfSquare = new JTextField("Enter Length");
        JButton calculateAreaOfSquare = new JButton("calculate");
        JFrame VelocityFrame = new JFrame("velocity");
        JTextField enterHeightOfTriangle = new JTextField("Enter Height");
        JTextField enterBaseOfTriangle = new JTextField("Enter Base");
        JButton calculateAreaOfTriangle = new JButton("calculate");
        JFrame PressureFrame = new JFrame("pressure");
        JTextField enterLengthOfRectangle = new JTextField("Enter Length");
        JTextField enterBreadthOfRectangle = new JTextField("Enter Breadth");
        JButton calculateAreaOfRectangle = new JButton("calculate");
                public void mainUI() {
                        JPanel panel = new JPanel(new GridLayout(3, 1));
                        panel.add(kineticEnergyButton);
                        panel.add(momentumButton);
                        panel.add(physicsOptionPane);
                        physicsFrame.add(panel);
                        physicsFrame.pack();
                        physicsFrame.setVisible(true);
                        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                        kineticEnergyButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                        // create a new JFrame object
                                        JFrame newFrame = new JFrame("Kinetic Energy");

                                        // add some components to the new frame
                                        JPanel newPanel = new JPanel();
                                        JLabel label = new JLabel("Enter Mass")
                                        JTextField = new JTextField();
                                        JLabel label = new JLabel("Enter Velocity");
                                        JTextField = new JTextField();
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
                        velocityButton.addActionListener(e -> {
            System.out.println("velocity");
            JOptionPane.showMessageDialog(null, " velocity");
            drawAreaOfTriangleUI();
        });
       pressureButton.addActionListener(e -> {
            System.out.println("pressure");
            JOptionPane.showMessageDialog(null, " pressure");
            drawAreaOfRectangleUI();
        });

        // FUNCTION CALL !!!
        velocity.addActionListener(e -> {
            try{
                float height = Float.parseFloat(velocity.getText());
                float base = Float.parseFloat(velocity.getText());
                double area = 0.5 * height * base;
                JOptionPane.showMessageDialog(null, "velocity is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        pressure.addActionListener(e -> {
            try{
                float length = Float.parseFloat(pressure.getText());
                float breadth = Float.parseFloat(pressure.getText());
                float area = length * breadth;
                JOptionPane.showMessageDialog(null, "pressure is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        potentialEnergy.addActionListener(e -> {
            try{
                float length = Float.parseFloat(poentialEnergy.getText());
                float area = length * length;
                JOptionPane.showMessageDialog(null, "potenialEnergy is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
    }

        public void potentialEnergyUI(){
            potentialenergyFrame = new JFrame("potentialEnergy");
            poentialEnergyFrame.add(enterLengthOfSquare);
            poentialEnergyFrame.add(calculateAreaOfSquare);
            potentialenergyFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            potentialEnergyFrame.setSize(150, 200);
            potentialEnergyFrame.setVisible(true);
        }
        public void drawvelocityUI(){
            velocityFrame = new JFrame("velocity");
            velocityFrame.add(enterBaseOfTriangle);
            velocityFrame.add(enterHeightOfTriangle);
            velocityFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            velocityFrame.setSize(900,990);
            velocityFrame.setVisible(true);
        }

        public void drawpressureUI(){
            pressureFrame = new JFrame("pressure");
            pressureFrame.add(enterLengthOfRectangle);
            pressureFrame.add(enterBreadthOfRectangle);
            pressureFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            pressureFrame.setSize(900,990);
            pressureFrame.setVisible(true);
        }
    }

                }
}
