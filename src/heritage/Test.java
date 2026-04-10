package heritage;

class X{

    public void show(){
        System.out.println("In X show");
    }
    public void config(){
        System.out.println("I am in config");
    }
}

class Y extends X{
    public void show(){
        System.out.println("In Y show");
    }

    @Override
    public void config() {
        //super.config();
        System.out.println("In Y config");
    }
}
public class Test {

    public static void main(String[] args) {
        Y obj = new Y();
        //obj.show();
        obj.config();
    }
}
