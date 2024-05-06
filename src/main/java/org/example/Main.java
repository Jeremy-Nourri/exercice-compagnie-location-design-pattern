package org.example;

public class Main {
    public static void main(String[] args) {

        FlyWeightFactory factory = new FlyWeightFactory();

        Vehicule vehicule = new Vehicule("Renault", "Modus", "Bleu clair", factory.getFlyWeight("Citadine", "Modus", "Bleu clair", "Bleu clair"));

        vehicule.afficheInfo();
    }
}