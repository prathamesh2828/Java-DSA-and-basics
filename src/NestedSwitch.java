import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String departement = in.next();

        switch(empID){
            case 1 :
                System.out.println("prathamesh shinde");
                break;
            case 2 :
                System.out.println("rahul rana");
                break;
            case 3 :
                switch (departement){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("Management department");
                        break;

                    default:
                        System.out.println("no department elocated");

                }
            default:
                System.out.println("enter correct empID  ");




        }
    }
}
