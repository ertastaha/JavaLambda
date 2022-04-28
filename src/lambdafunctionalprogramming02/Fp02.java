package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

    public static void main(String[] args) {
        //Create a method to calculate the product of the cubes of distinct even elements

        List<Integer> l = new ArrayList<Integer>();
        l.add(2);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        productOfCubesOfDistinctEvenElements(l);
    }

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println("product = " + product);
    }
}
