public class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    public void showDetails(){
        double salary=40000;
        System.out.println(name + " " + salary);
    }
    public void showName(){
        System.out.println(name);
    }
    public static void main(String[] args){
        Employee e=new Employee("nikki");
        e.showDetails();
        e.showName();
    }
}