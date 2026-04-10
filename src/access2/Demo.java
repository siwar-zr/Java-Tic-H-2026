package access2;
import access.*;

class C extends A {
    public void abc(){
        System.out.println(marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println(obj.marks);

        B obj2 = new B();
        System.out.println(obj2.marks);
    }
}
