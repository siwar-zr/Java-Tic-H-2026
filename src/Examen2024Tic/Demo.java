package Examen2024Tic;

public class Demo {
    public static void main(String[] args) {
       /* int x = 5;
        while(isAvailable(x)){
            System.out.println(x);
            x--;
        }*/
        CompteBancaire cb1 = new CompteBancaire("126699",100);
        try{
            cb1.retrait(80);
        } catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }
    }

    /*public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }*/
}
