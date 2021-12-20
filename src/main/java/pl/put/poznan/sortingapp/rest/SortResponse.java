package pl.put.poznan.sortingapp.rest;

/**
 * Klasa odzwierciedlajaca zwracana przez system odpowiedz.
 * */
public class SortResponse {

    private String[] sortedArray;
    private Report[] reports;

    /**
     * Konstruktor klasy SortResponse.
     * @param sortedArray Posortowany ciag obiektow.
     * @param reports Reporty dzialania algorytmow.
     * */
    public SortResponse(String[] sortedArray, Report[] reports) {
        this.sortedArray = sortedArray;
        this.reports = reports;
    }

    /**
     * Getter posortowanego ciagu obiektow.
     */
    public String[] getSortedArray() {
        return sortedArray;
    }

    /**
     * Setter posortowanego ciagu obiektow.
     */
    public void setSortedArray(String[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    /**
     * Getter reportow.
     */
    public Report[] getReports() {
        return reports;
    }

    /**
     * Getter reportow.
     */
    public void setReports(Report[] reports) {
        this.reports = reports;
    }
}
