import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            double Measurement = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("What is your measurement in meters");
            if (in.hasNextDouble()) {
                Measurement = in.nextDouble();
                System.out.println("Your measurement in miles is " + (Measurement/1609));
                System.out.println("Your measurement in feet is " + (Measurement*3.281));
                System.out.println("Your measurement in Inches is " + (Measurement*39.37));
            } else {
                System.out.println("invalid input try again");
            }
        }
    }
}