import java.util.*;
public class UL{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int Upper=0;
        int lower=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='Z'){
                Upper++;
            }else{
                lower++;
            }
        }
        System.out.println("Upper letters: " + Upper);
        System.out.println("Lower letters: " + lower);
    }
}