package enums;

enum Status{
    Running, Failed, Pending, Success
}
public class Demo {
    public static void main(String[] args) {

        int i = 5;
        //Status s = Status.Running;
        //System.out.println(s);
        //System.out.println(s.ordinal());

        Status[] ss = Status.values();
        //System.out.println(ss);

        for (Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }

        String e1 = "Pending";
        Status s1 = Status.valueOf(e1);
        System.out.println(s1);
    }
}
