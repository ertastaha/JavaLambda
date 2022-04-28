package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        //Create a method to sort the distinct elements by using their last characters

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printDistinctElementsSortedByLastChar(l);

    }
    public static void printDistinctElementsSortedByLastChar(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInSameLineWithSpace);
        //for comparing value of last indexes, we use sorted(Comparator.comparing(Utils::getLastChar))--> a, i,  k, n, ...
    }
}
