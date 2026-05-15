package Examen2024Tic;

public class CompteBancaire {

    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double montant) {
        this.solde = montant;
    }

    public void retrait(double montant) throws SoldeInsuffisantException{
        if (montant > solde) {
            //System.out.println("Fonds insuffisants.");
            throw new SoldeInsuffisantException("Solde Insuffisant");
        }
        else {
            solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        }
    }
    public void depot(double montant) {
        solde += montant;
        System.out.println(montant + " déposé avec succès.");
    }


}
