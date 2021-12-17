package pl.put.poznan.sortingapp.rest;

public class SortResponse {
    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public Report[] getReports() {
        return reports;
    }

    public void setReports(Report[] reports) {
        this.reports = reports;
    }

    public SortResponse(int[] sortedArray, Report[] reports) {
        this.sortedArray = sortedArray;
        this.reports = reports;
    }

    private int[] sortedArray;
    private Report[] reports;

}
