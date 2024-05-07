package util;

import java.util.Arrays;

public abstract class misArrays {

	/**
     * Calcula la media de los numeros.
     *
     * @param Es el Array de números enteros.
     * @return La media del array.
     * @throws IllegalArgumentException si alguno de los números del array no está entre 0 y 10.
     */
    public static float mediaNotas(int[] array) {
    	for (int num : array) {
            if (num < 0 || num > 10) {
                throw new IllegalArgumentException("Los números deben estar entre 0 y 10.");
            }
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma / array.length;
    }
	
    /**
     * Calcula la mediana de un array de números enteros entre 0 y 10.
     *
     * @param array Array de números enteros entre 0 y 10.
     * @return La mediana del array.
     * @throws IllegalArgumentException si alguno de los números del array no está entre 0 y 10.
     */
    public static float medianaNotas(int[] array) {
        for (int num : array) {
            if (num < 0 || num > 10) {
                throw new IllegalArgumentException("Los números deben estar entre 0 y 10.");
            }
        }
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        int length = copyArray.length;
        if (length % 2 == 0) {
            int mediana1 = copyArray[length / 2 - 1];
            int mediana2 = copyArray[length / 2];
            return (float) (mediana1 + mediana2) / 2;
        } else {
            return copyArray[length / 2];
        }
    }
    
    
}