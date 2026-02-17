public class MethodOverridingAnimal {
    public static void main(String[] args){
        MO_Animal a= new MO_Animal();
        MO_Dog d=new MO_Dog();
        MO_Cat c=new MO_Cat(); 
        d.sound();
        c.sound();
        a.sound();
    }
}
class MO_Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class MO_Dog extends MO_Animal{
    @Override
    void sound(){
        System.out.println("Dogs barks");
    }
}
class MO_Cat extends MO_Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}