package com.factorychriismas;

import java.util.*;

public class LightsDecorator extends BombsDecorator {

    int contLights = 0;
    
    public LightsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETO");
        this.addLights(super.place);
        
        super.place.place("CHIRIVISCO");
        this.addLights(super.place);
        
        super.place.place("ABIES");
        this.addLights(super.place);
        
        super.place.place("ACEBO");
        this.addLights(super.place);
        
        super.place.place("PICEA");
        this.addLights(super.place);
    }

    public void addLights(iTree tree) {
        if(tree instanceof PinabetTree && contLights == 0){
            System.out.println("Decorando Pinabeto con luces");
        }
        
        if(tree instanceof ParsnipTreee && contLights == 0){
            System.out.println("Decorando Chirivisco con luces");
        }
        
        if(tree instanceof AbiesTree && contLights == 0){
            System.out.println("Decorando Abies con luces");
        }
        
        if(tree instanceof HollyTree && contLights == 0){
            System.out.println("Decorando Acebo con luces");
        }
        
        if(tree instanceof PiceaTree && contLights == 0){
            System.out.println("Decorando Picea con luces");
        }
        
        contLights++;
    }

}