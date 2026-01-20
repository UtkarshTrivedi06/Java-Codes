public class InstanceVariable {
    int id;
    String name;

    public static void main(String [] args){
        InstanceVariable I=new InstanceVariable();
        I.id=226;
        I.name="Utkarsh";
        System.out.printf("Id: %d \nName: %s",I.id,I.name);
    }
}
