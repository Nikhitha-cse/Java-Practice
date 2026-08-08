import java.util.*;
public class Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int res=(s1.compareTo(s2));
        if(res==0){
            System.out.println("Strings are equal");
        }else if(res < 0){
            System.out.println(s1 + "comes before " + s2);
        } else{
            System.out.println(s1 + "comes after " + s2);
        }
           
        
    }
}