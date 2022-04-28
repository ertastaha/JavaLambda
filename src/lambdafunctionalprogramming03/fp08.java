package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;

public class fp08 {
    public static void main(String[] args) {
        //1- Create a method to check if the initial of any element is not 'X'
        //2- Create a method to check if at least one of the elements ending with 'r'

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
        System.out.println(checkIfInitialOfElementIsNotX(l));

        //noneMatch() --> checks all values

        //2
        System.out.println(checkAtLeastAnyMatch(l));
        //anyMatch() --> checks by one by

    }

    public static boolean checkIfInitialOfElementIsNotX(List<String> list) {
        return list.stream().noneMatch(t -> t.startsWith("X"));
    }

    public static boolean checkAtLeastAnyMatch(List<String> list) {
        return list.stream().anyMatch(t -> t.endsWith("r"));
    }

}
