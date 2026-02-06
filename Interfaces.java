public class Interfaces {
    public static void main(String[] args) {
        I_Dog a= new I_Dog();
        a.sound();
        a.walk();
        a.meow();
    }
}
interface I_Animal{
    void sound();
    void walk();
}
interface I_Cat{
    void meow();
}
class I_Dog implements I_Animal,I_Cat{
    public void sound(){
        System.out.println("Woof");
    }
    public void walk(){
        System.out.println("Run");
    }
    public void meow(){
        System.out.println("Dogs dont meow");
    }
}
