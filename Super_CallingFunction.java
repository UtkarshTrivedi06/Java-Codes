public class Super_CallingFunction {
    public static void main(String[] args) {
        SuperF_Child c= new SuperF_Child();
        c.display();
    }
}
class SuperF_Parent{
    void display(){
        System.out.println("Parent class method.");
    }
}
class SuperF_Child extends SuperF_Parent{
    void display(){
        super.display();
        System.out.println("Child class method.");
    }
}