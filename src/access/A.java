package access;

class Start{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);
    }
}
public class A {
    protected int marks = 6;
    public void aaa(){
        System.out.println(marks);
    }
}
