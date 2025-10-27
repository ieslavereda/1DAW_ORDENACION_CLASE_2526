package es.ieslavereda.ordenacion;

import java.util.Arrays;

public class Seleccion {

    public static void main(String[] args) {
        /*

        int[] array = new int[]{
                2,5,0,-3,9,20,4
        };

        */

        String[] array = new String[]{
                "coche","arbol","zoo","animal","mesa","manzana"
        };

        seleccion(array);

        System.out.println(Arrays.toString(array));


    }

    private static void seleccion(int[] numeros) {

        int posMenor;
        int aux;

        for (int i = 0; i < numeros.length; i++) {
            posMenor = i;
            for (int j = i; j < numeros.length; j++)
                if (numeros[j] < numeros[posMenor])
                    posMenor = j;

            aux = numeros[i];
            numeros[i] = numeros[posMenor];
            numeros[posMenor] = aux;
            // System.out.println(Arrays.toString(numeros));
        }
    }
    private static void seleccion(String[] palabras) {

        int posMenor;
        String aux;

        for (int i = 0; i < palabras.length; i++) {
            posMenor = i;
            for (int j = i; j < palabras.length; j++)
                if (palabras[j].compareTo(palabras[posMenor])<0)
                    posMenor = j;

            aux = palabras[i];
            palabras[i] = palabras[posMenor];
            palabras[posMenor] = aux;
            // System.out.println(Arrays.toString(numeros));
        }
    }

}
