public class Animals{
    void sound(){
        System.out.println("Animal makes sound");
    }
    static class Dog extends Animals{
       void sound(){
          //   super.sound();
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args) {
        Animals a=new Dog();
        a.sound();
    }
}