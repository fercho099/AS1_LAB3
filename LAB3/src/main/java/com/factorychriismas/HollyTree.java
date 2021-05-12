package com.factorychriismas;

import java.util.*;

public class HollyTree implements iTree {

    int fabHolly = 0;
    
    public HollyTree() {
    }

    public void place(String typeTree) {
        if(fabHolly == 0) {
            System.out.println("Fabricando árbol de tipo Acebo");
            fabHolly++;
        }
    }

}