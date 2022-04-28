package lambdafunctionalprogramming02;

public class Utils {


    public static void printInSameLineWithSpace(Object o) {//We chose Object because it is more general.
        System.out.print(o + " ");
    }//Class name :: method name

    public static boolean checkToBeEven(int x) {
        return x % 2 == 0;
    }

    public static boolean getMoreThanEight(int x) {
        return x > 8;
    }

    public static boolean checkToBeOdd(int x) {
        return x % 2 != 0;
    }

    public static int getSquare(int x) {
        return x * x;
    }

    public static void printElementsWithStar(Object o){
        System.out.println(o+ " *");
    }

    public static int getCube(int x) {
        return x * x*x;
    }
    public static double getHalfOfElement(int x) {
        return x / 2.0;
    }
}
