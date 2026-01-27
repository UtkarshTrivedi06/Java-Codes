public class StaticVariable {
    static int count =0;

    public StaticVariable() {
        count++;
        System.out.println(count);
    }
    public static void main(String []args){
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        System.out.println("Final Count "+ StaticVariable.count);
    }
}
