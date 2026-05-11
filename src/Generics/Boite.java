package Generics;

public class Boite<T> {
    T contenu;

    public void remplir(T contenu){
        this.contenu = contenu;
    }
}
