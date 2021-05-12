package com.factorychriismas;

import java.util.*;

public class willowtree implements iTree {
    
    int fabwillow = 0;
    
    public willowtree() {
    }

    public void place(String typeTree) {
        if(fabwillow == 0){
            System.out.println("Fabricando árbol de tipo Sauce");
            fabwillow++;
        }
        
    }

}