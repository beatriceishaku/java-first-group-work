from operations.java import *;
public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return (0.5 * mass) * (velocity * velocity);
    }
    double potentialEnergy(int mass, int gravity, int height){
        return(mass * gravity * height);
    }
    }
