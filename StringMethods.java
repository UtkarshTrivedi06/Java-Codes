
public class StringMethods {
    public static void main(String[] args) {
        String s1 ="   Hello World.";
        String s2= new String(" Doing Java"); 
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.trim());
        System.out.println(s1.concat(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(1,5));
        System.out.println(s1.replace('H','K'));
    }   
}
