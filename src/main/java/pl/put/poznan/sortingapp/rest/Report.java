package pl.put.poznan.sortingapp.rest;

public class Report {
    public Report(String algorithm, long time) {
        this.algorithm = algorithm;
        this.time = time;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public float getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private String algorithm;
    private long time;


}
