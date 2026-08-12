import java.util.*;
public class Onlydigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isdigit=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9'){
                isdigit=false;
                break;
            }
        } 
             if(isdigit){
               System.out.println("Only digits"); 
             }
            else{
                System.out.println("Not only digits");
            }
        }
}