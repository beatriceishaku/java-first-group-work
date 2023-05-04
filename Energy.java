from operations.java import *;
public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return multiply(multiply(0.5 ,mass),pow2(velocity));
    }
    double potentialEnergy(int mass, float gravity, int height){
        return multiply(multiply(mass, gravity), height));
    }
    double velocity(float distance, float time){
        return divide(distance, time);
        }
    }
