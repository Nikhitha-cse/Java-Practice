public interface Anima{
    void sound();

 class dog implements Anima{
    public void sound(){
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args){
        Anima a=new dog();
        a.sound();
    }


}