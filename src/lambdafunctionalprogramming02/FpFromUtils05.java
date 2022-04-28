package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils05 {
    public static void main(String[] args) {
        //Create a method to print the cube of distinct (unique) odd list elements on the console
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

        printCubeOfDistinctOfOddElements(l);

    }

    public static void printCubeOfDistinctOfOddElements(List<Integer> list) {
        list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInSameLineWithSpace);
    }
}
