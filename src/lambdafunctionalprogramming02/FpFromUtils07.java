package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils07 {

    public static void main(String[] args) {
        //Create a method to calculate the product of the cubes of distinct even elements

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

        productOfCubeOfDistinctEvenElements(l);
    }

    public static void productOfCubeOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
        System.out.println(product);
    }
}
