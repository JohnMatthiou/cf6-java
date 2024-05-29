package gr.aueb.cf.ch13;

public class MobileContactMain {

    public static void main(String[] args) {
        MobileContact alice = new MobileContact("Alice", "W.", "699999999");
        alice.insertContact();

        MobileContact mobileContact = alice.getContactByPhoneNumber();
        System.out.println(mobileContact.contactToString());

    }
}
