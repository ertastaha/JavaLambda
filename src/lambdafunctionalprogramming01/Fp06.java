package lambdafunctionalprogramming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp06 {
    public static void main(String[] args) {
        //Create a method to find the minumum value which is greater than 7 and even from the list

        /*
                1- more than 7
                2- even
                3- min value
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

        //1.Way
        getMinGreaterThanSeven01(l);

        //2.Way
        getMinGreaterThanSeven02(l);

        //3.Way
        getMinGreaterThanSeven03(l);

    }

    public static void getMinGreaterThanSeven01(List<Integer> list) {
        Integer minValue = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).
                                         reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(minValue);
    }
    public static void getMinGreaterThanSeven02(List<Integer> list) {
        Integer minValue = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).
                           sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(minValue);
    }
    public static void getMinGreaterThanSeven03(List<Integer> list) {
        Integer minValue = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).sorted().findFirst().get();
        System.out.println(minValue);
    }
}
