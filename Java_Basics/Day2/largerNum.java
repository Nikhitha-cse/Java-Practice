import java.util.Scanner;
public class largerNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First number: ");
        int a=sc.nextInt();
        System.out.println("Enter a second number: ");
        int b=sc.nextInt();
        
        if(a > b){
            System.out.println(a + " IS larger");
        
        else if(a < b){
            System.out.println(a + " is smaller");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}