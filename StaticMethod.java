//Class Calculator
public class StaticMethod {
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String []args){
        System.out.println("Sum: "+StaticMethod.add(20,30));
    }
}
