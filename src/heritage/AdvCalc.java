package heritage;

public class AdvCalc extends Calc {

    public int multi(int a, int b){
        return a*b;
    }

    public int div (int a, int b){
        return a/b;
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b)+1 ;
    }
}
