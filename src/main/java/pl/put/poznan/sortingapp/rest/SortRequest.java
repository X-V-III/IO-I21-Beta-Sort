package pl.put.poznan.sortingapp.rest;

import java.util.ArrayList;

public class SortRequest {
    private int[] values;
    private ArrayList<String> parameters;
    private boolean reversed;

    public SortRequest(int[] values, ArrayList<String> parameters, boolean reversed) {
        this.values = values;
        this.parameters = parameters;
        this.reversed = reversed;
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

    public boolean isReversed() {
        return reversed;
    }

    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }
}
