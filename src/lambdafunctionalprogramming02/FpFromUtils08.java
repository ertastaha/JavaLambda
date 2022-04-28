package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils08 {
    public static void main(String[] args) {
        //Create a method to find the maximum value from the list elements

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

        getMaxElement(l);
    }

    public static void getMaxElement(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }
}
