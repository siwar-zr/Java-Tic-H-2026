package abstraction;
//class - class -> extends
//class - interface -> implements
//interface - interface -> extends
interface B {
    int age = 10;    //static final
    String name = "John";
    void show();    //public abstract
    void config();
}

interface X extends B{
    void run();
}

class Y implements X{
    @Override
    public void run() {
        System.out.println("Y run....");
    }
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}

class C implements B,X{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}

public class A {
    public static void main(String[] args) {

        B obj;
        //obj = new B();
        obj = new C();
        obj.config();
        obj.show();

        X obj1 = new C();
        obj1.run();
        //obj1.show();

        C obj2 = new C();
        obj2.config();
        obj2.run();
        obj2.show();


        System.out.println(B.name);
        //B.age = 40;


    }
}
