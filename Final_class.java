final class Calc{
    public int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    public int mul(int a,int b){
        return a*b;
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        AdvCalc ac=new AdvCalc();
        int r1=ac.add(10,20);
        System.out.println(r1);

    }
}
