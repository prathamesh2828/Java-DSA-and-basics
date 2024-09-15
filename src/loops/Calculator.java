package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not press X or x
    int ans = 0;

        while (true){
            // take the operator as input
            System.out.println("enter the operator: ");

            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two number
                System.out.println(" enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1- num2;
                }
                if (op == '*'){
                    ans = num1*num2;
                }
                if (op == '/'){
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                  ans = num1 % num2;
                }

            }

            // this condition is for terminating the infinite loop
            else if (op == 'x' || op == 'X'){
                break;
            }

            // this condition is to tell that the operator typed is invalid..
            else {
                System.out.println("Invalid Operation..!!");
            }

            System.out.println(ans);
        }



    }
}
