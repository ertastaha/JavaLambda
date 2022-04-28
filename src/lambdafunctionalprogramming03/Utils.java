package lambdafunctionalprogramming03;

public class Utils {
    public static void printInSameLineWithSpace(Object o) {//We chose Object because it is more general.
        System.out.print(o + " ");
    }
    public static char getLastChar(String str) {
        return str.charAt(str.length()-1);
    }
    public static char getFirstChar(String str) {
        return str.charAt(0);
    }
}
