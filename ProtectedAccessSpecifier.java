public class ProtectedAccessSpecifier {
    public static void main(String[] args) {
        Prot_Parent p=new Prot_Parent();
        Prot_Child c = new Prot_Child();
        c.display();
        p.display();
    }
}
class Prot_Parent{ 
    protected void display(){
        System.out.println("Parent Class Display");
    }
}
class Prot_Child extends Prot_Parent{
    @Override
    protected void display(){
        System.out.println("Child Class Display");
    }
}