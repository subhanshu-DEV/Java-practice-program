import java.util.Scanner;

public class userinput {

// public static void main(String[] args) {
//     Scanner sc = new
//     Scanner (System.in);
//     System.out.println("Enter first number");
//    int a = sc.nextInt();
//  System.out.println("Enter second number");
//     int b =sc.nextInt();
   
//     int sum = a + b;
//     System.out.println("the sum of these number is");
// System.out.println(sum);

// }
// }

//  public static void main(String[] args) {
    
//  Scanner sc = new Scanner (System.in);
//  System.out.println("Enter your name");
// String name= sc.nextLine();
// System.out.println("hellow:" + name);
// System.out.println("enter your age");
// int age =sc.nextInt();
// System.out.println("Your age is :" + age);;
// }
// }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number");
    int a = sc.nextInt();
    System.out.println("Enter your second number");
    int b = sc.nextInt();
    int reminder = a % b;
   System.out.println("Reminder is:" + reminder);
}
}