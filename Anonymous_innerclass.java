class A{
    public void show(){
        System.out.println("This is an outer class");
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
       A obj=new A()
       //This is an anonymous class that extends class A implementing the show() method
       {
        public void show(){
            System.out.println("This is an anonymous class");
        }
       };
       obj.show();
    }
}
