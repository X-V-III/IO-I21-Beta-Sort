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

    /**
     * Konstruktor klasy SortRequest.
     * @param values Ciag obiektow do posortowania.
     * @param parameters Lista algorytmow sortujacych do wykorzystania.
     * @param reversed Czy odwracac wynik.
     * @param key Klucz
     * @param sortAs Sortować elementy jako obiekty jakiej klasy
     * */
    public SortRequest(ArrayList<Object> values, ArrayList<String> parameters, boolean reversed, String key, String sortAs) {
        this.values = values;
        this.parameters = parameters;
        this.reversed = reversed;
        this.key = key;
        this.sortAs = sortAs;
    }

    /**
     * Transforms ArrayList of Maps to a list of Strings using key
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
     */
    public String getSortAs() {
        return sortAs;
    }

    /**
     * Getter sortAs
     */
    public void setSortAs(String sortAs) {
        this.sortAs = sortAs;
    }

    /**
     * Getter klucza
     */
    public String getKey() {
        return key;
    }

    /**
     * Setter klucza
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
    * Getter wartosci.
    */
    public ArrayList<Object> getValues() {
        return values;
    }

    /**
     * Setter wartosci.
     */
    public void setValues(ArrayList<Object> values) {
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
