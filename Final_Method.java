public class Final_Method {
    public static void main(String[] args) {
        Final_Child c= new Final_Child();
        c.display();
    }
}
class Final_Parent{
    final void display(){
        System.out.println("Final method in parent class");
    }
}
class Final_Child extends Final_Parent{
    //void display(){
    //    System.out.println("Final method in Child class");
    //};
    //It will show error as final class cant be overriden by child class
}