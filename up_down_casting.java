class A{
    public void show1(){
        System.out.println("This is class A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("This is class B");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        //upcasting
        A obj=(A)new B();
        obj.show1();

        //downcasting
        A obj1=new B();
        B obj2=(B) obj1;
        obj2.show2();

    }
}
