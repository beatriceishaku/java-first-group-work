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
        
        JFrame kineticEnergyFrame = new JFrame("Kinetic Energy");
        JTextField enterMassKE = new JTextField("Enter Mass");
        JTextField enterVelocityKE = new JTextField("Enter Height");
        JButton calculateKineticEnergy = new JButton("calculate");
        JFrame potentialEnergyFrame = new JFrame("potential Energy");
        JTextField enterMassPE = new JTextField("Enter Mass");
        JTextField enterHeightPE = new JTextField("Enter Height");
        JButton calculatePotentialEnergy = new JButton("calculate");
        JFrame momentumFrame = new JFrame("Momentum");
        JTextField enterMassM = new JTextField("Enter Mass");
        JTextField enterVelocityM = new JTextField("Enter velocity");

      
        JButton calculateMomentum = new JButton("calculate");
        JFrame velocityFrame = new JFrame("velocity");
        JTextField enterDistance = new JTextField("Enter Distance");
        JTextField enterTime = new JTextField("Enter Time");
        JButton calculateVelocity = new JButton("calculate");
        JFrame pressureFrame = new JFrame("pressure");
        JTextField enterForce = new JTextField("Enter Force");
        JTextField enterArea = new JTextField("Enter Area");
        JButton calculatePressure = new JButton("calculate");
                public void mainUI() {
                        JPanel panel = new JPanel(new GridLayout(5, 1));
                        panel.add(kineticEnergyButton);
                        panel.add(potentialEnergyButton);
                        panel.add(momentumButton);
                        panel.add(pressureButton);
                        panel.add(velocityButton);
                      
                        physicsFrame.add(panel);
                        physicsFrame.pack();
                        physicsFrame.setVisible(true);
                        physicsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                        kineticEnergyButton.addActionListener(e -> {
                                kineticEnergyFrame = new JFrame("Kinetic Energy");
                                kineticEnergyFrame.add(enterMassKE);
                                kineticEnergyFrame.add(enterVelocityKE);
                                kineticEnergyFrame.add(calculateKineticEnergy);

                                // set the size and visibility of the new frame
                                kineticEnergyFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
                                kineticEnergyFrame.setSize(300, 200);
                                kineticEnergyFrame.setVisible(true);
                        });

                        // add ActionListener to momentumButton
                        momentumButton.addActionListener(e -> {
                                momentumFrame = new JFrame("Momentum");
                                momentumFrame.add(enterMassM);
                                momentumFrame.add(enterVelocityM);
                                momentumFrame.add(calculateMomentum);
                           
                            // set the size and visibility of the new frame
                                momentumFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
                                momentumFrame.setSize(300, 200);
                                momentumFrame.setVisible(true);


                        });
                        potentialEnergyButton.addActionListener(e -> {
                                potentialEnergyFrame = new JFrame("Potential Energy");
                                potentialEnergyFrame.add(enterMassPE);
                                potentialEnergyFrame.add(enterHeightPE);
                                potentialEnergyFrame.add(calculatePotentialEnergy);
                                potentialEnergyFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
                                potentialEnergyFrame.setSize(300, 200);
                                potentialEnergyFrame.setVisible(true);
                        });
                        velocityButton.addActionListener(e -> {
                                velocityFrame = new JFrame("velocity");
                                velocityFrame.add(enterDistance);
                                velocityFrame.add(enterTime);
                                velocityFrame.add(calculateVelocity);
                                velocityFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
                                velocityFrame.setSize(300,200);
                                velocityFrame.setVisible(true);
                       });
                        pressureButton.addActionListener(e -> {
                                pressureFrame = new JFrame("pressure");
                                pressureFrame.add(enterForce);
                                pressureFrame.add(enterArea);
                                pressureFrame.add(calculatePressure);
                                pressureFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
                                pressureFrame.setSize(300,200);
                                pressureFrame.setVisible(true);
         
        });

        // FUNCTION CALL !!!
                        
        kineticEnergyButton.addActionListener(e -> {
            try{
                float massKE = Float.parseFloat(enterMassKE.getText());
                float velocityKE = Float.parseFloat(enterVelocityKE.getText());

                float kineticEnergy = 0.5 * massKE * velocityKE * velocityKE;
                JOptionPane.showMessageDialog(null, "kinetic Energy is " + kineticEnergy);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
                        
        momentumButton.addActionListener(e -> {
            try{
                float massM = Float.parseFloat(enterMassM.getText());
                float velocityM = Float.parseFloat(enterVelocityM.getText());

                float momentum = massM * velocityM;
                JOptionPane.showMessageDialog(null, "Momentum is" + momentum);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
                        
        velocityButton.addActionListener(e -> {
            try{
                float distance = Float.parseFloat(enterDistance.getText());
                float time = Float.parseFloat(enterTime.getText());

                double velocity = distance / time;
                JOptionPane.showMessageDialog(null, "velocity is " + velocity);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        pressureButton.addActionListener(e -> {
            try{
                float force = Float.parseFloat(enterForce.getText());
                float area = Float.parseFloat(enterArea.getText());
                float pressure = force / area ;
                JOptionPane.showMessageDialog(null, "pressure is " + pressure);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        potentialEnergyButton.addActionListener(e -> {
            try{
                float massPE = Float.parseFloat(enterMassPE.getText());
                float heightPE = Float.parseFloat(enterHeightPE.getText());

                float potentialEnergy = massPE * 10 * heightPE;
                JOptionPane.showMessageDialog(null, "potential Energy is " + potentialEnergy);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
    }
}

