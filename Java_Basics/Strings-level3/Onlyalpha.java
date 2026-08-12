import java.util.*;
public class Onlyalpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isalpha=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch<'a'||ch>'z') && (ch<'A'||ch>'Z')){
               isalpha=false;
               break;
            }
        }
        if(isalpha){
            System.out.println("Only alphabets");
        } else{
            System.out.println("Not only alphabets");
        }
    }
}