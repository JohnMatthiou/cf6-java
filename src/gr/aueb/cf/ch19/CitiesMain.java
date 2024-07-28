package gr.aueb.cf.ch19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.stream.Stream;

public class CitiesMain {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Athens", "Rome", "Rome", "Paris", "Berlin", "Athens", "London");

        Stream<String> sortedCities = cities.stream()
                .filter(c -> !c.equals("Athens"))
                .sorted();

        sortedCities.forEach(System.out::println);


        // Output: [Berlin, London, Paris, Rome]
    }
}
