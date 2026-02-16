import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        num.add(100);
        num.add(200);
        num.add(300);

        System.out.println("Vector: "+num);
        num.remove(1);
        System.out.println("Vector (New): "+num);

        System.out.println("Size: "+num.size());
        System.out.println("Element at Index 0: "+ num.get(0));

    }
}
