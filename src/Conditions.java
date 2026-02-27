public class Conditions {

    public static void main(String[] args) {

//        int n = 5;
//
//        if (n > 10 && n <= 20){ //11 --> 20
//            System.out.println("Hello !");
//            System.out.println("Thank you !");
//        }else if (n <= 10)
//            System.out.println("Bye !");
//        else
//            System.out.println("GoodBye !");

        int age = 19;
        boolean tr = false;

//        if (age < 18)
//            System.out.println("Mineur");
//        else if (tr)
//            System.out.println("Majeur et travaille ");
//        else
//            System.out.println("Majeur et ne travaille pas");
        //Méthode 1
        String msg = "";
        msg = age < 18 ? "Mineur" : tr ? "Majeur et travaille ":"Majeur et ne travaille pas";
        System.out.println(msg);
        //Méthode 2
        System.out.println(age < 18 ? "Mineur" : tr ? "Majeur et travaille ":"Majeur et ne travaille pas");

//        if (age < 18)

//            System.out.println("Mineur");
//        else {
//            if (tr)
//                System.out.println("Majeur et travaille ");
//            else
//                System.out.println("Majeur et ne travaille pas");
//        }

//        int n = 4;
//        int result = 0;

//        if (n % 2 == 0)
//            result = 10;
//        else
//            result = 20;

        //Ternary Operator : affichage/ affectation conditionnée
        //var = condition ? val si true : val si false
        //result = n % 2 == 0 ? 10 : 20;

    }
}
