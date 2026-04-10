package abstraction;

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("playMusic");
    }
}

abstract class BMW extends Car{
    /*@Override
    public void drive() {
        System.out.println("Driving BMW");
    }*/
    public void show(){
        System.out.println("Showing Infos");
    }
}

class AdvBMW extends BMW{
    @Override
    public void drive() {
        System.out.println("I can fly");
    }
}
public class Demo {
    public static void main(String[] args) {

        AdvBMW obj = new AdvBMW();
        obj.drive();
        obj.playMusic();
        obj.show();
    }
}
