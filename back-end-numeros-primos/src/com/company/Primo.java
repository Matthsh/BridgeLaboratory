package com.company;



public class Primo {
    private static int primo;
    private static boolean isPrimo;

    public static boolean Verificador(int numero) {
        for (int c = 1; c < numero; c++) {
            if (numero == 1 || numero % c == 0)
                isPrimo = false;
            else {
                primo = numero;
                isPrimo = true;
            }
        }
        return isPrimo;
    }

    public static int getPrimo(){
        return primo;
    }
}
