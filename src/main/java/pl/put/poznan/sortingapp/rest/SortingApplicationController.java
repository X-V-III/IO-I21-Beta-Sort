package pl.put.poznan.sortingapp.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingapp.app.SortingApplication;
import pl.put.poznan.sortingapp.logic.*;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
public class SortingApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(SortingApplicationController.class);

    @GetMapping(path = "/sorted", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SortResponse> sort(@RequestBody SortRequest sr) {
        if (sr.getValues().length == 0 || sr.getParameters().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Report[] reports = new Report[sr.getParameters().size()];

        int[] original = new int[0];

        int i = 0;
        for (String algName : sr.getParameters()) {
            original = sr.getValues();

            long start = System.nanoTime();

            try {
                switch (algName) {
                    case "bubble":
                        BubbleSort.sort(original);
                        break;
                    case "selection":
                        SelectionSort.sort(original);
                        break;
                    case "insertion":
                        InsertionSort.sort(original);
                        break;
                    case "heap":
                        HeapSort.sort(original);
                        break;
                    case "merge":
                        MergeSort.sort(original, 0, original.length - 1);
                        break;
                    case "quick":
                        QuickSort.sort(original, 0, original.length - 1);
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
            i++;
        }

        return new ResponseEntity<>(new SortResponse(original, reports), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                      @RequestParam(value = "transforms", defaultValue = "upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example

        SortingApplication transformer = new SortingApplication();
        return "Tymczasowy string do resta - get method";
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                       @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingApplication transformer = new SortingApplication();
        return "Tymczasowy string do resta - post method";
    }


}
