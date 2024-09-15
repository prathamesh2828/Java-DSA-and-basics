import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
//       String fruit = in.next();

// switch case
// in switch statemenets, you can jumpto various cases based on your expression.
// no duplicates are allowed
//


//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("a red fruit");
//            case "grapes" -> System.out.println("green juicy fruit");
//            default -> System.out.println("please enter a valid fruit.");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }

    }
}


