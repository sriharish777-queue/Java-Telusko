class Laptop{
    String name;
    int price;
    public boolean equals(Laptop obj){
       return (this.name.equals(obj.name)&& this.price==obj.price);
    }

}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        Laptop obj1=new Laptop();
        obj1.name="Dell";
        obj1.price=35000;
        Laptop obj2=new Laptop();
        obj2.name="Dell";
        obj2.price=35000;
        // if(obj1.name.equals(obj2.name)&& obj1.price==obj2.price){
        //     System.out.print("Both are same");
        // }
        // else{
        //     System.out.print("Both are not same");
        // }
        boolean result = obj1.equals(obj2);
        System.out.print(result);

    }
}
