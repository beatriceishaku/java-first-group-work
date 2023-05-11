package UI;

import javax.swing.*;
import java.awt.*;

public class PhysicsUI {

        JFrame physicsFrame = new JFrame("PhysicsUI");
        JButton kineticEnergyButton = new JButton("kinetic energy");
        JButton momentumButton = new JButton("momentum");
        JButton potentialEnergyButton = new JButton("potential Energy");
        JButton pressureButton = new JButton("pressure");
        JButton velocityButton = new JButton("velocity");
        JOptionPane physicsOptionPane = new JOptionPane("physics");
        JFrame potentialEnergyFrame = new JFrame("potentialEnergy");
        JTextField enterMass = new JTextField("Enter Mass");
        JTextField enterHeight = new JTextField("Enter Height");
        JButton calculatePotentialEnergy = new JButton("calculate");
        JFrame momentumFrame = new JFrame("Momentum");
        JLabel enterMass = new JLabel("Enter Mass")
        JLabel enterVelocity =new JLabel("Enter velocity")
        JTextField enterMass = new JTextField()
        JButton calculateMomentum = new JButton("calculate")
        JFrame velocityFrame = new JFrame("velocity");
        JTextField enterDistance = new JTextField("Enter Distance");
        JTextField enterTime = new JTextField("Enter Time");
        JButton calculateVelocity = new JButton("calculate");
        JFrame pressureFrame = new JFrame("pressure");
        JTextField enterForce = new JTextField("Enter Force");
        JTextField enterArea = new JTextField("Enter Area");
        JButton calculatePressure = new JButton("calculate");
                public void mainUI() {
                        JPanel panel = new JPanel(new GridLayout(3, 1));
                        panel.add(kineticEnergyButton);
                        panel.add(potentialEnergyButton);
                        panel.add(momentumButton);
                        panel.add(pressureButton);
                        panel.add(velocityButton);
                        panel.add(physicsOptionPane);
                        physicsFrame.add(panel);
                        physicsFrame.pack();
                        physicsFrame.setVisible(true);
                        physicsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                        kineticEnergyButton.addActionListener(e -> {
                                // create a new JFrame object
                                JFrame newFrame = new JFrame("Kinetic Energy");

                                // add some components to the new frame
                                JPanel newPanel = new JPanel();
                                JLabel mass = new JLabel("Enter Mass");
                                JLabel velocity = new JLabel("Enter Velocity");
                                newPanel.add(mass);
                                newPanel.add(velocity);
                                newFrame.add(newPanel);

                                // set the size and visibility of the new frame
                                newFrame.setSize(300, 200);
                                newFrame.setVisible(true);
                        });

                        // add ActionListener to momentumButton
                        momentumButton.addActionListener(e -> {
                            JFrame newFrame = JFrame("Momentum"); JPanel newPanel = new JPanel();
                            JLabel mass = new JLabel("Enter Mass");
                            JLabel velocity = new JLabel("Enter Velocity");
                            newPanel.add(mass);
                            newPanel.add(velocity);
                            newFrame.add(newPanel);

                            // set the size and visibility of the new frame
                            newFrame.setSize(300, 200);
                            newFrame.setVisible(true);


                        });
                    potentialEnergyButton.addActionListener(e -> {
                        drawPotentialEnergyUI();
                    });
                        velocityButton.addActionListener(e -> {
                            drawVelocityUI();
        });
       pressureButton.addActionListener(e -> {
            drawPressureUI();
        });

        // FUNCTION CALL !!!
        velocityButton.addActionListener(e -> {
            try{
                float distance = Float.parseFloat(velocityButton.getText());
                float time = Float.parseFloat(velocityButton.getText());
                double velocity = distance / time;
                JOptionPane.showMessageDialog(null, "velocity is " + velocity);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        pressureButton.addActionListener(e -> {
            try{
                float force = Float.parseFloat(pressureButton.getText());
                float area = Float.parseFloat(pressureButton.getText());
                float pressure = force / area ;
                JOptionPane.showMessageDialog(null, "pressure is " + pressure);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        potentialEnergyButton.addActionListener(e -> {
            try{
                float mass = Float.parseFloat(potentialEnergyButton.getText());
                float height = Float.parseFloat(potentialEnergyButton.getText());

                float potentialEnergy = mass * 10 * height;
                JOptionPane.showMessageDialog(null, "potential Energy is " + potentialEnergy);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
    }

    public void drawMomentumUI(){
                    momentumFrame = new JFrame("Momentum");
                    mo
    }

        public void drawPotentialEnergyUI(){
            potentialEnergyFrame = new JFrame("potential Energy");
            potentialEnergyFrame.add(enterMass);
            potentialEnergyFrame.add(enterHeight);
            potentialEnergyFrame.add(calculatePotentialEnergy);
            potentialEnergyFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            potentialEnergyFrame.setSize(150, 200);
            potentialEnergyFrame.setVisible(true);
        }
        public void drawVelocityUI(){
            velocityFrame = new JFrame("velocity");
            velocityFrame.add(enterDistance);
            velocityFrame.add(enterTime);
            velocityFrame.add(calculateVelocity);
            velocityFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            velocityFrame.setSize(900,990);
            velocityFrame.setVisible(true);
        }

        public void drawPressureUI(){
            pressureFrame = new JFrame("pressure");
            pressureFrame.add(enterForce);
            pressureFrame.add(enterArea);
            pressureFrame.add(calculatePressure);
            pressureFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            pressureFrame.setSize(900,990);
            pressureFrame.setVisible(true);
        }
}

