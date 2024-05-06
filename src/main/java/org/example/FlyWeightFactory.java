package org.example;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, SharedVehiculeState> flyweights = new HashMap<>();

    public SharedVehiculeState getFlyWeight(String typeDeVehicule, String marque, String modele, String couleur) {
        String key = marque + "|" + modele;
        if(!flyweights.containsKey(key)){
            flyweights.put(key, new SharedVehiculeState(typeDeVehicule));
        }
        return flyweights.get(key);
    }


}
