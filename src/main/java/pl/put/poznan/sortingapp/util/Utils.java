package pl.put.poznan.sortingapp.util;

/**
 * Klasa dodatkowa, Utils.
 */
public class Utils {
    /**
     * Wypisuje liste obiektow typu int.
     * @param arr Ciag obiektow do wypisania.
     */
    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    /**
     * Wypisuje liste obiektow typu String.
     * @param arr Ciag obiektow do wypisania.
     */
    public static void printArray(String[] arr) {
        for (String j : arr) System.out.print(j + " ");
        System.out.println();
    }

    /**
     * Makes an array of String to array of int
     * @param arr Ciag obiektow.
     * @return Ciąg liczb.
     */
    public static int[] stringsToInts(String[] arr) {
        int[] arrInts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInts[i] = Integer.parseInt(arr[i]);
        }
        return arrInts;
    }

    /**
     * Makes an array of int to array of String
     * @param arr Ciag obiektow.
     * @return Ciąg stringów.
     */
    public static String[] intsToStrings(int[] arr) {
        String[] arrInts = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInts[i] = String.valueOf(arr[i]);
        }
        return arrInts;
    }
}
