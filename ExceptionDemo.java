// public class ExceptionDemo {
//     public static void main(String[] args) {
//         try{
//             int result = 10/2;
//            // System.out.println("HELLO");
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error");
//            // System.out.println("Cannot divided by zero");
//     }
//     finally{
//         System.out.println("Finally block executed");
//     }
//     }

// }



// public class ExceptionDemo {

//     public static void main(String[] args) {
//         int age = 15;
//         try{
//         if (age< 18) {
//             throw new ArithmeticException("Age is less than 18");
//         } 
//         }
    
// catch(ArithmeticException e){
//     System.out.println(e.getMessage());
// }
// System.out.println("program continue....");
//     }}



// public class ExceptionDemo {

//     static void checkAge(int age) throws ArithmeticException{
//     if (age < 18) {
//         throw new ArithmeticException("Age is less than 18");
//     }
//     System.out.println("Eligible");
//     }
//     public static void main(String[] args) {
//         try{
//             checkAge(15);
//         }
//         catch(ArithmeticException e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println("PROGRAM COMNTINUES.....");
//     }
// }

public class ExceptionDemo {

    public static void main(String[] args) {
        try{
            System.out.println("Outer try");

            try{
                int a = 10/0;
            }
            catch(ArithmeticException e){
                System.out.println("Inner catch; cannot by divided by zero");
            }
        }
        catch(Exception e){
            System.out.println("outer catch");
        }
   System.out.println("program continues......");         
        
    }
}