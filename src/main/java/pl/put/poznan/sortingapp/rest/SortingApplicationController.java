package pl.put.poznan.sortingapp.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingapp.app.SortingApplication;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class SortingApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(SortingApplicationController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

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


