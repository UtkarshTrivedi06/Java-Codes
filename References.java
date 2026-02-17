public class References {
    public static void main(String[] args) {
        Ref_Student s = new Ref_Student("Utkarsh");
        s.display();
    }
}
class Ref_Student{
    String name;
    Ref_Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: " + this.name);
    }
}