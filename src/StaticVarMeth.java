
class Mobile{
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Mobile m){
        System.out.println(m.brand + " : " + m.price + " : " + type);
    }
}
public class StaticVarMeth {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=2500;
        m1.type="smartphone";

        Mobile m2 = new Mobile();
        m2.brand="Samsung";
        m2.price=1500;
        m2.type="smartphone";

        //Mobile.type="phone";

        m1.show();
        m2.show();
        Mobile.show1(m1);

    }
}
