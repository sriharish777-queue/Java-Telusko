interface Car{
    void drive();
    void sleep();
}
interface Flight{
    void drive();
    void sleep();
    void fly();
}

class FlyingCar implements Flight,Car{
    public void drive(){
        System.out.println("Airbus is driving");
    }
    public void sleep(){
        System.out.println("Airbus is sleeping");
    }
    public void fly(){
        System.out.println("Airbus is flying");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        FlyingCar f=new FlyingCar();
        f.drive();
        f.sleep();
        f.fly();
    }
}
