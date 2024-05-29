package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωντικό του n.
 * Δηλαδή n! = 1*2*3...*n
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int number = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Please insert number");
        number = in.nextInt();

        while(i <= number) {
            factorial *= i;
            i++;
        }

        System.out.printf("%d! = %d", number, factorial);
    }
}
