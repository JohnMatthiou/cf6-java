package gr.aueb.cf.ch7;

public class IndexOfSubStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf("o");
        int positionOfNexto = s.indexOf('o', 2);
        System.out.println("Position of o: " + positionOfo);
        System.out.println("Position of next o: " + positionOfNexto);

        String odToEnd = s.substring(1);
        System.out.println(odToEnd);

        String od = s.substring(1, 3);
        System.out.println(od);
    }
}
