import java.util.*;
public class cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter a symbol (+ , -, *, /): ");
        char symbol = sc.next().charAt(0);
        double result;

        if(symbol== '+') {
            result=num1 + num2;
        } else if(symbol == '-') {
            result=num1 - num2;
        } else if(symbol == '*') {
            result=num1 * num2;
        } else if(symbol == '/') {
            result=num1 / num2;
        } else {
            System.out.println("Invalid num");
            return;
        }
        System.out.println("Answer: " + result);
    } 
}