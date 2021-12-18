package pl.put.poznan.sortingapp.rest;

import java.util.ArrayList;

/**
 * Klasa odzwierciedlajaca przekazany przez uzytkownika ciag obiektow do posortowania.
 * */
public class SortRequest {
    private int[] values;
    private ArrayList<String> parameters;
    private boolean reversed;

    /**
     * Konstruktor klasy SortRequest.
     * @param values Ciag obiektow do posortowania.
     * @param parameters Lista algorytmow sortujacych do wykorzystania.
     * @param reversed Czy odwracac wynik.
     * */
    public SortRequest(int[] values, ArrayList<String> parameters, boolean reversed) {
        this.values = values;
        this.parameters = parameters;
        this.reversed = reversed;
    }

    /**
    * Getter wartosci.
    */
    public int[] getValues() {
        return values;
    }

    /**
     * Setter wartosci.
     */
    public void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Getter listy algorytmow.
     */
    public ArrayList<String> getParameters() {
        return parameters;
    }

    /**
     * Setter listy algorytmow.
     */
    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Getter wartosci odwracania.
     */
    public boolean isReversed() {
        return reversed;
    }

    /**
     * Setter wartosci odwracania.
     */
    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }
}
