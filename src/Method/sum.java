package Method;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
      int sum = a + b;
      return sum;
    }



    // retrun the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("enter 2nd number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
//        System.out.println("the sum is :" + sum);
        return sum;
    }


   static void sum(){
       Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("enter 2nd number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is :" + sum);
    }


//    access modifiesr (we will look it into OOP) return_type name(){
//        //body
//        return statement;
//    }

}
