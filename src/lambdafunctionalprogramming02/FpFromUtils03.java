package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils03 {
    public static void main(String[] args) {
        //Create a method that prints all the numbers more than 8 on the console

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

        getNumbersMoreThanEight(l);
    }

    public static void getNumbersMoreThanEight(List<Integer> list) {
        list.stream().filter(Utils::getMoreThanEight).forEach(Utils::printInSameLineWithSpace);
    }
}
