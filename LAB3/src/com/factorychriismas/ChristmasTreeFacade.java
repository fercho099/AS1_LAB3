package com.factorychriismas;

import java.util.*;

public class ChristmasTreeFacade {
    
    public List<String> holmoakTypeTree;
    public List<String> oakTypeTree;
    public List<String> willowTypeTree;
    public List<String> pineTypeTree;
    public List<String> ashTypeTree;
    
    public ChristmasTreeFacade() {
        this.holmoakTypeTree = new ArrayList();
        this.oakTypeTree = new ArrayList();
        this.willowTypeTree = new ArrayList();
        this.pineTypeTree = new ArrayList();
        this.ashTypeTree = new ArrayList();
        
        this.holmoakTypeTree.add("ENCINA");
        this.oakTypeTree.add("ROBLE");
        this.willowTypeTree.add("SAUCE");
        this.pineTypeTree.add("PINO");
        this.ashTypeTree.add("FRESNO");
    }

    public void placePinabet() {
        iTree pinabet = new willowtree();
        
        for(int i=0; i<this.holmoakTypeTree.size(); i++){
            pinabet.place(this.holmoakTypeTree.get(i));
        }
    }

    public void placeParsnip() {
        iTree parsnip = new oaktree();
        
        for(int i=0; i<this.oakTypeTree.size(); i++){
            parsnip.place(this.oakTypeTree.get(i));
        }
    }

    public void PlaceAbies() {
        iTree abies = new holmoaktree();
        
        for(int i=0; i<this.willowTypeTree.size(); i++){
            abies.place(this.willowTypeTree.get(i));
        }
    }

    public void PlaceHolly() {
        iTree holly = new pinetree();
        
        for(int i=0; i<this.pineTypeTree.size(); i++){
            holly.place(this.pineTypeTree.get(i));
        }
    }

    public void PlacePicea() {
        iTree picea = new ashtree();
        
        for(int i=0; i<this.ashTypeTree.size(); i++){
            picea.place(this.ashTypeTree.get(i));
        }
    }

}