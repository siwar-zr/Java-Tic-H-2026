package abstraction;

//Une methode sans body => abstract
//Une methode abstraite doit etre contenue dans une classe abstraite
//Une classe abstraite ne peut pas etre instanciée
//Une classe abstraite peut contenir des methodes abstraites et/ou concretes
//Une classe peut etre abstraite mais ne contient aucune methode abstraite => just pour ne pas instancier
//Une classe qui hérite d'une classe abstraite doit soit implémenter les methodes abstraites de la classe mere ou déclarée abstraite

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
