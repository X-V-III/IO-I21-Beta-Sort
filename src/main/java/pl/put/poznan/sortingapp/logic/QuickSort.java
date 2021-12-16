package pl.put.poznan.sortingapp.logic;

public class QuickSort {

    public static void main(String[] args) {

        //Liczby do sortowania
        int numbers [] = {10,9,8,7,6,5,4,3,2,1};

        Quicksort(numbers, 0, numbers.length -1);

        //Posortowana metoda druku wektorowego
        vectorPrint(numbers);
    }

    /*Ta metoda otrzymuje tablicę liczb i dwie liczby całkowite, które odwołują się do pierwszej wartości i ostatniej. */
    public static void Quicksort(int numbers[], int izq, int der)
    {

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
            Quicksort(numbers,izq,j-1);

        if (j+1 < der)
            Quicksort(numbers,j+1,der);
    }
    public static void vectorPrint(int[] system)
    {
        for(int i = 0; i < system.length; i++)
        {
            System.out.println(system[i]);
        }
    }

}