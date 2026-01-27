public class Inheritance_MultiLevel{
    public static void main(String[] args) {
        Child c=new Child();
        c.gpdisplay();
        c.pdisplay();
        c.cdisplay();
    }
}
class GrandParent{
    void gpdisplay(){
        System.out.println("Grandparent");
    }
}
class Parent extends GrandParent{
    void pdisplay(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void cdisplay(){
        System.out.println("Child");
    }
}