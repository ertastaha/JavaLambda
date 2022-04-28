package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils01 {

    /*
            In functional programming we use Lambda expressions, but when we use method reference,
            Lambda expressions will not be recommended.
            When we use method reference we have "Class name :: method name"
            Be careful about parenthesis. ()--> no need.
     */
    public static void main(String[] args) {
        //Create a method to print the list elements on the console in the same line with a space between consecutive elements. (Functional)

        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        printElementsFunctional2(l);

    }

    public static void printElementsFunctional1(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    public static void printElementsFunctional2(List<Integer> list) {
        list.stream().forEach(Utils:: printInSameLineWithSpace);
    }
}
