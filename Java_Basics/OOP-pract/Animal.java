public class Animal{
   String name;
   void eat() {
    System.out.println("Animal is eating");
   }

public static void main(String[] args) {
  Dog d=new Dog();
  d.eat();
  d.bark();
  Cat c=new Cat();
  c.eat();
    }
}
class Dog extends Animal{
void bark(){
    System.out.println("Dog is barking");
}
}
class Cat extends Animal {

}
