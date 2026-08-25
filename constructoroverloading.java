// class Book{
//     String title;
//     int price;

//     //Default constructor
//     Book(){
// title ="java";
// price = 500;
//     }

//     // Parameterized Constructor
//     Book(String t,int p){
//         title = t;
//         price = p;
//     }
// }

// public class constructoroverloading {
//     public static void main(String[] args) {
//         Book b1 = new Book();
//         Book b2 = new Book("Spring boot",700);
//         System.out.println(b1.title);
//         System.out.println(b1.price);
//         System.out.println(b2.title);
//         System.out.println(b2.price);
//     }
// }


// class Student{
//     private String name;
//     void setName(String n){
//         name = n;
        
//     }
//     String getName(){
//         return name;
//     }
// }
// public class constructoroverloading {
// public static void main(String[] args) {
//     Student s = new Student();
//     s.setName("rahul");
//     System.out.println(s.getName());
// }
    
// }

class Student{
    private String name;
    private int age;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
public class constructoroverloading {

    public static void main(String[]args){
Student s = new Student();
s.setName("rahul");
s.setAge(22);
System.out.println(s.getName());
System.out.println(s.getAge());
}

}
