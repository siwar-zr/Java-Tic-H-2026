package lesCollections.CorrectionExercices.Exercice1;


public class Main {
    public static void main(String[] args) {

        ListeCourses liste = new ListeCourses();

        liste.ajouterArticle("Pain");
        liste.ajouterArticle("Lait");
        liste.ajouterArticle("Beurre");
        liste.ajouterArticle("Pain"); //Doit afficher un message (doublon)

        liste.afficherListe();

        liste.supprimerArticle("Eau"); //Doit afficher un message (introuvable)
        liste.supprimerArticle("Lait");

        liste.afficherListe();

        System.out.println("Nombre articles : "
                + liste.nombreArticles());
    }
}