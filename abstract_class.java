abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music...");
    }
}
class BMW extends Car{
    public void drive(){
        System.out.println("Driving BMW...");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        Car obj=new BMW();
        obj.drive();
        obj.playMusic();

    }
}
