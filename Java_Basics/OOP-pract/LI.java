public class LI{
    String name;
    LI(String name){
        this.name=name;
    }
    public void showDetails(){
        int marks=85;
        System.out.println(name + " " + marks);
    }
    public static void main(String[] args){
        LI l=new LI("Chintu");
        l.showDetails();
    }
}