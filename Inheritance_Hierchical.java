public class Inheritance_Hierchical {
    public static void main(String[] args) {
        GermanShephard gs=new GermanShephard();
        Cat c=new Cat();
        gs.gsbarks();
        gs.barks();
        gs.set();
        gs.walks();
        c.meow();
        c.set();
        c.walks();
    }
}
class Animals{
    void set(){
        System.out.println("Animals");
    }
    void walks(){
        System.out.println("Animals can walk");
    } 
}
class Dog extends Animals{
    void barks(){
        System.out.println("Dogs");
    }
}
class GermanShephard extends Dog{
    void gsbarks(){
        System.out.println("German Shephard");
    }
}
class Cat extends Animals{
    void meow(){
        System.out.println("Cat");
    }
}