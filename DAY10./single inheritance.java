class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}