package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
    public static void main(String[] args) {

        //Create a method to print the even list elements on the console in the same line with a space between consecutive elements. (Structured)

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

        printEvenElementsStructured(l);
        System.out.println();

        //Create a method to print the list elements on the console in the same line with a space between consecutive elements. (Functional)

        printEvenElementsFunctional(l);
    }

    public static void printEvenElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void printEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
}
