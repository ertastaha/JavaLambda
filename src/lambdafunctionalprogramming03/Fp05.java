package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;

public class Fp05 {
    public static void main(String[] args) {
        //Remove the elements if the length of the element is greater than 5

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

        removeTheElementsWhoseLengthGreaterThanFive(l);
        //removeIf() checks the condition is true or false (boolean)
    }

    public static void removeTheElementsWhoseLengthGreaterThanFive(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        System.out.println(list);
    }
}
