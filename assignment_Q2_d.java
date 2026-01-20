public class assignment_Q2_d {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(i>j){
                    System.out.print(j+1+" ");
                }else if (i==2&&j==2) {
                    System.out.print("  ");
                }
                else{
                    System.out.print(i+1+" ");
                }
            }
            for(int j=2;j>0;j--){
                if(j>i){
                    System.out.print(i+1+" ");
                }
                else{
                   System.out.print(j+" "); 
                }
            }
            
            System.out.println();
        }
        for(int i=1;i>=0;i--){
            for(int j=0;j<3;j++){

                if(i>j){
                    System.out.print(j+1+" ");
                }else if (i==2&&j==2) {
                    System.out.print("  ");
                }
                else{
                    System.out.print(i+1+" ");
                }
            }
            for(int j=2;j>0;j--){
                if(j>i){
                    System.out.print(i+1+" ");
                }
                else{
                   System.out.print(j+" "); 
                }
            }
            
            System.out.println();
        }
    }
}
