package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp02 {
    public static void main(String[] args) {

        //1- Create a method to print the elements after ordering according to their lengths
        //2- Create a method to print the elements after ordering according to their lengths (In reverse order)

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


        //1
        printTheElementsOrderedBasedOnLength01(l);

        //2
        printTheElementsOrderedBasedOnLength02(l);

    }
    public static void printTheElementsOrderedBasedOnLength01(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }
    public static void printTheElementsOrderedBasedOnLength02(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }

}
