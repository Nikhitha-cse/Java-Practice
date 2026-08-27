abstract class Shape{
    abstract void draw();
    public void display(){
        System.out.println("This is a shape");
    }
    Shape(){
        System.out.println("Shape constructor");
    }

   static class circle extends Shape{
    void draw(){
            System.out.println("Circle is drawn");
        }
    }
    static class rectangle extends Shape{
        void draw(){
            System.out.println("Drawing rectangle");
        }
    }
    public static void main(String[] args){
        Shape s1=new circle();
        s1.draw();
        Shape s2 =new rectangle();
        s2.draw();
        s1.display();
        s2.display();
    }
}