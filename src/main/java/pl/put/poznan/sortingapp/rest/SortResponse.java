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
     * @param bestAlgorithm Najlepszy algorytm.
     * @param bestTimeElapsed Najszybszy czas wykonania.
     * */
    public SortResponse(String[] sortedArray, Report[] reports, String bestAlgorithm, long bestTimeElapsed) {
        this.sortedArray = sortedArray;
        this.reports = reports;
        this.bestAlgorithm = bestAlgorithm;
        this.bestTimeElapsed = bestTimeElapsed;
    }

    /**
     * Getter posortowanego ciagu obiektow.
     * @return Posortowany ciąg.
     */
    public String[] getSortedArray() {
        return sortedArray;
    }

    /**
     * Setter posortowanego ciagu obiektow.
     * @param sortedArray  Posortowany ciąg.
     */
    public void setSortedArray(String[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    /**
     * Getter reportow.
     * @return Reporty dzialania algorytmow.
     */
    public Report[] getReports() {
        return reports;
    }

    /**
     * Getter reportow.
     * @param reports Reporty dzialania algorytmow.
     */
    public void setReports(Report[] reports) {
        this.reports = reports;
    }

    /**
     * Getter bestTimeElapsed.
     * @return Najszybszy czas wykonania.
     */
    public long getBestTimeElapsed() {
        return bestTimeElapsed;
    }

    /**
     * Setter bestTimeElapsed.
     * @param bestTimeElapsed Najszybszy czas wykonania.
     */
    public void setBestTimeElapsed(long bestTimeElapsed) {
        this.bestTimeElapsed = bestTimeElapsed;
    }

    /**
     * Getter bestAlgorithm.
     * @return Najlepszy algorytm.
     */
    public String getBestAlgorithm() {
        return bestAlgorithm;
    }

    /**
     * Setter bestAlgorithm.
     * @param bestAlgorithm Najlepszy algorytm.
     */
    public void setBestAlgorithm(String bestAlgorithm) {
        this.bestAlgorithm = bestAlgorithm;
    }
}
