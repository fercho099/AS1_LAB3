package com.factorychriismas;

import java.util.*;

public abstract class ChristmasTree extends ChristmasTreeFacade {

    protected iTree place;
    
    public ChristmasTree(iTree place) {
        this.place = place;
    }

    public void place() {
        this.place.place("PINABETO");
        this.place.place("CHIRIVISCO");
        this.place.place("ABIES");
        this.place.place("ACEBO");
        this.place.place("PICEA");        
    }

}