package loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);

        // .next() will print the scanned string
        // .trim() will print the string trimming the blank spaces before the sring starts ignoring the spaces..
//        String word = "hello";
//        System.out.println(word.charAt(0));

//        System.out.println(in.next().trim());

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("uppercase");
        }
//        System.out.println(ch);
    }
}
