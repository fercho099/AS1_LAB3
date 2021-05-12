package com.factorychriismas;

import java.util.*;

public class ParsnipTreee implements iTree {

    int fabParsnip = 0;
    
    public ParsnipTreee() {
    }

    public void place(String typeTree) {
        if(fabParsnip == 0){
            System.out.println("Fabricando árbol de tipo Chirivisco");
            fabParsnip++;
        }
    }

}