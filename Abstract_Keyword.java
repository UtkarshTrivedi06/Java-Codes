

public class Abstract_Keyword {
    public static void main(String[] args) {
        A_Shape s= new A_Circle();
        s.draw();
        s.message();
    }
}
abstract class A_Shape{
    abstract void draw();//ABstract method

    void message(){
        System.out.println("This is a Shape");
    }
}
class A_Circle extends A_Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}