class Calc{
    public int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    public int add(int a,int b){
        return a+b+10;
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(3,7);
        System.out.println(r1);

    }
}
