import java.util.ArrayList;
public class Demo{
    public static void main(String[] args){
ArrayList<Integer> marks=new ArrayList<>();
marks.add(80);
marks.add(90);
marks.add(75);
marks.add(90);
System.out.println(marks);
System.out.println(marks.get(2));
System.out.println(marks.set(1,95));
System.out.println(marks);
System.out.println(marks.remove(2));
System.out.println(marks);
System.out.println(marks.size());
System.out.println(marks.contains(95));
}
}