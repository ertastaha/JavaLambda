package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp04 {
    public static void main(String[] args) {
        //Create a method to sort the elements according to their lengths then according to their first characters

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

        printAllElementsByTheirLengthAndFirstInitialChars(l);

    }
    public static void printAllElementsByTheirLengthAndFirstInitialChars(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).forEach(Utils::printInSameLineWithSpace);
        //you can use thenComparing(Utils::getFirstChar) --> thenComparing(t-> t.charAt(0)
    }
}
