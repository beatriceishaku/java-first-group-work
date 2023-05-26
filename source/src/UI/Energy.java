package UI;
public class Energy extends operations{
    double kineticEnergy(float mass, float velocity) {
        return multiply((float) multiply(0.5F,mass), (float) power2(velocity));
    }

    double potentialEnergy(int mass, float gravity, int height){
        return multiply((float) multiply(mass, gravity), height) ;
    }
    double velocity(float distance, float time){
        return divide(distance, time);
        }
    double pressure(float force, float area){
        return divide(force,area);
    }
    double momentum(float mass, float velocity){
        return multiply(mass, velocity);
        }
}
