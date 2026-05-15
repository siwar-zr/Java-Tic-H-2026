package correctionExamen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JeuSplitFiction {

    List<Joueur> joueurs = new ArrayList<>();
    List<Niveau> niveaux = new ArrayList<>();

    public void ajouterJoueur(Joueur j){
        this.joueurs.add(j);
    }

    public void ajouterNiveau(Niveau n){
        this.niveaux.add(n);
    }

    public void joueurPasseNiveau(String nomJoueur){
        List<Joueur> joueursTriés = this.joueurs.stream()
                .filter(j -> j.nom.equalsIgnoreCase(nomJoueur))
                .toList();

        if (joueursTriés.isEmpty()){
            System.out.println("Le joueur n'existe pas");
        }
        Joueur j = joueursTriés.get(0);

        try{
            j.passerNiveau();
            System.out.println("Le joueur " + nomJoueur + " a passé au niveau suivant!");
        } catch (JoueurException e){
            System.out.println(e.getMessage());
        }
    }

    public void supprimer(int indice){
        if (this.joueurs.isEmpty()){
            System.out.println("La liste est vide");
        }
        if (indice < 0 || indice >= this.joueurs.size()){
            System.out.println("L'indice est non valide");
        }

        this.joueurs.remove(indice);
    }

    public boolean trouverJoueurParNom(String nom){

       List<Joueur> listJoueur = this.joueurs.stream()
                .filter(j -> j.nom.equalsIgnoreCase(nom))
                .toList();
       return !listJoueur.isEmpty();
    }

    public void trierJoueurs(){
        this.joueurs.sort(Comparator.comparing(Joueur::getNom));
        System.out.println("Les joueurs triés par nom : " + this.joueurs);
    }
}
