public class Loops {

    public static void main(String[] args) {

        //Répétition des taches
        // loops - while, do while, for

//        int i = 1;
//        while(i <= 4){
//            System.out.println("Hi "+i);
//            int j = 1;
//            while(j <= 3){
//                System.out.println("Hello !");
//                j++;
//            }
//            i++;
//        }
//        System.out.println("GoodBye "+i);
//        do{
//            System.out.println("Hi !"+i);
//            i++;
//        }while(i < 5);

//        for (int i = 1; i <= 4; i++){
//            System.out.println("Hi "+i);
//            for (int j = 1; j <= 3; j++){
//                System.out.println("Hello ");
//            }
//        }
//        for (int i = 5; i >= 1 ; i--){
//            System.out.println("Hi "+ (i+1));
//        }

        for (int i = 1; i <= 5; i++){
            System.out.println("DAY "+i);
            for (int j = 9; j <= 17;j++){
                System.out.println("     "+ j + " - "+ (j+1));
            }
        }
        //Méthode 2
        for (int i = 1; i <= 5; i++){
            System.out.println("DAY "+i);
            for (int j = 1; j <= 9;j++){
                System.out.println("     "+ (j+8) + " - "+ (j+9));
            }
        }





    }
}
