public class Super_CallingConstructor {
    public static void main(String[] args) {
        new Child();
    }
}
class Parent{
    Parent(){
        System.out.println("Parent class Constructor.");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class Constructor.");
    }
}
