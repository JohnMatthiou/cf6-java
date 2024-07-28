package gr.aueb.cf.ch19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 10.5, 10),
                new Product("Honey", 20.5, 20), new Product("Honey", 30.5, 30),
                new Product("Milk", 90.5, 8) ));

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                .thenComparing(Product::getQuantity));

        products.forEach(System.out::println);



//        Collections.sort(products, Comparator.naturalOrder());
//        products.forEach(System.out::println);
//
//        System.out.println();
//
//        Collections.sort(products, Comparator.reverseOrder());
//        products.forEach(System.out::println);
    }
}
