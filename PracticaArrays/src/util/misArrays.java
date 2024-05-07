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
     * Calcula la mediana de números enteros entre 0 y 10.
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
    
    /**
     * Encuentra la máxima nota en un array de números enteros entre 0 y 10.
     *
     * @param Array de números enteros entre 0 y 10.
     * @return La máxima nota que hay.
     * @throws IllegalArgumentException si alguno de los números del array no está entre 0 y 10.
     */
    public static int maximaNota(int[] array) {
        for (int num : array) {
            if (num < 0 || num > 10) {
                throw new IllegalArgumentException("Los números en el array deben estar entre 0 y 10.");
            }
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }  
    
    /**
     * Encuentra la nota mas baja en un array de números enteros entre 0 y 10.
     *
     * @param array Array de números enteros entre 0 y 10.
     * @return La nota mas baja del array.
     * @throws IllegalArgumentException si alguno de los números no está entre 0 y 10.
     */
    public static int minimaNota(int[] array) {
        for (int num : array) {
            if (num < 0 || num > 10) {
                throw new IllegalArgumentException("Los números deben estar entre 0 y 10.");
            }
        }
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }   
}