import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        boolean id = true;

        if (age>=18 && id ==true) {
            System.out.println("Entry allowed");
        }else{
            System.out.println("Entry not allowed");
        }

    }
}
