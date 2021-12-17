package pl.put.poznan.sortingapp.rest;

import java.util.ArrayList;

public class SortRequest {
    private int[] values;
    private ArrayList<String> parameters;

    public SortRequest(int[] values, ArrayList<String> parameters) {
        this.values = values;
        this.parameters = parameters;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }
}