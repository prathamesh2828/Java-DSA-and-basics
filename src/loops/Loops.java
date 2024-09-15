package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {




    /*
        Syntax of for loops;

        for (intialization; condition; increment/ decrement){
                // body
        }
    */


        // Q: Print numbers from 1 to 5

//        for (int num = 1; num <=5 ; num++) {
//            System.out.println(num);
//        }
     //print numbers from 1 to n


//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        for (int num = 1; num <=n ; num++) {
////            System.out.print(num+" ");
//            System.out.println("hello world");
//
//        }




    // while loops
        /*
        syntax:
        while (condition){
         //body
        }
         */

//        for (int num = 1; num <=5 ; num++) {
//            System.out.println(num);
//        }

        int num=1;
        while(num<=5){
//            System.out.println(num);
            num+=1;
        }


        // do while
        /*

        syntax:
            do {

            }while(condition);
         */
    int n=1;
        do{
            System.out.println("hello world");
        }
        while(n != 1);
// in do while loop the program is going to execute atleast once .

    }
}
