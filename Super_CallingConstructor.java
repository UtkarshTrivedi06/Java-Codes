public class Super_CallingConstructor {
    public static void main(String[] args) {
        new Super_Child();
    }
}
class Super_Parent{
    Super_Parent(){
        System.out.println("Parent class Constructor.");
    }
}
class Super_Child extends Super_Parent{
    Super_Child(){
        super();
        System.out.println("Child class Constructor.");
    }
}
