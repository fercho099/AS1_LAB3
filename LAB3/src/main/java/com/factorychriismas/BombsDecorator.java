package com.factorychriismas;

import java.util.*;

public class BombsDecorator extends ChristmasTree {
    
    int contBombs = 0;
    
    public BombsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETO");
        this.addBombs(super.place);     
        
        super.place.place("CHIRIVISCO");
        this.addBombs(super.place);
        
        super.place.place("ABIES");
        this.addBombs(super.place);
        
        super.place.place("ACEBO");
        this.addBombs(super.place);
        
        super.place.place("PICEA");
        this.addBombs(super.place);
    }
    
    

    public void addBombs(iTree tree) {
        if(tree instanceof PinabetTree && contBombs == 0){
            System.out.println("Decorando Pinabeto con bombas");
        }
        
        if(tree instanceof ParsnipTreee && contBombs == 0){
            System.out.println("Decorando Chirivisco con bombas");
        }
        
        if(tree instanceof AbiesTree && contBombs == 0){
            System.out.println("Decorando Abies con bombas");
        }
        
        if(tree instanceof HollyTree && contBombs == 0){
            System.out.println("Decorando Acebo con bombas");
        }
        
        if(tree instanceof PiceaTree && contBombs == 0){
            System.out.println("Decorando Picea con bombas");
        }
        contBombs++;
    }

}