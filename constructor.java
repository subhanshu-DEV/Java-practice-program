// // // // class Student{
// // // //     String name;
// // // //     Student() {
// // // // name="rahul";
// // // //     }
// // // // }
// // // // public class constructor {

// // // //     public static void main(String[] args) {
// // // //         Student s1 = new Student();
// // // //         Student s2 = new Student();
// // // //         System.out.println(s1.name);
// // // //         System.out.println(s2.name);
// // // //     }
// // // // }

// // // class Student{
// // //     String name;
// // //     Student(String n){
// // // name = n;
// // //     }

// // // }
// // // public class constructor {

// // //     public static void main(String[] args) {
// // //         Student s1 = new Student("rahul");
// // //         Student s2 = new Student("aman");
// // //         System.out.println(s1.name);
// // //         System.out.println(s2.name);
// // //     }
// // // }
 

// // /**

// //  */
// // class Student{
// //     String name;
// //     Student(){
// //         name = "rahul";
// //     }
// // }
// // public class constructor {
// // public static void main(String[] args) {
// //     Student s1 = new Student();
// //     Student s2 = new Student();

// //     s2.name ="aman";
// //     System.out.println(s1.name);
// //     System.out.println(s2.name);
// // }
    
// // }





// /**
//  * constructor
//  */
// class Book{
//     String title;
//     int price;
//     Book(){
//         title = "java";
//         price =500;
//     }
// }

// public class constructor {
// public static void main(String[] args) {
//     Book b1 = new Book();
    
// System.out.println(b1.title);
// System.out.println(b1.price);
// }
    
// }


class Book{
    String title;
    int price;

Book(String t,int p){
    title = t;
    price = p;
}
}

public class constructor {
public static void main(String[] args) {

    Book b1 = new Book("spring boot",700);
System.out.println(b1.title);
System.out.println(b1.price);
}
    
}
