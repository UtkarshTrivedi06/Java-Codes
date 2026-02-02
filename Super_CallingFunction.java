public class Super_CallingFunction {
    public static void main(String[] args) {
        Child c= new Child();
        c.display();
    }
}
class Parent{
    void display(){
        System.out.println("Parent class method.");
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Child class method.");
    }
}