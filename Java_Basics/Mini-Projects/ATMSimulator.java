import java.util.Scanner;
public class ATMSimulator {
     static Scanner sc=new Scanner(System.in);
    static int pin=1234;
    static double balance=5000;

    public static void main(String[] args) {
    boolean verified=false;
    for(int i=0;i<3;i++){
     System.out.println("Enter PIN: ");
     int enteredPin=sc.nextInt();
     if(enteredPin == pin) {
        verified=true;
        break;
     } else {
        System.out.println("Invalid Pin");
     }
        }
   if (verified == false) {
    System.out.println("Account Blocked");
   }
if(verified) {
    int choice=0;
    while(choice != 5){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
        
       choice=sc.nextInt();
        switch(choice) {
        case 1: System.out.println("Your current Balance  is: " + balance);
        break;
        case 2: System.out.println(" Enter amount to Deposit: ");
        double depo=sc.nextDouble();
        balance=balance + depo;
        System.out.println("Latest balance: " + balance);
        break;
        case 3: System.out.println("Enter amount to withdraw: ");
        double wd=sc.nextDouble();
        if(wd < balance){
            balance=balance-wd;
            System.out.println("Withdraw Successful");
            System.out.println("Remaining balance: " + balance);
              }
          else{
            System.out.println("Insufficient Balance");

             }
        break;
        case 4: System.out.println("Enter your current PIN: ");
        int Epin=sc.nextInt();
        if(Epin != pin){
         System.out.println("Incorrect PIN");
         } else {
            System.out.println("Enter new PIN: ");
            int newpin=sc.nextInt();
            pin=newpin;
            System.out.println("Successfully changed");
         }
        break;
        case 5: System.out.println("Thank You");
        break;
        
        default:
            System.out.println("Invalid choice");
    }
    }
   }


    }
}