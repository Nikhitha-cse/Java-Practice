import java.util.*;
public class Concate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String res=String.join(" ",s1,s2);
        System.out.println("Word : " + res);
    }
}