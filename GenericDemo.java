// class Box<T>{
//     T value;
//     void set(T value){
//         this.value = value;
//     }
//     T get(){
//         return value;
//     }
// }
// public class GenericDemo {
 
//     public static void main(String[] args) {
//         Box<Integer>box = new Box<>();
//         box.set(100);
//         System.out.println(box.get());

//     }
// }

// public class GenericDemo {

//     public static <T> void printvalue(T value){
//         System.out.println(value);
//     } 
//     public static void main(String[] args) {
//         printvalue("Pallav");
//         printvalue(100);
//         printvalue(10.5);
//     }
// }


class Box<T extends Number>{
    T value;
    void set(T value){
        this.value = value;
    }
    T get() {
return value;
    }
}
public class GenericDemo {

    public static void main(String[] args) {
        Box<Integer>b1 = new Box<>();
        b1.set(100);
        Box<Double>b2 = new Box<>();
        b2.set(10.5);


        System.out.println(b1.get());
        System.out.println(b2.get());
    }
    
}