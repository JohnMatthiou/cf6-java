package gr.aueb.cf.ch2;

/**
 * Template for programming.
 * Πολλαπλασιάζει δύο ακέραιους και εκτυπώνει
 * το αποτέλεσμα στην κονσόλα.
 */
public class Output2App {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 5;
        int totalPrice = 0;

        totalPrice = price * quantity;

        System.out.printf("Quantity: %3d, Price: %d, Total Price: %d\n", quantity, price, totalPrice );

    }
}
