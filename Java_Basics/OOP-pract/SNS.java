public class SNS{
String name;
static String college;

SNS(String name){
    this.name=name;
}
public void showName(){
    System.out.println(name);
}
public static void showCollege(){
    System.out.println(college);
}
public static void main(String[] args){
    SNS.college="RVclg";
    SNS s1=new SNS("Madhu");
    SNS s2=new SNS("Venu");
    s1.showName();
    s2.showName();
    SNS.showCollege();
}
}