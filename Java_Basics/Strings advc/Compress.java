import java.util.*;
public class Compress{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch==s.charAt(i+1)){
                count++;
            }else{
                System.out.print(""+ ch + count);
                count=1;
            }
        }
        System.out.print("" + s.charAt(s.length()-1) + count);


    }
}