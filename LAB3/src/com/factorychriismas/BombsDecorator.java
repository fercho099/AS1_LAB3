package com.factorychriismas;

import java.util.*;

public class BombsDecorator extends ChristmasTree {
    
    int contBombs = 0;
    
    public BombsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("SAUCE");
        this.addBombs(super.place);     
        
        super.place.place("ROBLE");
        this.addBombs(super.place);
        
        super.place.place("ENCINA");
        this.addBombs(super.place);
        
        super.place.place("PINO");
        this.addBombs(super.place);
        
        super.place.place("FRESNO");
        this.addBombs(super.place);
    }
    
    

    public void addBombs(iTree tree) {
        if(tree instanceof willowtree && contBombs == 0){
            System.out.println("Decorando arbol de Sauce con bombas");
        }
        
        if(tree instanceof oaktree && contBombs == 0){
            System.out.println("Decorando arbol de roble con bombas");
        }
        
        if(tree instanceof holmoaktree && contBombs == 0){
            System.out.println("Decorando arbol de Encina con bombas");
        }
        
        if(tree instanceof pinetree && contBombs == 0){
            System.out.println("Decorando arbol de Pino con bombas");
        }
        
        if(tree instanceof ashtree && contBombs == 0){
            System.out.println("Decorando arbol de Fresno con bombas");
        }
        contBombs++;
    }

}