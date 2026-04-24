package functionalInterface;

@FunctionalInterface
interface A{
    //void show(int i);
    int add(int i, int j);
}
/*class B implements A{
    @Override
    public void show() {
        System.out.println("in show");
    }
}*/
public class Demo {
    public static void main(String[] args) {
        //A obj = i -> System.out.println("in show "+ i);
        A obj = (i,j) -> i+j;

        int result = obj.add(5,2);
        System.out.println(result);
    }
}
