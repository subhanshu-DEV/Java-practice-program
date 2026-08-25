 import java.util.Scanner;

 public class switchcase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number(1-3):");
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//             System.out.println("monday");
//            // break;
//             case 2:
//             System.out.println("tuesday");
//            // break;
//             case 3:
//             System.out.println("wednesday");
//             //break;
//             default:
//                 System.out.println("Invalid Number");
//         }
//     }
// }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println(a+b);
            break;
    case 2:
        System.out.println(a-b);
        break;
        case 3:
            System.out.println(a*b);
            break;
            case 4:
                System.out.println(a/b);
                break;
        default:
            break;
    }}}
    