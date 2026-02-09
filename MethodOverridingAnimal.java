public class MethodOverridingAnimal {
    public static void main(String[] args){
        Animal a= new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        c.sound();
        a.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dogs barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}