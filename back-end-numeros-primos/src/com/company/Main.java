package com.company;

public class Main {

    public static void main(String[] args) {
        NumerosPrimos primos = new NumerosPrimos();
        int a = 5, b = 31;
        for(int cont = a; cont < b; cont++) {
            if(Primo.Verificador(cont))
                NumerosPrimos.getPrimo();
        }
        System.out.println(NumerosPrimos.showPrimos());
    }
}
