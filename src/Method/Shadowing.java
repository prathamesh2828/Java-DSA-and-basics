package Method;

public class Shadowing {

    static int x= 90; // this will be shadowed at line 9
    // lower level will overwrite the upper levwl hence the x= 90 will be now 40.
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 5 is shadowed by this
//        System.out.println(x); // scope will begun when value is initialized
         x = 40; // this initialization will be for this perticular scope only
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x); // will print 90 beacuse it will consider the upper level due to the scope of x which is 40.

    }
}
