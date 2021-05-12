package com.factorychriismas;

import java.util.*;

public class GiftDecorator extends StarsDecorator {

    int conGift = 0;

    public GiftDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("SAUCE");
        this.addGifft(super.place);     
        
        super.place.place("ROBLE");
        this.addGifft(super.place);
        
        super.place.place("ENCINA");
        this.addGifft(super.place);
        
        super.place.place("PINO");
        this.addGifft(super.place);
        
        super.place.place("FRESNO");
        this.addGifft(super.place);
   
    }
    
     public void addGifft(iTree tree) {
        if(tree instanceof willowtree && conGift == 0){
            System.out.println("Decorando arbol de Sauce con Regalos");
        }
        
        if(tree instanceof oaktree && conGift == 0){
            System.out.println("Decorando arbol de roble con Regalos");
        }
        
        if(tree instanceof holmoaktree && conGift == 0){
            System.out.println("Decorando arbol de Encina con Regalos");
        }
        
        if(tree instanceof pinetree && conGift == 0){
            System.out.println("Decorando arbol de Pino con Regalos");
        }
        
        if(tree instanceof ashtree && conGift == 0){
            System.out.println("Decorando arbol de Fresno con Regalos");
        }
        conGift++;
    }

}