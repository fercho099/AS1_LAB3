package com.factorychriismas;

import java.util.*;

public class ChristmasTreeFacade {
    
    public List<String> PinabetTypeTree;
    public List<String> ParsnipTypeTree;
    public List<String> AbiesTypeTree;
    public List<String> HollyTypeTree;
    public List<String> PiceaTypeTree;
    
    public ChristmasTreeFacade() {
        this.PinabetTypeTree = new ArrayList();
        this.ParsnipTypeTree = new ArrayList();
        this.AbiesTypeTree = new ArrayList();
        this.HollyTypeTree = new ArrayList();
        this.PiceaTypeTree = new ArrayList();
        
        this.PinabetTypeTree.add("PINABETO");
        this.ParsnipTypeTree.add("CHIRIVISCO");
        this.AbiesTypeTree.add("ABIES");
        this.HollyTypeTree.add("ACEBO");
        this.PiceaTypeTree.add("PICEA");
    }

    public void placePinabet() {
        iTree pinabet = new PinabetTree();
        
        for(int i=0; i<this.PinabetTypeTree.size(); i++){
            pinabet.place(this.PinabetTypeTree.get(i));
        }
    }

    public void placeParsnip() {
        iTree parsnip = new ParsnipTreee();
        
        for(int i=0; i<this.ParsnipTypeTree.size(); i++){
            parsnip.place(this.ParsnipTypeTree.get(i));
        }
    }

    public void PlaceAbies() {
        iTree abies = new AbiesTree();
        
        for(int i=0; i<this.AbiesTypeTree.size(); i++){
            abies.place(this.AbiesTypeTree.get(i));
        }
    }

    public void PlaceHolly() {
        iTree holly = new HollyTree();
        
        for(int i=0; i<this.HollyTypeTree.size(); i++){
            holly.place(this.HollyTypeTree.get(i));
        }
    }

    public void PlacePicea() {
        iTree picea = new PiceaTree();
        
        for(int i=0; i<this.PiceaTypeTree.size(); i++){
            picea.place(this.PiceaTypeTree.get(i));
        }
    }

}