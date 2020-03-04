import java.util.Scanner; 

public class programmingFundamentals {
    public static void main(String[] args) {


        // creating scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // obtaining user input for mass 
        System.out.println("Enter a mass (kg): ");

        // creating mass variable with data from user inputted scanner
        double mass = scanner.nextDouble();

        // closing the scanner
        scanner.close();


        // Calculate the velocity of a standing wave


        // force is calculated from acceleration due to
        // gravity (9.8m/s/s) multiplied by a mass (kg)
        final double force = (9.8 * mass);
        

        // mass per unit length of wire (green)
        // given: 5.13e-3 kg/m
        final double mu = (5.13e-3);


        // velocity is calculated by the square root
        // of Force divided by Mu
        double velocity = (Math.sqrt(force/mu));

        
        // print out resultant velocity
        System.out.printf("Velocity: %.2f m/s", velocity);
    }
}
