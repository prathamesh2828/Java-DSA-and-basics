package loops;

import java.math.BigInteger;

public class CountNums {
    public static void main(String[] args) {
        int n = 45533656;

        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 3){
                count++;
            }
            n = n /10;
        }
        System.out.println(count);
    }
}
