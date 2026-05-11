package lesCollections.CorrectionExercices.Exercice3;

public class Main {

    public static void main(String[] args) {

        Catalogue c = new Catalogue();

        c.ajouterLivre(
                new Livre("Java", "Ali", 2020));

        c.ajouterLivre(
                new Livre("Python", "Sami", 2018));

        c.ajouterLivre(
                new Livre("Angular", "Ali", 2023));

        c.afficherLivres();

        System.out.println("\nLivres de Ali :");

        System.out.println(
                c.chercherParAuteur("Ali"));

        c.trierParAnnee();

        System.out.println("\nAprès tri :");

        c.afficherLivres();

        System.out.println("\nLivres après 2019 :");

        System.out.println(c.livresApres(2019));
    }
}
