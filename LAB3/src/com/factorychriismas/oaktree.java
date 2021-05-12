package com.factorychriismas;

import java.util.*;

public class oaktree implements iTree {

    int faboak = 0;
    
    public oaktree() {
    }

    public void place(String typeTree) {
        if(faboak == 0){
            System.out.println("Fabricando árbol de tipo roble");
            faboak++;
        }
    }

}