import java.util.Scanner;

public class exercise3_2 {
    public static void main(String[] args) {
        /** 
         * Converts a temperature from Celsius to Fahrenheit.
         */

        double temp;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Give me the temperature in Celsius: ");
        temp = in.nextDouble();
        
        final double CELSIUS_TO_FAHRENHEIT = temp * (double) 9/5 + 32;

        System.out.printf("%.1f C = %.1f F", temp, CELSIUS_TO_FAHRENHEIT);
    }
}
