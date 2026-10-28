import java.util.Scanner;

public class exercise3_3 {
    public static void main(String[] args) {
        /**
         * Convert a total number of seconds to hours, minutes and seconds.
         */

        int seconds;
        Scanner in = new Scanner(System.in);
        System.out.print("How many seconds? ");
        seconds = in.nextInt();
        
        System.out.printf("%d", seconds / 3600);
        System.out.printf(" hours, %d", (seconds % 3600) / 60);
        System.out.printf(" minutes, %d", seconds % 60);
        System.out.println(" seconds");


    }    
}
