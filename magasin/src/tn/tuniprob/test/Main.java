package tn.tuniprob.test;
import tn.tuniprob.gestionmagasin.*;

import java.sql.SQLOutput;
import java.util.Date;

    public class Main {
        public static void main(String[] args) {

            Produit p1 = new Produit();

            System.out.println("id :" + p1.getIdentifiant());
            System.out.println("marque :" + p1.getMarque());
            System.out.println("libelle :" + p1.getLibelle());
            System.out.println("prix :" + p1.getPrix());

            Produit p2 = new Produit(1024, "Delice", "Lait");
            System.out.println("id :" + p2.getIdentifiant());
            System.out.println("marque :" + p2.getMarque());
            System.out.println("libelle :" + p2.getLibelle());
            System.out.println("prix :" + p2.getPrix());
            Date date = new Date();
            Produit p3 = new Produit(11, "Sicam", "Tomate", 1.2f, date);
            System.out.println("Entite.Produit 3");
            System.out.println("id :" + p3.getIdentifiant());
            System.out.println("marque :" + p3.getMarque());
            System.out.println("libelle :" + p3.getLibelle());
            System.out.println("prix :" + p3.getPrix());


            p1.setPrix(0.7f);
            p1.setMarque("Vitalait");
            p1.afficher();
            System.out.println("to String");
            System.out.println(p3.toString());
            System.out.println(p3);


            Magasin m1 = new Magasin(1, "tunis", "CentreVille");
            m1.ajouter(p2);
            m1.ajouter(p1);
            m1.ajouter(p3);

            System.out.println("marques produit");
            m1.afficherMarquePro();

            System.out.println(m1);
            Magasin m2 = new Magasin(2, "tunis", "Menzah6");

            m2.ajouter(p2);
            m1.ajouter(p1);

            System.out.println("Le nombre total :" + Magasin.getTotal());

            System.out.println(p1.comparer(p2));


            Produit p4 = new Produit(11, "Sicam", "Tomate", 1.2f, date);

            System.out.println(Produit.comparer(p2, p3));


            m1.ajouter(p4);

            System.out.println("Plus produit");
            System.out.println(m1.plusProduit(m2));


            System.out.println("supprimer produit");

            m1.supprimer(p1);

            System.out.println(m1);

            Magasin carrefour = new Magasin(1, "Carrefour", "CentreVille");
            Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

            System.out.println("Magasin 1 : " + carrefour);
            System.out.println("Magasin 2 : " + monoprix);

            /*Magasin m1 = new Magasin(1, "Ariana", "Centre-Ville");
            Magasin m2 = new Magasin(2, "Tunis", "Menzah6");*/

            // Création des produits (exemples)
            Produit p7 = new Produit(1, "Produit1", "Marque1");
            Produit p8 = new Produit(2, "Produit2", "Marque2");
            Produit p9 = new Produit(3, "Produit3", "Marque3");

// Ajout des produits dans le magasin 1
            m1.ajouter(p7);
            m1.ajouter(p8);
            m1.ajouter(p9);

// Création des employés pour le magasin 1
            Caissier caissier1 = new Caissier(1, "Ali", "Ariana", 160, "Caisse1");
            Vendeur vendeur1 = new Vendeur(2, "Sara", "Ariana", 160, 0.05);
            Responsable responsable1 = new Responsable(3, "Nabil", "Ariana", 160, 500);

// Ajout des employés dans le magasin 1
            m1.ajouter(caissier1);
            m1.ajouter(vendeur1);
            m1.ajouter(responsable1);

// Création des employés pour le magasin 2
            Caissier caissier2 = new Caissier(4, "Mona", "Tunis", 160, "Caisse2");
            Vendeur vendeur2 = new Vendeur(5, "Omar", "Tunis", 160, 0.07);
            Vendeur vendeur3 = new Vendeur(6, "Fatma", "Tunis", 160, 0.06);
            Responsable responsable2 = new Responsable(7, "Rami", "Tunis", 160, 700);

// Ajout des employés dans le magasin 2
            m2.ajouter(caissier2);
            m2.ajouter(vendeur2);
            m2.ajouter(vendeur3);
            m2.ajouter(responsable2);

// Affichage des magasins et employés
            System.out.println("Magasin 1: " + m1);
            System.out.println("Magasin 2: " + m2);
        }
    }