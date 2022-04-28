package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp07 {
    public static void main(String[] args) {
        //Create a method to find the half of the elements which are distinct  and greater than 5 in reverse order in the list

        /*
                1- distinct
                2- half of the elements
                3- grater than 5
                4- reverse
                5- return to list
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

        getHalfOfDistinctElemetnsInreverseOrder(l);
    }

    public static void getHalfOfDistinctElemetnsInreverseOrder(List<Integer> list) {
        //2.0 makes double
        List<Double> newList = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).
                               sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(newList);
    }
}
