class Amazon{
    void deliver(){
        System.out.println("product will be delivered");
    }
}
class standarddelivery extends Amazon{
    void deliver(){
        System.out.println("product will be delivered in 5d");
    }
}
class ExpressDelivery extends Amazon{
    void deliver(){
        System.out.println("product will be delivered in 2d");
    }
}
class primedelivery extends Amazon{
    void deliver(){
        System.out.println("product will be delivered in 24hrs");
    }
}
class Main{
    public static void main(String[] args) {
        Amazon a;
        a=new standarddelivery();
        a.deliver();
        a=new ExpressDelivery();
        a.deliver();
        a=new primedelivery();
        a.deliver();
        
    }
}