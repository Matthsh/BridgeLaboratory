import java.util.ArrayList;
public class NumeroPrimo {
    private static int[] numerosPrimos;
    private static boolean isPrimo;

    public static ArrayList contador (int a, int b){
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for(int cont = a; cont <= b; a++){
            if(Verificador(cont)){
                primos.add(cont);
            }
        }
        return primos;
    }

    public static boolean Verificador (int numero) {
        for (int cont = 2; cont < numero; cont++) {
            if (numero % cont == 0)
                isPrimo = false;
            else
                isPrimo = true;
        }
        return isPrimo;
    }
}