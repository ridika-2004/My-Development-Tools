package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZombieList {

    private GoogleZombieConnector googleZombieConnector;

    public ZombieList(GoogleZombieConnector googleZombieConnector){

        this.googleZombieConnector = googleZombieConnector;
    }

    public List<String> filterOrgans(String region, String organismTypeMatch){
        List<String> filteredList = new ArrayList<>();
        List<String> bioOrganisms = googleZombieConnector.findBodies(region);

        for(String bioOrganism : bioOrganisms){
            if(bioOrganism.startsWith(organismTypeMatch)){
                filteredList.add(bioOrganism);
            }
        }
        return filteredList;
    }
}
