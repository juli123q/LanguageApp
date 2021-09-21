import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTime indication of current date and time
 * 
 *
 */

public class DateTime {
    // Instanzvariablen 
    private LocalDate defaultDatum;
    private LocalTime defaultZeit;
    
    /**
     * constructor for objects of class DateTime
     */
    public DateTime() {
        // Instanzvariable initialisieren
        defaultDatum = LocalDate.now();
        defaultZeit = LocalTime.now();
    }

    /**
     * getting the actual date
     * example https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
     * 
     * @return the actual date, formatted
     */
    public String formattingDate() {
        DateTimeFormatter formatierer = DateTimeFormatter.ofPattern("dd. MMMM yyyy");
        String text = defaultDatum.format(formatierer);
        LocalDate formatiert = LocalDate.parse(text, formatierer);
        return text;
    }
    
    /**
     * getting actual time
     * 
     * @return the actual time, formatted
     */
    public String formattingTie() {
        DateTimeFormatter formatierer = DateTimeFormatter.ofPattern("kk:mm");
        String text = defaultZeit.format(formatierer);
        LocalTime formatiert = LocalTime.parse(text, formatierer);
        return text;
    }
}
