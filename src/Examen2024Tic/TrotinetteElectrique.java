package Examen2024Tic;

import java.util.Date;

public class TrotinetteElectrique extends Vehicule{
    String couleur;
    int poidsMax;

    public TrotinetteElectrique(String id, String marque, String model, String couleur, int poidsMax) {
        super(id, marque, model);
        this.couleur = couleur;
        this.poidsMax = poidsMax;
    }

    @Override
    public boolean estDisponible() {
        return this.getEtat_vehicule()==Etat.Disponible;
    }

    @Override
    public void louer(String client, Date date) {
        this.setDate_location(date);
        this.setEtat_vehicule(Etat.Loué);
    }


    public void retourner(Date date) {
        this.setDate_retour(date);
    }
}
