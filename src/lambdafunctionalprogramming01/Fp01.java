package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
   /*
                Lambda is a functional programming, we have had Lambda in Java with version 8.
                Functional programming focuses on "What to do?", with structured programming we focus on "How to do?"
                Functional programming is used just with Collections and Arrays.
                We cannot use Maps directly in functional programming, but we can convert Maps to Sets and use them we can use entrySet().
    */

        //Create a method to print the list elements on the console in the same line with a space between consecutive elements. (Structured)

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

        printElementsStructured(l);
        System.out.println();


        //Create a method to print the list elements on the console in the same line with a space between consecutive elements. (Functional)
        printElementsFunctional(l);

    }

    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    public static void printElementsFunctional(List<Integer> list) {
        //In stream we will see top to bottom. In lambda when we use stream we can use many available methods
        //t-> means that t takes your numbers by one by and represent your numbers
        list.stream().forEach(t -> System.out.print(t + " "));
    }
}
