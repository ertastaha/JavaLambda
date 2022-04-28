package lambdafunctionalprogramming03;

import java.util.stream.IntStream;

public class Fp09 {
    public static void main(String[] args) {
        //1- Create a method to find the sum of integers from 7 to 100
        //2- Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
        //3- Create a method to calculate the factorial of given number --> 5

        //IntStream does the some actions as for loop does in structured programming
        //rangeClosed(7, 100) is inclusive and inclusive

        //1-1 Way
        System.out.println(getSumFromSevenToHundred01());

        //1-2 Way
        System.out.println(getSumFromSevenToHundred02());

        //2
        System.out.println(getMultiplicationTwoToEleven());


        //3
        System.out.println(calculateFactorialNumber(5));


    }

    public static int getSumFromSevenToHundred01() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    public static int getSumFromSevenToHundred02() {
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    public static int getMultiplicationTwoToEleven() {
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

    public static Object calculateFactorialNumber(int x) {
        return x > 0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers";
    }
}
