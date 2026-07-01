class A{
    public A(){
        System.out.println("a's constructor");
    }
    public A(int num){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("b's constrcutor");
    }
    public B(int num){
        this();
        System.out.println("in B int");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        B obj=new B(5);

    }
}
