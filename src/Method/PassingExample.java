package Method;

public class PassingExample {
    public static void main(String[] args) {
        String name = "prathamesh shinde";
        greet(name);
    }

    static void greet(String naam){
        System.out.println(naam);
    }
}


// main(){
//    name = "kunal"
//    greet(name);
//}
//greet(naam){
//    print(naam);
//}

// here we declare the function by naam and pass the value by name
// in java there is no pass by refference thers only pass by Value..
