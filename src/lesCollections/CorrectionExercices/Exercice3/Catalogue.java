package lesCollections.CorrectionExercices.Exercice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Catalogue {

    private ArrayList<Livre> livres;

    // Constructeur
    public Catalogue() {
        livres = new ArrayList<>();
    }

    // 2) Ajouter sans doublon
    public void ajouterLivre(Livre l) {

        for (Livre livre : livres) {

            if (livre.getTitre().equalsIgnoreCase(l.getTitre())
                    &&
                    livre.getAuteur().equalsIgnoreCase(l.getAuteur())) {

                System.out.println("Livre déjà existant.");
                return;
            }
        }

        livres.add(l);
    }

    // 3) Chercher par auteur
    public ArrayList<Livre> chercherParAuteur(String auteur) {

        ArrayList<Livre> resultat = new ArrayList<>();

        for (Livre livre : livres) {

            if (livre.getAuteur().equalsIgnoreCase(auteur)) {

                resultat.add(livre);
            }
        }

        return resultat;
    }

    // 4) Trier par année
    public void trierParAnnee() {

        livres.sort(Comparator.comparingInt(Livre::getAnnee)); //l -> l.getAnnee()
        //Comparator<Livre> comp = (l1,l2) -> l1.getAnnee() - l2.getAnnee();
        //Collections.sort(livres, comp);
    }

    // 5) Livres après une année
    public ArrayList<Livre> livresApres(int annee) {

        ArrayList<Livre> resultat = new ArrayList<>();

        for (Livre livre : livres) {

            if (livre.getAnnee() > annee) {
                resultat.add(livre);
            }
        }

        return resultat;
    }

    // Affichage
    public void afficherLivres() {

        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}
