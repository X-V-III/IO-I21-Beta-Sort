package pl.put.poznan.sortingapp.rest;

/**
 * Klasa odzwierciedlajaca zwracana przez system odpowiedz.
 * */
public class SortResponse {

    private String[] sortedArray;
    private Report[] reports;
    private String bestAlgorithm;
    private long bestTimeElapsed;

    /**
     * Konstruktor klasy SortResponse.
     * @param sortedArray Posortowany ciag obiektow.
     * @param reports Reporty dzialania algorytmow.
     * */
    public SortResponse(String[] sortedArray, Report[] reports, String bestAlgorithm, long bestTimeElapsed) {
        this.sortedArray = sortedArray;
        this.reports = reports;
        this.bestAlgorithm = bestAlgorithm;
        this.bestTimeElapsed = bestTimeElapsed;
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

    /**
     * Getter bestTimeElapsed.
     */
    public long getBestTimeElapsed() {
        return bestTimeElapsed;
    }

    /**
     * Setter bestTimeElapsed.
     */
    public void setBestTimeElapsed(long bestTimeElapsed) {
        this.bestTimeElapsed = bestTimeElapsed;
    }

    /**
     * Getter bestAlgorithm.
     */
    public String getBestAlgorithm() {
        return bestAlgorithm;
    }

    /**
     * Setter bestAlgorithm.
     */
    public void setBestAlgorithm(String bestAlgorithm) {
        this.bestAlgorithm = bestAlgorithm;
    }
}
