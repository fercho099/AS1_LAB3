package com.factorychriismas;

import java.util.*;

public class SnowDecorator extends LightsDecorator {

    int contSnow = 0;
    
    public SnowDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("SAUCE");
        this.addSnow(super.place);     
        
        super.place.place("ROBLE");
        this.addSnow(super.place);
        
        super.place.place("ENCINA");
        this.addSnow(super.place);
        
        super.place.place("PINO");
        this.addSnow(super.place);
        
        super.place.place("FRESNO");
        this.addSnow(super.place);
    }

    public void addSnow(iTree tree) {
        if(tree instanceof willowtree && contSnow == 0){
            System.out.println("Decorando arbol de Sauce con nieve");
        }
        
        if(tree instanceof oaktree && contSnow == 0){
            System.out.println("Decorando arbol de roble con nieve");
        }
        
        if(tree instanceof holmoaktree && contSnow == 0){
            System.out.println("Decorando arbol de Encina con nieve");
        }
        
        if(tree instanceof pinetree && contSnow == 0){
            System.out.println("Decorando arbol de Pino con nieve");
        }
        
        if(tree instanceof ashtree && contSnow == 0){
            System.out.println("Decorando arbol de Fresno con nieve");
        }
        contSnow++;
    }

}