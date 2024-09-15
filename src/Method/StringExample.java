package Method;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//       String message = greet();
//        System.out.println(message);


        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = in.next();
        String personailised = myGreet(name);
        System.out.println(personailised);
    }

    private static String myGreet(String name) {
        String message = "hello "+ name;
        return  message;

    }

    static String greet(){

        String greeting = "how are you";
        return greeting;
    }
}
