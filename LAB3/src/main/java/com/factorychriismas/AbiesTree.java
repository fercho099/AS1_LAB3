package com.factorychriismas;

import java.util.*;

public class AbiesTree implements iTree {
    
    int fabAbies = 0;
    
    public AbiesTree() {
    }

    public void place(String typeTree) {
        if(fabAbies == 0){
            System.out.println("Fabricando árbol de tipo Abies");
            fabAbies++;
        }
    }

}