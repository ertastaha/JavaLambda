package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FpFromUtils10 {
    public static void main(String[] args) {
        //Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
        /*
            1- distinct
            2- half of the elements
            3- greater than 5
            4- reverse
            5- list
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

        getHalfOfDistinctElementsInReverseOrder(l);

        //collect(Collectors.toList()) --> we used for making list.


    }

    public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> list) {
        List<Double> newList = list.stream().distinct().filter(t -> t > 5).map(Utils::getHalfOfElement).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("newList = " + newList);
    }
}
