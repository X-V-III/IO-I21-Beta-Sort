package pl.put.poznan.sortingapp.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingapp.app.SortingApplication;
import pl.put.poznan.sortingapp.logic.BubbleSort;
import pl.put.poznan.sortingapp.logic.MergeSort;
import pl.put.poznan.sortingapp.logic.SelectionSort;

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
                if (algName.equals("bubble")) {
                    BubbleSort.sort(original);
                } else if (algName.equals("selection")) {
                    SelectionSort.sort(original);
                } else {
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
