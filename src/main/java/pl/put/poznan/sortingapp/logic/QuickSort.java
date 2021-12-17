package pl.put.poznan.sortingapp.logic;

public class QuickSort {

    /**
     * Ta metoda otrzymuje tablicę liczb i dwie liczby całkowite, które odwołują się do pierwszej wartości i ostatniej
     * @param numbers Unsorted array of integers
     * @param izq ?
     * @param der ?
     * @throws IllegalArgumentException When given array is empty, throws IllegalArgumentException
     */
    public static void sort(int[] numbers, int izq, int der) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (numbers.length == 0) throw new IllegalArgumentException();

        //Pierwsza wartość jest przyjmowana jako oś obrotu
        int pivot = numbers[izq];

        //Zdefiniowano dwie strony i pomocnik
        int i = izq;
        int j = der;
        int aux;

        while(i<j)
        {
            while (numbers[i] <= pivot && i < j)
                i++;

            while (numbers[j] > pivot)
                j--;

            if (i<j)
            {
                aux = numbers[i];
                numbers[i]= numbers[j];
                numbers[j]=aux;
            }
        }

        numbers[izq] = numbers[j];
        numbers[j] = pivot;

        if (izq < j-1)
            sort(numbers,izq,j-1);

        if (j+1 < der)
            sort(numbers,j+1,der);
    }
}