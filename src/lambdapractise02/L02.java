package lambdapractise02;

import java.util.Arrays;

public class L02 {

    // ortalamadan büyük olan elementleri yazdırın
    //input []= {1,2,3,4,5,6,7};    --->  output : 4;


    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5, 6, 7};

        //getAsDouble olmazsa Optional yazdırır.

        double ort = Arrays.stream(input).average().getAsDouble();

        Arrays.stream(input).filter(t-> t>=ort).forEach(System.out::println);


    }
}
