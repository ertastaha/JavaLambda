package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.List;

public class Fp04 {
    public static void main(String[] args) {
        //Create a method to print the cube of distinct (unique) odd list elements on the console
        //in the same line with a space between two consecutive elements. (Functional)

        /*
                1- elements should be distinct (unique)
                2- elements should be odd
                3- elements printed as cube
         */

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

        printCubeOfDistinctOfOddElements(l);

    }

    public static void printCubeOfDistinctOfOddElements(List<Integer> list) {
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+ " "));
    }
}
