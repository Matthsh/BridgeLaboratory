package com.company;

import java.util.LinkedList;

public class NumerosPrimos {

    private static final LinkedList<Integer> primos = new LinkedList<Integer>();
    
    public static void getPrimo(){
        primos.add(Primo.getPrimo());
    }

    public static LinkedList showPrimos(){
        return primos;
    }


}
