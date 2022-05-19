package lambdapractise02;

import java.util.Arrays;

public class L01 {
    public static void main(String[] args) {
        //int [][]input={{10,20,30},{4},{6,7,20}} ----> output = {60, 4, 33}


        int[][] input = {{10, 20, 30}, {4}, {6, 7, 20}};

        Arrays.stream(input).map(t-> Arrays.stream(t).sum()).forEach(System.out::println);
        System.out.println();

        Arrays.stream(input).map(t-> Arrays.stream(t).sum()).forEach(t-> System.out.println(t+" "));

        System.out.println("flatmap tüm parantezleri kaldırır");

        Arrays.stream(input).flatMapToInt(Arrays::stream).forEach(System.out::println);

        System.out.println("flatmap toplam");

        System.out.println(Arrays.stream(input).flatMapToInt(Arrays::stream).sum());


    }
}
