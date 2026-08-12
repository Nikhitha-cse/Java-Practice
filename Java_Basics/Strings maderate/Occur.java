import java.util.*;
public class Occur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int res= s.indexOf(ch);
        int r=s.lastIndexOf(ch);
        System.out.println("Index first is: " + res);
        System.out.println("Index last is: " + r);
    }
}