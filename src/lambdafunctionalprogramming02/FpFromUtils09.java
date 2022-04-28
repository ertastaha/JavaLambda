package lambdafunctionalprogramming02;

import java.util.ArrayList;
import java.util.List;

public class FpFromUtils09 {
    public static void main(String[] args) {
        //Create a method to find the minumum value which is greater than 7 and even from the list

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

        getMinGreaterThanSeven(l);
    }

    public static void getMinGreaterThanSeven(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }
}
