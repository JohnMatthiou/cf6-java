package gr.aueb.cf.ch6;

public class ReducingApp {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 34};
        System.out.println("Sum of array values: " + getSum(arr));
        System.out.println("Average of array values: " + getAvg(arr));

    }


    /**
     * Reduces the input arr to sum of its elements.
     *
     * @param arr   the input array.
     * @return      the sum of array elements.
     */
    public static int getSum(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public static double getAvg(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return (double) sum / arr.length;
    }
}
