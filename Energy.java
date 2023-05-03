from operations.java import *;
public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return (0.5 * mass) * (velocity * velocity);
    }
    double potentialEnergy(int mass, float gravity, int height){
        return(mass * gravity * height);
    }
    double velocity(float distance, float time){
        return( distance/ time )
        }
    }
