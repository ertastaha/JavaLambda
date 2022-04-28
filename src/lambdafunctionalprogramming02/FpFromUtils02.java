package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils02 {

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

        printEvenElementsFunctional(l);

    }

    public static void printEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInSameLineWithSpace);
    }
}
