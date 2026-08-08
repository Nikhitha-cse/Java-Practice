import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        scan.nextLine();
        TreeSet<String> ts=new TreeSet();
        for(int i=0; i<n-1; i++){
            String str = scan.nextLine();
            String strArr[] = str.split(" ");

            String command = strArr(0);

            switch(command)
            {
                case"ADD":ts.add(strArr[1]);
                break;
            } 
            case "CHECK":  
            if(ts.contains(strArr[1])) 
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
                break;
            }
            case "REMOVE": ts.remove(strArr[1]);
            break;

            case "FIRST":  if(ts.isEmpty)
            {
                System.out.println("NO LANGUAGES");
            }
            else
            {
                System.out.println(ts.first());
            }
            break;

            case "LAST":
                if(ts.isEmpty())
                {
                    System.out.println("NO LANGUAGES");
                }
                else
                {
                     System.out.println(ts.last());
                     break;
                }
                case "PRINT":
                    if(ts.isEmpty()) 
                    {
                        System.out.println("NO LANG");
                    }
                    else
                    {
                        System.out.println(" ", ts);
                        break;
                    }
      }
    }
}