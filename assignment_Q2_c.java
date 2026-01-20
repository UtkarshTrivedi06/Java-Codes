public class assignment_Q2_c {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i!=0){
                for(int j=0;j<2*i-1;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i>=0;i--){
            for(int j=0;j<3-i;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i!=0){
                for(int j=0;j<2*i-1;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
