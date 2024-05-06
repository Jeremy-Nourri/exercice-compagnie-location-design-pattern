package org.example;

public class Vehicule {

    String marque;
    String modele;

    String couleur;

    VehiculeFlyWeight vehiculeFlyWeight;

    public Vehicule(String marque, String modele, String couleur, VehiculeFlyWeight vehiculeFlyWeight) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.vehiculeFlyWeight = vehiculeFlyWeight;
    }

    public void afficheInfo() {
        this.vehiculeFlyWeight.afficherInfosVehicule(marque, modele, couleur);
    }
}
