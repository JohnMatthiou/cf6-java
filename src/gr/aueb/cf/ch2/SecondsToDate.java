package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsToDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;
        int seconds = 0;

        System.out.println("Please insert total seconds");
        seconds = in.nextInt();
        remainingSeconds = seconds;

        days = remainingSeconds / SECS_PER_DAY;
        remainingSeconds %= SECS_PER_DAY;

        hours = remainingSeconds / SECS_PER_HOUR;
        remainingSeconds %= SECS_PER_HOUR;

        minutes = remainingSeconds / SECS_PER_MINUTE;
        remainingSeconds %= SECS_PER_MINUTE;

        System.out.printf("Input seconds: %d = %d days, %d hours, %d minutes, %d seconds",
                seconds, days, hours, minutes, remainingSeconds);


    }
}
