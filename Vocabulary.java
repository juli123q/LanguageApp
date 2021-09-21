import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * object class vocabulary
 * 
 * 
 */
public class Vocabulary {
    // Instanzvariablen
    
   
    
    private String key;
    private String value;
    
    
        /**
     * constructor for ojects of class vocabulary
     * 
     * pair of vocabulary with 2 strings https://www.baeldung.com/java-pairs
     * 
     * @param key foreign vocabulary
     * @param value german translation of vocabulary
     */
    public Vocabulary(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    //Setter & Getter for key
    /**
     * 
     * @param key foreign vocabulary
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * 
     * @return foreign vocabulary
     */
    public String getKey() {
        return key;
    }
    
    //Setter & Getter for value
    /**
     * 
     * @param value german tranbslation of foreign vocabulary
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * 
     * @return german tranbslation of foreign vocabulary
     */
    public String getValue() {
        return value;
    }
    
    
}