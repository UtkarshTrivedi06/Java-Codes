public class This_Keyword {
    public static void main(String[] args) {
        thisAnimal a = new thisAnimal("Max");
        a.display();
    }
}
class thisAnimal{
    String name;
    thisAnimal(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Display "+this.name);
    }
}