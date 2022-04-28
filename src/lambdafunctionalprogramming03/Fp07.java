package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;

public class Fp07 {
    public static void main(String[] args) {
        //Create a method to check if the lengths of all elements are less than 12

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

       //allMatch()--> This method will check all the values with no exception
        System.out.println(checkTheLengthsToBeLessThanTwelve(l));
    }

    public static boolean checkTheLengthsToBeLessThanTwelve(List<String> list) {
       return list.stream().allMatch(t-> t.length()<11);
    }
}
