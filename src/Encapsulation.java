import java.util.Scanner;

class Human{

    private int age;
    private String name;

    public Human(){}


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Encapsulation {

    public static void main(String[] args) {

        /*Human h1 = new Human(25,"Mark");
        *//*System.out.println(h1.getName() + " : " + h1.getAge());
        h1.setAge(29);
        h1.setName("John");*//*
        Human h2 = new Human(18,"John");
        System.out.println(h1.getName() + " : " + h1.getAge());
        System.out.println(h2.getName() + " : " + h2.getAge());*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrez votre nom : ");
        String name = sc.nextLine();
        Human h2 = new Human(age,name);
        System.out.println(h2.getName() + " : " + h2.getAge());

        //System.out.println("Bonjour " + name + ", Vous avez " + age + " ans ! ");
        sc.close();



    }
}
