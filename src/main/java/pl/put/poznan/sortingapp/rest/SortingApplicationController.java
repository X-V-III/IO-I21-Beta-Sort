package pl.put.poznan.sortingapp.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingapp.app.SortingApplication;
import pl.put.poznan.sortingapp.logic.*;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static pl.put.poznan.sortingapp.util.Utils.*;


/**
 * Klasa implementujaca kontrole nad dzialaniem logiki REST.
 * */
@RestController
public class SortingApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(SortingApplicationController.class);

    /**
     * Metoda implementujaca reakcje na zadanie GET w protokole HTTP.
     */
    @GetMapping(path = "/sorted", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SortResponse> sort(@RequestBody SortRequest sr) {
        if (sr.getValues().size() == 0 || sr.getParameters().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Report[] reports = new Report[sr.getParameters().size()];

        long bestTimeElapsed = 0;
        String bestAlgorithm = null;

        String[] original = new String[0];
        String key = sr.getKey();
        String sortAs = sr.getSortAs();

        int i = 0;
        for (String algName : sr.getParameters()) {
            original = sr.getStringArrayByKey(key);

            long start = System.nanoTime();

            try {
                switch (algName) {
                    case "bubble":
                        BubbleSort.sort(original, sortAs);
                        break;
                    case "selection":
                        SelectionSort.sort(original, sortAs);
                        break;
                    case "insertion":
                        InsertionSort.sort(original, sortAs);
                        break;
                    case "heap":
                        HeapSort.sort(original, sortAs);
                        break;
                    case "merge":
                        MergeSort.sort(original, 0, original.length - 1, sortAs);
                        break;
                    case "quick":
                        QuickSort.sort(original, 0, original.length - 1, sortAs);
                        break;
                    default:
                        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                }
            } catch (IllegalArgumentException e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            long finish = System.nanoTime();
            long timeElapsed = finish - start;

            reports[i] = new Report(algName, timeElapsed);
            if (bestTimeElapsed == 0 || timeElapsed < bestTimeElapsed) {
                bestTimeElapsed = timeElapsed;
                bestAlgorithm = algName;
            }

            i++;
        }

        if (sr.isReversed()) {
            String[] reversed = new String[original.length];
            for (int j = 0; j < original.length; j++) {
                reversed[j] = original[original.length - j - 1];
            }
            original = reversed;
        }
        return new ResponseEntity<>(new SortResponse(original, reports, bestAlgorithm ,bestTimeElapsed), HttpStatus.OK);
    }
}
