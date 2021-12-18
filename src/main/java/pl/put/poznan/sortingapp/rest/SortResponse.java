package pl.put.poznan.sortingapp.rest;

/**
 * Klasa odzwierciedlajaca zwracana przez system odpowiedz.
 * */
public class SortResponse {

    /**
     * Getter posortowanego ciagu obiektow.
     */
    public int[] getSortedArray() {
        return sortedArray;
    }

    /**
     * Setter posortowanego ciagu obiektow.
     */
    public void setSortedArray(int[] sortedArray) {
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

    /**
     * Konstruktor klasy SortResponse.
     * @param sortedArray Posortowany ciag obiektow.
     * @param reports Reporty dzialania algorytmow.
     * */
    public SortResponse(int[] sortedArray, Report[] reports) {
        this.sortedArray = sortedArray;
        this.reports = reports;
    }

    private int[] sortedArray;
    private Report[] reports;

}
