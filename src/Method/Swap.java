package Method;

public class Swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;



        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(20,30);
        System.out.println("a="+ a + ", " + "b=" + b);

        String name = "prathamesh shinde";
        System.out.println(name);
    }

    static void changeName(String name){
        name = "vaishnavi tonpe"; // creating a new object hence it cant be replaced
    }
// strings are final classes and not mutable due to security reasons

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

// primitives: int, short, char, byte.. (passing the value)

// objects and reff : passing value of the ref variable

// psvm(){
// a = 10
// b = 20
// swap (a,b)
// }
//swap(num1, num2){
// temp = num1;
// num1 = num2;
// num2 = temp;
// }

// num1 will point to 10 and num2 to 20,(value will be passed)
