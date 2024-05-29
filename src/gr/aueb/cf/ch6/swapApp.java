package gr.aueb.cf.ch6;

/**
 * Mutually interchanges the two values
 * of an array.
 *
 */
public class swapApp {
    public static void main(String[] args) {
        int[] arr = {1, 10};
        swap(arr);
        System.out.printf("arr[0] = %d, arr[1] = %d", arr[0], arr[1]); // arr[0] = 10, arr[1] = 1
    }

    public static void swap(int[] arr) {
        if (arr == null || arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
