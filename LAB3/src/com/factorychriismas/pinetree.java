package com.factorychriismas;

import java.util.*;

public class pinetree implements iTree {

    int fabpine = 0;
    
    public pinetree() {
    }

    public void place(String typeTree) {
        if(fabpine == 0) {
            System.out.println("Fabricando árbol de tipo Pino");
            fabpine++;
        }
    }

}