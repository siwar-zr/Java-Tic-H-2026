package lesCollections.CorrectionExercices.Exercice2;

import java.util.ArrayList;
import java.util.Iterator;

public class Classeur {

    private ArrayList<Double> notes;

    // 1) Constructeur
    public Classeur() {
        notes = new ArrayList<>();
    }

    // 2) Ajouter une note
    public void ajouterNote(double note) {

        if (note >= 0 && note <= 20) {
            notes.add(note);
        } else {
            System.out.println("Erreur : note invalide.");
        }
    }

    // 3) Corriger une note
    public void corrigerNote(int index, double nouvelleNote) {

        if (index >= 0 && index < notes.size()
                && nouvelleNote >= 0
                && nouvelleNote <= 20) {

            notes.set(index, nouvelleNote);

        } else {
            System.out.println("Correction impossible.");
        }
    }

    // 4) Moyenne
    public double moyenne() {

        if (notes.isEmpty()) {
            return 0;
        }

        double somme = 0;

        for (double note : notes) {
            somme += note;
        }

        return somme / notes.size();
    }

    // 5) Mention
    public String obtenirMention() {

        double moy = moyenne();

        if (moy >= 16)
            return "TB";

        else if (moy >= 14)
            return "B";

        else if (moy >= 12)
            return "AB";

        else if (moy >= 10)
            return "Passable";

        else
            return "Insuffisant";
    }

    // 6) Supprimer notes < 8
    public void supprimerNotesInsuffisantes() {

        Iterator<Double> it = notes.iterator();

        while (it.hasNext()) {  //12 ->  -> 18 ->

            if (it.next() < 8) {
                it.remove();
            }
        }
        /*for(Double n : notes){
            if(n<8){
                notes.remove(n);
            }
        }*/
    }

    // Méthode pour l affichage
    public void afficherNotes() {
        System.out.println(notes);
    }
}
