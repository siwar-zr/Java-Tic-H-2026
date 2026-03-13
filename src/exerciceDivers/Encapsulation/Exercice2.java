package exerciceDivers.Encapsulation;

import java.util.Scanner;

class CompteBancaire{
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        solde += montant;
        System.out.println("Le montant " + montant + " est déposé avec succès !");
    }

    public void retirer(double montant){
        if (solde >= montant){
            solde -= montant;
            System.out.println("retrait avec succès !");
        }else{
            System.out.println("Solde Insuffisant !");
        }
    }
}


public class Exercice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre solde initial : ");
        double solde = sc.nextDouble();

        sc.nextLine();

        System.out.println("Entrez votre numero du compte : ");
        String numC = sc.nextLine();

        //System.out.println(solde + " : " + numC);

        CompteBancaire cb = new CompteBancaire(numC,solde);
        System.out.println("Le solde initial est : "+cb.getSolde());

        System.out.println("1er dépot : ");
        cb.deposer(500);
        cb.getSolde();
        System.out.println("1er retrait : ");
        cb.retirer(700);
        cb.getSolde();
        System.out.println("2eme retrait : ");
        cb.retirer(800);
        cb.getSolde();
        System.out.println("3eme retrait : ");
        cb.retirer(100);
        cb.getSolde();


    }
}
