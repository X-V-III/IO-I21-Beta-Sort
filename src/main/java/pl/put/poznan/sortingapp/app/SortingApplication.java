package pl.put.poznan.sortingapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Klasa SortingApplication zawierajaca glowna metode rozruchowa main.
 *
 * @author
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = {"pl.put.poznan.sortingapp.rest"})
public class SortingApplication {

    /**
     * Glowna metoda rozruchowa aplikacji. Rozpoczyna prace serwera z pomoca biblioteki Spring. Inicjuje obiekty potrzebne do dzialania.
     *
     * @param args Domyslny parametr metody main().
     */
    public static void main(String[] args) {
        SpringApplication.run(pl.put.poznan.sortingapp.app.SortingApplication.class, args);
    }
}
