package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι.
 */
public class LightOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean areLightsOn = false;
        boolean isRunning = false;
        boolean isRaining = false;
        boolean isDark = false;
        final int MAX_SPEED = 100;
        int speed = 0;

        System.out.println("Please insert if it's raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining && (isDark || isRunning);

        System.out.println("The lights are on: " + areLightsOn);


    }
}
