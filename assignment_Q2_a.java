public class assignment_Q2_a{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            if(i==0||i==4){
                for(int j=0;j<5;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                System.out.print("* ");
                for(int j=0;j<3;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
    }
}