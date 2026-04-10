package heritage;

class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }

}
class B extends A{
    public B(){
        super(5); //In A int
        System.out.println("In B"); // In B
    }
    public B(int n){
        this();
        System.out.println("In B int"); //In B Int
    }

}

class C extends B{

}


class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Demo {

    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2,4);
        int r2 = obj.sub(5,3);
        int r3 = obj.multi(7,3);
        int r4 = obj.div(8,2);
        double r5 = obj.power(2,3);


        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        //B obj = new B(5);
    }
}
