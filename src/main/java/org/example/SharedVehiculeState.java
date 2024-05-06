package org.example;

public class SharedVehiculeState implements VehiculeFlyWeight {
    String typeDeVehicule;
    public SharedVehiculeState(String typeDeVehicule) {
        this.typeDeVehicule = typeDeVehicule;

    }
    @Override
    public void afficherInfosVehicule(String marque, String modele, String couleur) {
        System.out.println(marque);
        System.out.println(modele);
        System.out.println(couleur);
        System.out.println(typeDeVehicule);
    }
}
