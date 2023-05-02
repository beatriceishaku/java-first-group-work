from operations.java import *;
public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return (0.5 * mass) * (velocity * velocity);
    }
    }
