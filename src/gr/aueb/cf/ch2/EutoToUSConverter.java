package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο που
 * συμβολίζει ένα ποσό σε ευρώ και το μετατρέπει
 * με βάση κάποια ισοτιμία (parity) σε US dollars
 * και Us cents.
 */
public class EutoToUSConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert the amount in euro");
        euros = in.nextInt();

        totalCents = euros * PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;

        System.out.printf("%,d euros = %d total cents = %,d dollars and %d cents",
                euros, totalCents, dollars, remainingCents);
    }
}
