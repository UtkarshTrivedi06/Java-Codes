public class Inheritance_Single {
    public static void main(String[] args) {
        Dog G=new Dog();
        G.set();
        G.walks();
        G.barks();
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