package com.factorychriismas;

import java.util.*;

public class PiceaTree implements iTree {
    
    int fabPicea = 0;
    
    public PiceaTree() {
    }

    public void place(String typeTree) {
        if(fabPicea == 0){
            System.out.println("Fabricando árbol de tipo Picea");
            fabPicea++;
        }
    }

}