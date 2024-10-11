package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, double prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }
    public String toString(){
        return super.toString() + "\nPrime: " + prime;
    }
}
