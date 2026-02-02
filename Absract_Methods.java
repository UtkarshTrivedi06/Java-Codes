public class Absract_Methods {
    public static void main(String[] args) {
        Animal animal=new Doggy();
        animal.bark();
        animal.eat();
    }
}
abstract class Animal{
    abstract void bark();
    void eat(){
        System.out.println("Animal eats");
    }
}
class Doggy extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}