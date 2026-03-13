package exerciceDivers.Encapsulation;

import java.util.Scanner;

class Livre{
    private String titre;
    private String auteur;
    private boolean dispo;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.dispo = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void emprunter(){
        if (this.dispo){
            dispo = false;
            System.out.println("Livre emprunté avec succès !");
        }else{
            System.out.println("Echec d'emprunt ! Livre déjà emprunté !");
        }

    }

    public void retourner(){
        dispo = true;
        System.out.println("Livre retourné !");
    }

    public void infos(){
        System.out.println(titre + " : " + auteur + " : " + dispo);
    }
}



public class Exercice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le titre du livre : ");
        String t1 = sc.nextLine();

        System.out.println("Entrez le nom de l'auteur du livre : ");
        String a1 = sc.nextLine();

//        System.out.println("Entrez la disponibilité du livre : ");
//        boolean dispo = sc.nextBoolean();

        Livre l1 = new Livre(t1,a1);
        System.out.print("Les infos du livre : ");
        l1.infos();

        System.out.println("1er emprunt : ");
        l1.emprunter();
        l1.infos();

        System.out.println("Tentative du deuxième emprunt : ");
        l1.emprunter();
        l1.infos();

        System.out.println("Retour du livre : ");
        l1.retourner();
        l1.infos();


    }
}
