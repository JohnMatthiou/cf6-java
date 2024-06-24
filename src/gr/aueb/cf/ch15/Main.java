package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point2D(5, 12);
        Point p3 = new Point3D(5, 9, 23);

        p3.movePlusOne();
        ((Point3D) p3).sayHi();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
