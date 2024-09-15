package firstprogram;


import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Input_java {
    public static void main(String[] args) {
        System.out.println("to print any number enter number");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

        System.out.println("to print string enter the string:");
        Scanner takestring = new Scanner(System.in);
        System.out.println(takestring.next());

    }
}
