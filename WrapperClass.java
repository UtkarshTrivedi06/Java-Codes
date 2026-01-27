public class WrapperClass {
    public static void main(String[] args) {
        int x=5;
        Integer wrappedX= Integer.valueOf(x);// Boxing
        int unwrappedx = wrappedX.intValue();//Unboxing
        System.out.println("Wrapped "+ wrappedX + " Unwrapped "+ unwrappedx);
    }
}
