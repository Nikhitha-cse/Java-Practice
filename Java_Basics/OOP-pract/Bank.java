public class Bank{
    private double balance;

    public void setBalance(double balance) {
        this.balance=balance;
    if(balance >= 0){
        this.balance=balance;
    } else{
        System.out.println("Invalid balance");
    }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setBalance(-50000);
        System.out.println(b.getBalance());
    }
    
}