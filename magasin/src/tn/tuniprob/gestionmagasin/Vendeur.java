package tn.tuniprob.gestionmagasin;

public class Vendeur {
    private double tauxvente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures, double tauxvente) {
        this.tauxvente = tauxvente;
    }
    public String toString(){
        return super.toString() + ", tauxvente=" + tauxvente;
    }
}
