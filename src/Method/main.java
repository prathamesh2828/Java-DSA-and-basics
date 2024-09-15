package Method;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // methods are functions of java

        // Q: take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("enter 1st number:");
         num1 = in.nextInt();
        System.out.println("enter 2nd number:");
         num2 = in.nextInt();
         sum = num1+num2;
        System.out.println("the sum is :" + sum);

    }
}
