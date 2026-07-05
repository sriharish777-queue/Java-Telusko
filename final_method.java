class Calc{
    public final void show(){
        System.out.println("I am a calculator");
    }
    public final int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    public void show(){
        System.out.println("I am an advanced calculator");
    }
    public int mul(int a,int b){
        return a*b;
    }
}
class Demo{
    public static void main(String[] args) throws ClassNotFoundException{
        AdvCalc ac=new AdvCalc();
        ac.show();

    }
}
