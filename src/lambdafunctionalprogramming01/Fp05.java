package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.List;

public class Fp05 {
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

        //1.Way
        getMaxElement01(l);

        //2.Way
        getMaxElement02(l);
    }

    public static void getMaxElement01(List<Integer> list) {

        //With reduce() you can operate min, max, sum etc.
        Integer maxValue=list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maxValue);
    }

    public static void getMaxElement02(List<Integer> list) {

        //sorted() sort the elements in natural order
        Integer maxValue= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(maxValue);
    }
}
