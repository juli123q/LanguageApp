import java.util;
import java.util.HashMap;

/**
 * class Query
 * classify the vocabulary depending on the actual date when user starts the query
 * sorting of vocabulary after each query depending the correctness of user input
 * if input is correct vocabulary will rise to the next section
 * starting point is daily -> weekly -> monthly -> randomly (last section)
 * if input is not correct the corresponding vocabulary will descend to daily
 * 
 */
public class Query {
    //
    private HashMap<Periodicity, Vocabulary> vocab = new ArrayList<>();
    
    /**
     * constructor for objects of class Query
     */
    public Query()
    {
        // Instanzvariable initialisieren
        
    }
    
    /**
     * method for creating a vocabulary pair including enum specification
     * enum has to be set to daily for all new added vocabulary
     * vocabulary object is initialised by user input and will be saved in the corresponding HashMap vocabulary
     * 
     */
    public void addVocabulary(String key, String value) {
        
        //Instanziierung
        Vocabulary voc = new Vocabulary(key, value);
        vocab.put(Periodicity.daily, voc);
        //scan.close();
    }
    
    /**
     * method to determain which frequency section (enum) equals the current date to get the corresponding vocabulary
     * https://www.geeksforgeeks.org/hashmap-get-method-in-java/
     * 
     * 
     *
     */
    public void frequencyVocabulary() {
        getDayOfMonth();
        getPeriodicity();
        
        if (dayOfMonthequalsWeekly == true) {
            // hash_map.get(Weekly)
        }
        else if (dayOfMonthequalsMonthly == true) {
            // hash_map.get(Monthly)
        }
        else if (dayOfMonthequalsRandomly == true) {
            // hash_map.get(Randomly)
        }
        else {
            // hash_map.get(Daily)
        }
        
        
        
    }
   
    
    
    /**
     * method for checking user input
     * 
     * @param  inputEqualsKey user input is identical qith key value of the vocabulary
     * @return  
     */
    public checkKey(List<Vokabel> vocab, final String key) {
        for (Vokabel v: vocab) {
        if (s.keyequalsKey == true) {
            // remove(String key)
            // put(
        }
        else {
        }
    }
    
    }
    
    
    /**
     * method to determine current day of month
     * 
     */
    public static int getDayOfMonth(Date aDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        return cal.get(Calendar.DAY_OF_MONTH);
    }
    
    
    
    /**
     * 
     * @ param Enum for classification of query
     * example for Periodicity https://stackoverflow.com/questions/56719489/is-there-an-enum-for-day-week-month-and-year
     * https://stackoverflow.com/questions/3990319/storing-integer-values-as-constants-in-enum-manner-in-java
     * 
     * adding day of month to enum?
     * 
     */
    public enum Periodicity {
        Daily, Weekly(6,12,18,24,30), Monthly(28), Randomly(31);
    
    
    private final int value;
    
    Periodicity (final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }
    
}
