import java.util.Scanner; // Package

public class bugs { // Class

    public static void main(String[] args) { // Method
        /*
        String name; 
        int age; // Token
        Scanner in = new Scanner(System.in); 
        System.out.print("What is your name? ");
        name = in.nextLine(); // Statement
        System.out.print("Hello " + name + " and how old are you? ");
        age = in.nextInt();
        System.out.print("Nice, so you are " + name + " and you are " + age + " years old.\n\n");

        int n1, n2;
        System.out.print("Give me one number: ");
        n1 = in.nextInt();
        System.out.print("Another one: ");
        n2 = in.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); // Expression
        */

        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; // Capitalized for FINAL convention 
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt();

        cm = inch * CM_PER_INCH; 
        //System.out.print(inch + " in = ");
        System.out.printf("inches = %d", inch); // Formatting integer base 10 decimal
        //System.out.println(cm + " cm");


    }
}