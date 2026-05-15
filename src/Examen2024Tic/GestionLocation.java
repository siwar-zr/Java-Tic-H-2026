package Examen2024Tic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionLocation {
    List<Vehicule> vehicules = new ArrayList<>();

    public void ajouterVehicule (Vehicule v){
        this.vehicules.add(v);
    }

    public void rechercherVehiculesDisponibles (){
        List<Vehicule> vf = this.vehicules.stream()
                .filter(v -> v.getEtat_vehicule()==Etat.Disponible)
                .toList();
        System.out.println(vf);

    }
    public void louerVehicule (String id, String client, Date date){
        List<Vehicule> lv = this.vehicules.stream()
                .filter(v -> v.getId() == id)
                .toList();
        if (lv.isEmpty()){
            System.out.println("Pas de vehicule avec cet id");
            return;
        }
        Vehicule v = lv.get(0);
        v.louer(client,date);

    }

    public void retournerVehicule (String id, Date date){
        List<Vehicule> lv = this.vehicules.stream()
                .filter(v -> v.getId() == id)
                .toList();
        if (lv.isEmpty()){
            System.out.println("Pas de vehicule avec cet id");
            return;
        }
        Vehicule v = lv.get(0);
        v.retourner(date);
    }
}
