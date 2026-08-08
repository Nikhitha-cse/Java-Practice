import java.util.*;
public class Special{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int digit=0;
        int special=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>= '0' && ch<= '9'){
                digit++;
            }
            else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch== ' ')){

            } else {
                special++;
            }
        }
        System.out.println("Digits: " + digit);
        System.out.println("Special chars: " + special);
    }
}