public class Casting {
    public static void main(String []args){
        double myDouble=9.78;
        double new_double;
        int myInt=9;
        int new_int;
        //Narrowing Casting
        new_double=myInt;
        //Widening Casting
        new_int=(int)myDouble;
        System.out.println(new_double);
        System.out.println(new_int);
    }
}
