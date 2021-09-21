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
     * Holt sich das aktuelle Datum und stellt es in das vorgegebene Format TT Monat JJJJ um.
     * Quelle für das Formatieren übernommen aus dem Beispiel https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
     * 
     * @return das aktuelle Datum, formatiert
     */
    public String formattingDate() {
        DateTimeFormatter formatierer = DateTimeFormatter.ofPattern("dd. MMMM yyyy");
        String text = defaultDatum.format(formatierer);
        LocalDate formatiert = LocalDate.parse(text, formatierer);
        return text;
    }
    
    /**
     * Holt sich die aktuelle Uhrzeit und stellt sie in das vorgegebene Format HH:MM (24-Stunden-Zählung) um.
     * 
     * @return die aktuelle Uhrzeit, formatiert
     */
    public String formattingTie() {
        DateTimeFormatter formatierer = DateTimeFormatter.ofPattern("kk:mm");
        String text = defaultZeit.format(formatierer);
        LocalTime formatiert = LocalTime.parse(text, formatierer);
        return text;
    }
}