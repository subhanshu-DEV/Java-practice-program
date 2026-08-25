
//  class BankAccount{

//     private int balance;
//     void deposit(int amount) {
// balance = balance + amount;
//     }
//     int getbalance(){
//         return balance;

//     }
//  }

//  public class encapsulation {
//   public static void main(String[] args) {
//     BankAccount b = new BankAccount();
//     b.deposit(1000);
//     b.deposit(500);

//     System.out.println(b.getbalance());
//   }
// }

 class BankAccount{
    private int balance ;
    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        if (amount > balance) {
            balance = balance - amount;
        }else{
            balance = balance - amount;
        }
    
    }
    int getbalance(){
        return balance;
    }
 }
 public class encapsulation {
 
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
     b.deposit(1000);
    b.deposit(500);
    b.withdraw(1800);

    System.out.println(b.getbalance());
    }
    
 }
 

