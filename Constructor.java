class Student{
    String name;
    int age;
    static int count=0;
    Student(){
        name="Default Name";
        age=10;
        count++;
        System.out.println("Calling COnstructor");
    }
    Student(String n,int a){
        name=n;
        age=a;
        count ++;
    }
    void display(){
        System.out.printf("Student %d:\n Name -  %s  \n Age - %d\n",count,name,age);
    }
}
public class Constructor {
    public static void main(String[] args){
        new Student();
        Student std1 =new Student();
        Student std2=new Student("Utkarsh",19);
        std1.display();
        std2.display();
    }
}
