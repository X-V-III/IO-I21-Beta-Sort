package pl.put.poznan.sortingapp.rest;

/**
 * Klasa implementujaca metody potrzebne do dzialania logiki REST.
 * */
public class Report {
    public Report(String algorithm, long time) {
        this.algorithm = algorithm;
        this.time = time;
    }

    /**
     * Metoda zwracajaca nazwe algorytmu sortujacego.
     * @return Nazwa algorytmu sortujacego typu String
     * */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Metoda ustawiajaca nazwe algorytmu sortujacego.
     * @param algorithm Nazwa algorytmu sortujacego typu String.
     * */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Metoda zwracajaca zapisany wczesniej czas w nanosekundach.
     * @return Zapisana wczesniej chwila czasu w nanosekundach.
     * */
    public float getTime() {
        return time;
    }

    /**
     * Metoda ustawiajaca aktualna chwile czasu w nanosekundach.
     * @param time aktualny czas w nanosekundach.
     * */
    public void setTime(long time) {
        this.time = time;
    }

    private String algorithm;
    private long time;


}
