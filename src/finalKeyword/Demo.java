package finalKeyword;

// final - variable (constante), method (tu ne peux pas lui faire d'override), class (ne peut pas etre héritée)

final class Calc{
    public final void copyright(){
        System.out.println("By John");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

/*class AdvCalc extends Calc{
    *//*@Override
    public void copyright() {
        System.out.println("By Mark");
    }*//*
}*/
public class Demo {
    public static void main(String[] args) {

        //final int num = 8;
        //num = 9;
        //System.out.println(num);

        Calc obj = new Calc();
        obj.copyright();
        obj.add(1,2);
    }
}
