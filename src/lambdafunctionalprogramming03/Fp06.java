package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Fp06 {

    public static void main(String[] args) {
        //Remove the elements if the length is between 8 and 10 or ending with 'o'

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

        removeTheElementsLengthInBetween8And10OrEndsWith(l);
    }

    public static void removeTheElementsLengthInBetween8And10OrEndsWith(List<String> list) {
        //In Java you can make shorter.Predicate works only functional programming.
        Predicate<String> checkCondition = t -> t.length() > 7 && t.length() < 11 || t.endsWith("o");
        list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);
    }
}
