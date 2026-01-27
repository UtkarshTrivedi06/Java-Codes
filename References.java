public class References {
    public static void main(String[] args) {
        Student s = new Student("Utkarsh");
        s.display();
    }
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: " + this.name);
    }
}