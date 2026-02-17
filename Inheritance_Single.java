public class Inheritance_Single {
    public static void main(String[] args) {
        Inheritance_Dog G=new Inheritance_Dog();
        G.set();
        G.walks();
        G.barks();
    }
}
class Inheritance_Animals{
    void set(){
        System.out.println("Animals");
    }
    void walks(){
        System.out.println("Animals can walk");
    } 
}
class Inheritance_Dog extends Inheritance_Animals{
    void barks(){
        System.out.println("Dogs");
    }
}