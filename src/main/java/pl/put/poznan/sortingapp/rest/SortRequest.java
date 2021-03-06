package pl.put.poznan.sortingapp.rest;

import org.springframework.boot.autoconfigure.amqp.AbstractRabbitListenerContainerFactoryConfigurer;

import java.util.ArrayList;
import java.util.Map;

/**
 * Klasa odzwierciedlajaca przekazany przez uzytkownika ciag obiektow do posortowania.
 * */
public class SortRequest {
    private ArrayList<Object> values;
    private ArrayList<String> parameters;
    private String key;
    private boolean reversed;
    private String sortAs;
    private int iterations;

    /**
     * Konstruktor klasy SortRequest.
     * @param values Ciag obiektow do posortowania.
     * @param parameters Lista algorytmow sortujacych do wykorzystania.
     * @param reversed Czy odwracac wynik.
     * @param key Klucz
     * @param sortAs Sortować elementy jako obiekty jakiej klasy
     * @param iterations liczba iteracji
     * */
    public SortRequest(ArrayList<Object> values, ArrayList<String> parameters, boolean reversed, String key, String sortAs, int iterations) {
        this.values = values;
        this.parameters = parameters;
        this.reversed = reversed;
        this.key = key;
        this.sortAs = sortAs;
        this.iterations = iterations;
    }

    /**
     * Transforms ArrayList of Maps to a list of Strings using key
     * @param key Klucz.
     * @return Ciąg .
     */
    public String[] getStringArrayByKey(String key) {
        String[] toSort = new String[values.size()];
        for (int i = 0; i < values.size(); ++i) {
            Map<String, String> param = (Map<String, String>) values.get(i);
            String strValue = (String) param.get(key);
            toSort[i] = strValue;
        }
        return toSort;
    }

    /**
     * Getter sortAs
     * @return Jak posortować.
     */
    public String getSortAs() {
        return sortAs;
    }

    /**
     * Getter sortAs
     * @param sortAs Jak posortować.
     */
    public void setSortAs(String sortAs) {
        this.sortAs = sortAs;
    }

    /**
     * Getter klucza
     * @return Jaki klucz.
     */
    public String getKey() {
        return key;
    }

    /**
     * Setter klucza
     * @param key  Jaki klucz.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
    * Getter wartosci.
     * @return Wartości.
    */
    public ArrayList<Object> getValues() {
        return values;
    }

    /**
     * Setter wartosci.
     * @param values  Wartości.
     */
    public void setValues(ArrayList<Object> values) {
        this.values = values;
    }

    /**
     * Getter listy algorytmow.
     * @return Parametry.
     */
    public ArrayList<String> getParameters() {
        return parameters;
    }

    /**
     * Setter listy algorytmow.
     * @param parameters  Parametry.
     */
    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Getter wartosci odwracania.
     * @return Czy posortowana.
     */
    public boolean isReversed() {
        return reversed;
    }

    /**
     * Setter wartosci odwracania.
     * @param reversed  Czy posortowana.
     */
    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }

    /**
     * Getter liczby iteracji.
     * @return iterations
     */
    public int getIterations() {
        return iterations;
    }

    /**
     * Setter liczby iteracji.
     * @param iterations
     */
    public void setIterations(int iterations) {
        this.iterations = iterations;
    }
}
