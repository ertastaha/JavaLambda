package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
        //Create a method to calculate the sum of the squares of distinct even elements

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

        sumOfSquaresOfDistinctEvenElements(l);
    }

    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
}
