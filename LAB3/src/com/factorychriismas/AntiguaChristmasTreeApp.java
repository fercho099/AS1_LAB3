package com.factorychriismas;

import java.util.*;

public class AntiguaChristmasTreeApp {

    public AntiguaChristmasTreeApp() {
    }

    public static void main(String[] args) {
        
        iTree holmoaktree = new holmoaktree();
        ChristmasTree holmoakBombsDecorator = new BombsDecorator(holmoaktree);
        ChristmasTree holmoakLightsDecorator = new LightsDecorator(holmoaktree);
        ChristmasTree holmoakSnowDecorator = new SnowDecorator(holmoaktree);
        ChristmasTree holmoakGiftDecorator = new GiftDecorator(holmoaktree);
        ChristmasTree holmoakStarsDecorator = new StarsDecorator(holmoaktree);
        holmoakBombsDecorator.place();
        holmoakLightsDecorator.place();
        holmoakSnowDecorator.place();
        holmoakGiftDecorator.place();
        holmoakStarsDecorator.place();
        System.out.println("\n");
        
        iTree oaktree = new oaktree();
        ChristmasTree oakBombsDecorator = new BombsDecorator(oaktree);
        ChristmasTree oakLightsDecorator = new LightsDecorator(oaktree);
        ChristmasTree oakSnowDecorator = new SnowDecorator(oaktree);
        ChristmasTree oakGiftDecorator = new GiftDecorator(oaktree);
        ChristmasTree oakStarsDecorator = new StarsDecorator(oaktree);
        oakBombsDecorator.place();
        oakLightsDecorator.place();
        oakSnowDecorator.place();
        oakGiftDecorator.place();
        oakStarsDecorator.place();
        System.out.println("\n");
        
        iTree willowtree = new willowtree();
        ChristmasTree willowBombsDecorator = new BombsDecorator(willowtree);
        ChristmasTree willowLightsDecorator = new LightsDecorator(willowtree);
        ChristmasTree willowSnowDecorator = new SnowDecorator(willowtree);
        ChristmasTree willowGiftDecorator = new GiftDecorator(willowtree);
        ChristmasTree willowStarsDecorator = new StarsDecorator(willowtree);
        willowBombsDecorator.place();
        willowLightsDecorator.place();
        willowSnowDecorator.place();
        willowGiftDecorator.place();
        willowStarsDecorator.place();
        System.out.println("\n");
        
        iTree pinetree = new pinetree();
        ChristmasTree pineBombsDecorator = new BombsDecorator(pinetree);
        ChristmasTree pineLightsDecorator = new LightsDecorator(pinetree);
        ChristmasTree pineSnowDecorator = new SnowDecorator(pinetree);
        ChristmasTree pineGiftDecorator = new GiftDecorator(pinetree);
        ChristmasTree pineStarsDecorator = new StarsDecorator(pinetree);
        pineBombsDecorator.place();
        pineLightsDecorator.place();
        pineSnowDecorator.place();
        pineGiftDecorator.place();
        pineStarsDecorator.place();
        System.out.println("\n");
        
        iTree ashtree = new ashtree();
        ChristmasTree ashBombsDecorator = new BombsDecorator(ashtree);
        ChristmasTree ashLightsDecorator = new LightsDecorator(ashtree);
        ChristmasTree ashSnowDecorator = new SnowDecorator(ashtree);
        ChristmasTree ashGiftDecorator = new GiftDecorator(ashtree);
        ChristmasTree ashStarsDecorator = new StarsDecorator(ashtree);
        ashBombsDecorator.place();
        ashLightsDecorator.place();
        ashSnowDecorator.place();
        ashGiftDecorator.place();
        ashStarsDecorator.place();
        
        
        
        
    }

}