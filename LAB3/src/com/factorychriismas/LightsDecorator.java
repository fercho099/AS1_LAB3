package com.factorychriismas;

import java.util.*;

public class LightsDecorator extends BombsDecorator {

    int contLights = 0;
    
    public LightsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("SAUCE");
        this.addLights(super.place);     
        
        super.place.place("ROBLE");
        this.addLights(super.place);
        
        super.place.place("ENCINA");
        this.addLights(super.place);
        
        super.place.place("PINO");
        this.addLights(super.place);
        
        super.place.place("FRESNO");
        this.addLights(super.place);
    }

    public void addLights(iTree tree) {
        if(tree instanceof willowtree && contLights == 0){
            System.out.println("Decorando arbol de Sauce con luces");
        }
        
        if(tree instanceof oaktree && contLights == 0){
            System.out.println("Decorando arbol de roble con luces");
        }
        
        if(tree instanceof holmoaktree && contLights == 0){
            System.out.println("Decorando arbol de Encina con luces");
        }
        
        if(tree instanceof pinetree && contLights == 0){
            System.out.println("Decorando arbol de Pino con luces");
        }
        
        if(tree instanceof ashtree && contLights == 0){
            System.out.println("Decorando arbol de Fresno con luces");
        }
        
        contLights++;
    }

}