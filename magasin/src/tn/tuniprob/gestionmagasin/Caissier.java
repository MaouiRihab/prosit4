package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {
    private int numCaisse;

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numCaisse = numCaisse;
    }
    public String toString() {
        return super.toString() + "\nnumCaisse: " + numCaisse + "\n";
    }
}
