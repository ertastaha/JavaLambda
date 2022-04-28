package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils06 {
    public static void main(String[] args) {
        //Create a method to calculate the sum of the squares of ditinct even elements

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

        sumOfSquareOfDistinctEvenElements(l);
    }

    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Math::addExact);
        System.out.println(sum);
    }
}
