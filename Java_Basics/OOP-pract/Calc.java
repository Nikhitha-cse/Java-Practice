public class Calc {
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
        public double add(double a ,double b){
            return a+b;
        }
    
public static void main(String[] args) {
  Calc c=new Calc();
  System.out.println(c.add(10,20));
  System.out.println(c.add(10,20,30));
  System.out.println(c.add(10.5,20.5));

    }
}