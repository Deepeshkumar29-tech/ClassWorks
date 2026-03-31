class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class  Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Dog{
    public void hello(){
        System.out.println("Cat Meows");
    }
}
class Main{
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.eat();
        c.sound();
        c.hello();
    }
}