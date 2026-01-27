import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Input 1: ");
        int n1=sc.nextInt();
        System.out.println();
        System.out.print("Enter Input 2: ");
        int n2=sc.nextInt();
        System.out.println();
        int sum=n1 + n2;
        System.out.print(sum);
        sc.close();
    }
}
