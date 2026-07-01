class A{
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        B obj=new B();
        obj.show();
        obj.config();

    }
}
