package es.ieslavereda.ordenacion.ejercicios;

import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {

        String[][] alturas = new String[][]{
                {"Juan","Luisa","Carmen","Teresa"},
                {"1.8", "1.65", "1.50", "1.82"}
        };

        sortByName(alturas);

        System.out.println(Arrays.toString(alturas[0]));
        System.out.println(Arrays.toString(alturas[1]));
    }

    private static void sortByName(String[][] alturas) {

        int posMenor;
        String aux1;
        String aux2;

        for (int i = 0; alturas[0].length > i; i++) {
            posMenor = i;
            for (int j = i; j < alturas[0].length; j++)
                if (alturas[0][j].compareTo(alturas[0][posMenor])<0)
                    posMenor = j;

            aux1 = alturas[0][i];
            aux2 = alturas[1][i];
            alturas[0][i] = alturas[0][posMenor];
            alturas[1][i] = alturas[1][posMenor];
            alturas[0][posMenor] = aux1;
            alturas[1][posMenor] = aux2;
            // System.out.println(Arrays.toString(numeros));
        }



    }
}
