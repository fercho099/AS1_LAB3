package com.factorychriismas;

import java.util.*;

public class AntiguaChristmasTreeApp {

    public AntiguaChristmasTreeApp() {
    }

    public static void main(String[] args) {
        
        iTree pinabetTree = new PinabetTree();
        ChristmasTree pinabetBombsDecorator = new BombsDecorator(pinabetTree);
        ChristmasTree pinabetLightsDecorator = new LightsDecorator(pinabetTree);
        ChristmasTree pinabetSnowDecorator = new SnowDecorator(pinabetTree);
        pinabetBombsDecorator.place();
        pinabetLightsDecorator.place();
        pinabetSnowDecorator.place();
        System.out.println("\n");
        
        iTree parsnipTree = new ParsnipTreee();
        ChristmasTree parsnipBombsDecorator = new BombsDecorator(parsnipTree);
        ChristmasTree parsnipLightsDecorator = new LightsDecorator(parsnipTree);
        ChristmasTree parsnipSnowDecorator = new SnowDecorator(parsnipTree);
        parsnipBombsDecorator.place();
        parsnipLightsDecorator.place();
        parsnipSnowDecorator.place();
        System.out.println("\n");
        
        iTree abiesTree = new AbiesTree();
        ChristmasTree abiesBombsDecorator = new BombsDecorator(abiesTree);
        ChristmasTree abiesLightsDecorator = new LightsDecorator(abiesTree);
        ChristmasTree abiesSnowDecorator = new SnowDecorator(abiesTree);
        abiesBombsDecorator.place();
        abiesLightsDecorator.place();
        abiesSnowDecorator.place();
        System.out.println("\n");
        
        iTree hollyTree = new HollyTree();
        ChristmasTree hollyBombsDecorator = new BombsDecorator(hollyTree);
        ChristmasTree hollyLightsDecorator = new LightsDecorator(hollyTree);
        ChristmasTree hollySnowDecorator = new SnowDecorator(hollyTree);
        hollyBombsDecorator.place();
        hollyLightsDecorator.place();
        hollySnowDecorator.place();
        System.out.println("\n");
        
        iTree piceaTree = new PiceaTree();
        ChristmasTree piceaBombsDecorator = new BombsDecorator(piceaTree);
        ChristmasTree piceaLightsDecorator = new LightsDecorator(piceaTree);
        ChristmasTree piceaSnowDecorator = new SnowDecorator(piceaTree);
        piceaBombsDecorator.place();
        piceaLightsDecorator.place();
        piceaSnowDecorator.place();
        
        
        
        
    }

}