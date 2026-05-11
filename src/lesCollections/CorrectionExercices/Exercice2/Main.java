package lesCollections.CorrectionExercices.Exercice2;

public class Main {
    public static void main(String[] args) {

        Classeur c = new Classeur();

        c.ajouterNote(15);
        c.ajouterNote(18);
        c.ajouterNote(5);
        c.ajouterNote(9);

        c.afficherNotes();

        System.out.println("Moyenne : " + c.moyenne());

        System.out.println("Mention : " + c.obtenirMention());

        c.supprimerNotesInsuffisantes();

        c.afficherNotes();
    }
}
