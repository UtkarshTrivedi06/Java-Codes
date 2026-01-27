public class InnerClass {
    class Inner{
        void display(){
            System.out.println("Inner Class Method");
        }
    }
    public static void main(String []args){
        InnerClass.Inner obj = new InnerClass().new Inner();
        obj.display();
    }
}
