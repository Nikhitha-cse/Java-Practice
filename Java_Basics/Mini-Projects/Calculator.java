import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice='y';
        while(choice != 'y' && choice!= 'n'){
            System.out.println("Invalid choice. Please enter y or n");
             }

        while(choice == 'y'){ 
        
            System.out.println("=====CALCULATOR=====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("6 Modulus");
            System.out.println("Enter your menuchoice: ");
            int menuchoice=sc.nextInt();
            
            int n1=0;
            int n2=0;
            if(menuchoice != 5){
                try {
                    System.out.println("Enter first number: ");
                    n1=sc.nextInt();
                    System.out.println("enter second number: ");
                    n2=sc.nextInt();
                } catch(InputMismatchException e) {
                    System.out.println("Invalid input");
                    sc.next();
                    continue;
                }
            }
            
        switch(menuchoice) {
            case 1 : 
            int result1=add(n1,n2);
            System.out.println(result1);
            break;
            
            case 2 : 
            int result2=subtract(n1,n2);
                System.out.println(result2);
                break;

            case 3 : 
            int result3=multiply(n1,n2);
                System.out.println(result3);
                break;

            case 4:
                try{
                    int result4=division(n1,n2);
                    System.out.println(result4);
                } catch(ArithmeticException e) {
                    System.out.println("cannot divide by zero");
                }
                break;
            case 5:
                System.out.println("Exiting calculator");
                choice = 'n';
                break;
            case 6:
                int result6=modulus(n1,n2);
                System.out.println(result6);
                break;
            default:
                System.out.println("Invalid choice");
                break;
            
        }
               if(menuchoice != 5) {
                System.out.println("Do you want to continue (y/n) ?"); 
                choice=sc.next().charAt(0);
               }
        }   
         }
         static int add(int n1, int n2){
            return n1 + n2;
         }
         static int subtract(int n1, int n2){
            return n1 - n2;
         }
         static int multiply(int n1, int n2){
            return n1 * n2;
         }
         static int division(int n1, int n2){
            return n1 / n2;
         }
         static int modulus(int n1, int n2){
            return n1 % n2;
        }
    
    }
