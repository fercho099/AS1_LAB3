package com.factorychriismas;

import java.util.*;

public class SnowDecorator extends LightsDecorator {

    int contSnow = 0;
    
    public SnowDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETO");
        this.addSnow(super.place);
        
        super.place.place("CHIRIVISCO");
        this.addSnow(super.place);
        
        super.place.place("ABIES");
        this.addSnow(super.place);
        
        super.place.place("ACEBO");
        this.addSnow(super.place);
        
        super.place.place("PICEA");
        this.addSnow(super.place);
    }

    public void addSnow(iTree tree) {
        if(tree instanceof PinabetTree && contSnow == 0){
            System.out.println("Decorando Pinabeto con nieve");
        }
        
        if(tree instanceof ParsnipTreee && contSnow == 0){
            System.out.println("Decorando Chirivisco con nieve");
        }
        
        if(tree instanceof AbiesTree && contSnow == 0){
            System.out.println("Decorando Abies con nieve");
        }
        
        if(tree instanceof HollyTree && contSnow == 0){
            System.out.println("Decorando Acebo con nieve");
        }
        
        if(tree instanceof PiceaTree && contSnow == 0){
            System.out.println("Decorando Picea con nieve");
        }
        contSnow++;
    }

}