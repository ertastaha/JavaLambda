package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {

        //Create a method to print all list elements in uppercase in the same line with a space.

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

        //1.Way
        printInUpperCase01(l);

        //2.Way
        printInUpperCase02(l);
    }

    public static void printInUpperCase01(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);
    }

    public static void printInUpperCase02(List<String> list) {
        list.replaceAll(String::toUpperCase);//Object is mutable class in Java
        System.out.println(list);

    }

}
