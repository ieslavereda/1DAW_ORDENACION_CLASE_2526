package es.ieslavereda.ordenacion;

import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {
//        int[] array = new int[]{
//                2, 5, 0, -3, 9, 20, 4
//        };

        String[] array = new String[]{
                "coche","arbol","zoo","animal","mesa","manzana"
        };

        burbuja(array);

        System.out.println(Arrays.toString(array));
    }

    public static void burbuja(int[] array) {
        int aux;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1; j++) {

                // Comprobamos si el orden es incorrecto
                if (array[j] > array[j + 1]) {

                    // Swapping
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }

    }

    public static void burbuja(String[] array) {
        String aux;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1; j++) {

                // Comprobamos si el orden es incorrecto
                if (array[j].compareTo(array[j + 1])>0) {

                    // Swapping
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }

    }
}
