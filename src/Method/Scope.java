package Method;

public class Scope {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        String name = "prathamesh";
        // block scope
        // in block scope the variables which are initialized inside it will remain accessable for the inside only
        // the already initialized variable cant be initialized again in the block scope
        // the already initialized variable can be modified inside the block scope
        {
//          int a = 98; // already initialized outside the block in the same method , hence u cant initialize again.

            a = 90; // reassign the original ref variable to some other value
            name = "vaishnavi";
            int c = 25;
            // value initialized in this block will remain in the block.

            System.out.println(a);
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block

    // scoping in for loops
        for (int i = 0; i<4;i++){
            System.out.println(i);
            int num= 90;
        }
//        System.out.println(i);


    }
    static void random(int marks){
        int num= 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
