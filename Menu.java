import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.time.format.DateTimeParseException;
import java.lang.IndexOutOfBoundsException;

/**
 * main class containing all methods to create, delete and show the vocabulary
 * 
 * 
 */
public class Menu {
     
   
    //declaration + initialization of main scanner
    private Scanner scan = new Scanner(System.in);
    
    /**
     * Start of the program
     * 
     * @param   String[] args       console input
     */
    public static void main(String[] args) {
        Trainer start = new Trainer();
        
        //program starts here
        start.firstSelection();
    } 
    
    //2 methods for vocabulary
    /**
     * creating vocabulary 
     * vocabulary object is instantiated through user input and is saved in the corresponding array list or hash map
     * 
     */
    public void addVocab(String key, String value) {
        
        //Instantiation
        Vocabulary voc = new Vocabulary(key, value);
        vocab.put(voc, Periodicity.daily);
        //scan.close();
    }
     
    /**
     * Method to show saved vocabulary
     */
    public void printVocab() {
        for(Vocabulary v: vocab){
            System.out.println(v);
        }
    }
    
    //Method to move in the program - first level
    /**
     * first level of program which includes a switch case for further monement. navigation with numbers 1 to 5. 
     * 
     */
    public void firstSelection() {
        System.out.println(" [1] query vocabulary.\n [2] add new vocabulary.\n [3] show vocabulary.\n [4] delete vocabulary.\n [5] exit.");
        Scanner s = new Scanner(System.in);
        try { //Exceptionhandling in einem Block --> von hier aus alle Methoden verbunden, deshalb greift es für das ganze Programm
            int answer = s.nextInt();
            switch (answer) { //options first level
                case 1: //= query vocabulary => selection of language
                    selectLanguage();
                    break;
                case 2: //= add vocabulary => selection of vocabulary
                    selectVocabulary();
                    break;
                case 3: //= print saved vocabulary
                    System.out.println("\n------> Whole vocabulary:");
                    if (vocab.isEmpty() ) {
                        System.out.println("No entries yet!");
                    } else {
                        printVocabulary();
                    }
                    whatNow(); //= return to firstSelection()
                    break;
                case 4: //= delete vocabulary
                    delete(); 
                    break;
                case 5: //= end Program
                    quit();
                    break;
                default: //if input is 0 or >5
                    System.out.println("Please use numbers 1 to 5.");
                    firstSelection();
            }
        
        } catch (InputMismatchException e) {
            System.out.println("\n=!!= INVALID INPUT =!!= \nPlease use one of the stated options.\nTry again.");
            firstSelection();
            selectLanguage();
            selectVocabulary();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No saved vocabulary");
            delete();
        }
        s.close();
    }
    
    //second level
    
    private void selectLanguage() {
        System.out.println("\nChoose language \n [a] German" 
                                +"\n [b] foreign language\n [c] back.");
        Scanner s = new Scanner(System.in);
        char select = s.next().toLowerCase().charAt(0); //dadurch wird char gelesen, Groß- & Kleinschreibung "verbessert" und was nach erstem char kommt ignoriert
        switch (select) {
            case 'a': //= query with german vocabulary displayed, so user input has to be in the foreign language
                getBestimmungVokabel();
                print value;
                scan 
            
                break;
            case 'b': //= query with foreign vocabulary displayed, user input in german
                getBestimmungVokabel();
                print key;
                
                break;
            case 'c':
                firstSelection();
                break;
            default:
                System.out.println("invalid input");
                selectLanguage);
        }
        s.close();    
    }
    
    
    private void selectVocabulary() {
        System.out.println("\n**ADD VOCABULARY** o<:)");
        addVocabulary();
        System.out.print("NEW: ");
        printVocabulary();    
        System.out.println("\nWant to add more vocabulary?\nYes: [true] or No:[false]");
        Scanner s = new Scanner(System.in);
        char select = s.next().toLowerCase().charAt(0);      
        
                if (additionalVocabulary == true) {
                    do {
                        System.out.println("\nPlease insert here\n");
                        addVocabulary();
                        System.out.println("Whole vocabulary");
                        printVocabulary();
                        System.out.println("\nAdd more? insert [true] or [false].");
                        if (additionalVocabulary() == true) {
                            continue;
                        } else {
                            whatNow();
                            break;
                        }
                    } while (additionalVocabulary == true);
                } else {
                    whatNow();
                }
                
                
                System.out.println("invalid input");
                selectVocabulary();
        
        s.close();    
    }
    
    private void whatNow(){
        System.out.println("\nWhat you want to do now?");
        firstSelection();
    }
    
    private void delete() {
        System.out.println("\nWhich vocabulary you want to delete?");
        printVocabulary();
        System.out.print("------> delete: ");
        vocab.remove(s.nextInt());
        System.out.println("\n===> overview:");
        
        if (vocab.isEmpty()) {
                        System.out.println("No saved vocabulary");
                    } else {
                        printVocabulary();
                    }
               
        }
    
        
    private void quit() {
        scan.close();
        System.out.println("Close window");
        }
    
    
}