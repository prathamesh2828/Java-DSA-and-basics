package firstprogram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
      //TypeCasting
//     int num = (int)(53.67f);
//        System.out.println(num);
//        // this will return the int value of 53.67 that is 53 it will noit round it off.

        //automatic type promotion in expressions
//        int a = 257;
//        byte b =(byte)(a); // 257 % 256 =1


//        byte a =40;
//        byte b =50;
//        byte c =100;
//        int d=(a*b)/c;
//
//
//        System.out.println(d);
//
//
//        byte b =50;
//        b = b*2;
//        int number = 'A';
//        System.out.println(number);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d =0.52162;

        double result =(f * b) + (i / c)-(d - s);
        System.out.println((f * b) +" "+ (i / c)+" "+(d - s));
        System.out.println(result);





    }
}
