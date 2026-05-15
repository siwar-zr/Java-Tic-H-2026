package correctionExamen;

public class Joueur extends Personnange implements IJoueur{
    String specialite;
    public Joueur(String nom, String specialite){
        super(nom);
        this.specialite = specialite;
    }

    public void jouerTour() {
        System.out.println("It's your turn to play !");
    }

    public boolean aMemeSpecialite(Joueur that){
        return this.specialite.equalsIgnoreCase(that.specialite);
    }

    public void afficherResume(){
        System.out.println("Name : " + this.nom);
        System.out.println("Speciality : " + this.specialite);
        System.out.println("Actual level : " + this.niveauActuel);
        System.out.println("Experience : " + this.pointsExperience);
    }
}
