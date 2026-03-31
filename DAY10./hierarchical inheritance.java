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
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}
class Main{
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.eat();
        d.sound();
    }
}