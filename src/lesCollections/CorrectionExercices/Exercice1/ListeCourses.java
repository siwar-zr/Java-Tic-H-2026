package lesCollections.CorrectionExercices.Exercice1;
import java.util.ArrayList;

public class ListeCourses {

    private ArrayList<String> articles;

    // 1) Constructeur
    public ListeCourses() {

        articles = new ArrayList<>();
    }

    // 2) Ajouter un article sans doublon
    public void ajouterArticle(String article) {

        if (!articles.contains(article)) {
            articles.add(article);
            System.out.println(article + " ajouté.");
        } else {
            System.out.println("Article déjà présent.");
        }
    }

    // 3) Supprimer un article
    public void supprimerArticle(String article) {

        if (articles.contains(article)) {
            articles.remove(article);
            System.out.println(article + " supprimé.");
        } else {
            System.out.println("Article introuvable.");
        }
    }

    // 4) Afficher la liste
    public void afficherListe() {

        if (articles.isEmpty()) {
            System.out.println("Liste vide.");
            return;
        }

        for (int i = 0; i < articles.size(); i++) {
            System.out.println((i + 1) + ". " + articles.get(i));
        }
    }

    // 5) Nombre d'articles
    public int nombreArticles() {
        return articles.size();
    }
}
