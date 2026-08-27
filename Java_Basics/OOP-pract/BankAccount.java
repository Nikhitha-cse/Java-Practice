public class BankAccount{
    private int accnum;
    private double balance;
BankAccount(int accnum,double balance){
        this.accnum=accnum;
        this.balance=balance;
    }
    public void deposit(double amount){
            if(amount > 0){
                balance=balance + amount;
            }else{
                System.out.println("Invalid amount");
            }
        }
    public void withdraw(double amount){
            if(amount <=0){
                System.out.println("Invalid amount");
            } else if(amount > balance){
                System.out.println("Insufficient balnce");
            }else{
              balance=balance-amount;
            }
            }
        public double getBalance(){
            return balance;
        }
        public static void main(String[] args){
            BankAccount ba=new BankAccount(1234 , 50000);
            System.out.println("Enter amout to deposit: ");
            ba.deposit(5000);
            System.out.println(ba.getBalance());
            System.out.println("Enter amount to withdraw: ");
            ba.withdraw(2000);
            System.out.println(ba.getBalance());
            
        }
        }