package com.factorychriismas;

import java.util.*;

public class StarsDecorator extends SnowDecorator {

  
     int contStars = 0;
    
    public StarsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("SAUCE");
        this.addStars(super.place);     
        
        super.place.place("ROBLE");
        this.addStars(super.place);
        
        super.place.place("ENCINA");
        this.addStars(super.place);
        
        super.place.place("PINO");
        this.addStars(super.place);
        
        super.place.place("FRESNO");
        this.addStars(super.place);
    }
    public void addStars(iTree tree) {
     if(tree instanceof willowtree && contStars == 0){
            System.out.println("Decorando arbol de Sauce con una Estrella");
        }
        
        if(tree instanceof oaktree && contStars == 0){
            System.out.println("Decorando arbol de roble con una Estrella");
        }
        
        if(tree instanceof holmoaktree && contStars == 0){
            System.out.println("Decorando arbol de Encina con una Estrella");
        }
        
        if(tree instanceof pinetree && contStars == 0){
            System.out.println("Decorando arbol de Pino con una Estrella");
        }
        
        if(tree instanceof ashtree && contStars == 0){
            System.out.println("Decorando arbol de Fresno con una Estrella");
        }
        contStars++;
    }

}