package com.factorychriismas;

import java.util.*;

public class holmoaktree implements iTree {
    
    int fabholmoak = 0;
    
    public holmoaktree() {
    }

    public void place(String typeTree) {
        if(fabholmoak == 0){
            System.out.println("Fabricando árbol de tipo Encina");
            fabholmoak++;
        }
    }

}