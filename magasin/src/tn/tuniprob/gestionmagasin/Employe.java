package tn.tuniprob.gestionmagasin;

public class Employe {
    private int id;
    private String nom;
     private String adresse;
     private int nbr_heures;

     public Employe(int id, String nom, String adresse, int nbr_heures) {
         this.id = id;
         this.nom = nom;
         this.adresse = adresse;
         this.nbr_heures = nbr_heures;
     }

     public int getId() {
         return id;
     }
     public String getNom() {
         return nom;
     }
     public String getAdresse() {
         return adresse;
     }
     public int getNbr_heures() {
         return nbr_heures;
     }
     public String toString() {
         return id + " " + nom + " " + adresse + " " + nbr_heures;
     }

}
