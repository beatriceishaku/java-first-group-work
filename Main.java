import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("what formula do you want to solve?");
        System.out.println("1 for kinetic energy");
        System.out.println("2 for potential energy");
        System.out.println("3 for velocity");
        System.out.println("4 for momentum");
        System.out.println("5 for pressure");
        Scanner input = new Scanner(System.in);
        int insert = input.nextInt();
        switch (insert){
            case 1:
                System.out.println("Enter the mass");
                mass = input.nextFloat();
                System.out.println("Enter the velocity");
                velocity = input.nextFloat();
                return kineticEnergy;
                
            case 2:
                
                System.out.println("Enter the mass");
                mass = input.nextFloat();
                System.out.println("Enter the Height");
                height = input.nextFloat();   
                return potentialEnergy;
                
            case 3:
                
                System.out.println("Enter the distance");
                distance = input.nextFloat();
                System.out.println("Enter the time");
                time = input.nextFloat();
                return velocity;
                
            case 4:
                
                System.out.println("Enter the mass");
                mass = input.nextFloat();
                System.out.println("Enter the velocity");
                velocity = input.nextFloat();   
                return momentum;
                
            case 5:
                
                System.out.println("Enter the force");
                force = input.nextFloat();
                System.out.println("Enter the area");
                area = input.nextFloat();   
                return pressure;
                                   
                
        

    }
}
