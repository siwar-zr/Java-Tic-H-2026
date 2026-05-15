package Examen2024Tic;

import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

enum Etat { Disponible, En_Charge , Loué };

public abstract class Vehicule implements IVehicule{
    private String id;
    private String marque;
    private String model;
    private Date date_location = new Date();
    private Date date_retour = new Date();
    private Etat etat_vehicule = Etat.Disponible;

    public Vehicule(String id, String marque, String model) {
        this.id = id;
        this.marque = marque;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate_location() {
        return date_location;
    }

    public void setDate_location(Date date_location) {
        this.date_location = date_location;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public Etat getEtat_vehicule() {
        return etat_vehicule;
    }

    public void setEtat_vehicule(Etat etat_vehicule) {
        this.etat_vehicule = etat_vehicule;
    }
}
