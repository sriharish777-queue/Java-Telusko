abstract class Animal{
    abstract void sound();
    abstract void eat();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void eat(){
        System.out.println("Dog eats meat");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
    public void eat(){
        System.out.println("Cat eats fish");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        Animal dog = new Dog();
        Animal cat = new Cat();dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}
