interface Car{
    // By default all the variables are static and final in interface
    int wheels=4;
    void drive();
    void sleep();
}
interface Flight{
    void drive();
    void sleep();
    void fly();
}
interface Helicopter extends Flight{

}
class FlyingCar implements Helicopter,Car{
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
        System.out.print(Car.wheels);
    }
}
