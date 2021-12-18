package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego HeapSort.
 */
public class HeapSort
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    /**
     * Metoda buildheap sluzaca do budowania sterty z nieposortowanego ciagu obiektow.
     * @param a Nieposortowany ciag obiektow.
     */
    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            //System.out.println(i);
            maxheap(a,i);
        }
    }

    /**
     * Metoda maxheap sluzaca dalszemu przetwarzaniu w algorytmie.
     * @param a Przekazany ciag.
     * @param i Dodatkowy parametr metody maxheap.
     */
    public static void maxheap(int[] a, int i){
        left=2*i;
        right=2*i+1;
        //System.out.println(i + " " + left + " " + right);
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }

        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }

    /**
     * Metoda exchange sluzaca do zamiany pozycji obiektow.
     * @param i Pierwszy obiekt okreslonego typu.
     * @param j Drugi obiekt okreslonego typu.
     */
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    /**
     * Sortuje podany ciag obiektow algorytmem HeapSort.
     * @param a0 Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     *
     */
    public static void sort(int []a0) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (a0.length == 0) throw new IllegalArgumentException();

        a=a0;
        buildheap(a);

        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
}
