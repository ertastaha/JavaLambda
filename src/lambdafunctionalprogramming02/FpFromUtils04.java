package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils04 {
    public static void main(String[] args) {
        //Create a method to print the square of odd list elements on the console
        //in the same line with a space between two consecutive elements. (Functional)
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

        printSquareOfOddElements(l);
    }

    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInSameLineWithSpace);
    }
}
