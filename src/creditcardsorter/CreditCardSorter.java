/*
 * The purpose of this class is to take in a list ( properly formatted ) list of
 * Card details and order the list in decending order while masking the Card 
 * number.
 */
package creditcardsorter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Comparator.comparing;

/**
 * This main class file covers all file handling, parses the file and creates
 * card objects.
 * @author neilquinlan
 */
public class CreditCardSorter   {
    /**
     *  myCards holds an Arraylist of all Card objects created from parsing the 
     *  file.
     */
     protected static ArrayList<Card>myCards;
     /**
     *  This Constructor initializes the Arraylist myCards that is used to store
     *  cards read in from the text file
     *  file.
     */
     public CreditCardSorter()
     {
         myCards = new ArrayList<Card>();
     }        
     
     
        /**
        *  This method reads a file at the supplied path and calls a method 
        *  createAndAddCardToCollection to create card objects and add them 
        *  to the collection
        * @param filePath is the string location of the file.
        * @return card Arraylist hold the various cards 
        */
        public ArrayList<Card> readCreditCardInfoFromFile (String filePath ) 
        {
            BufferedReader reader;
            try
            {
                reader = new BufferedReader(new FileReader(filePath));
                String line;
            
                while ((line = reader.readLine()) != null) 
                {
                    String cardInformation[] = line.split("\t");
                    createAndAddCardToCollection(cardInformation[0],
                            cardInformation[1],cardInformation[2]);
                }
                
                    reader.close();
            }
            catch( java.lang.ArrayIndexOutOfBoundsException e)
            {
                System.out.println( " The file at "+ filePath + " is not of"
                        + " the correct format, please ensure its a tab "
                        + "delinated text file");
                System.exit(0);
            }    
            catch( FileNotFoundException e)
            {
                System.out.println("File is not present at given location");
                getFilePathReattempt();  
                
            }
            catch( IOException e)
            {
                System.out.println("File can not be read");
            }  
            return myCards;
                
        }    
        /**
        *  This method prompts the user for a location of the file on disk. 
        *  
        * @return String holding the location of the filepath.
        */    
        public String getFilePath ( )
        {
                
            String path=null;
            System.out.println("Please enter path to file:");
            try
            {   
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));
                path = reader.readLine();
               
            }
            catch(IOException e)
            {
               System.out.println("Could not read the file provided");
            }    
                
            return path;
        }
        /**
        *  This method takes in 3 string variables, creates a card object from  
        *  them and adds it to the collection 
        *  to the collection
        * @param issuingBank the name of the bank that issued the card
        * @param cardNumber the number of the card
        * @param cardDate the expiry date of the card.
        */
        public void createAndAddCardToCollection ( String issuingBank, 
                                            String cardNumber,String cardDate )
        {
            Card creditCard = new CreditCard();
            creditCard.setIssuingBank(issuingBank);
            creditCard.setNumber(cardNumber);
            creditCard.setDate(cardDate);
            myCards.add(creditCard);
        }        
                
        /**
        *  This method prompts the user for more information if the first  
        *  attempt at supplying a file path was incorrect.  The option is given 
        *  to re input a file path, or exit. 
        * 
        */ 
        public void getFilePathReattempt()
        {
            String path = null;
            System.out.println( "Would you like to try a different path? Y/N");
            try
            {   
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));
                path = reader.readLine();
            }
            catch(IOException e)
            {
                System.out.println("Could not read the file provided");    
            } 
            if( path.toLowerCase().equals("y"))
            {
                myCards = readCreditCardInfoFromFile(getFilePath());
            }    
            else
            {
                System.exit(0);
            }    
                       
        }        
        /**
        *  This method sorts the cards in descending order by date. 
        *  
        * 
        */           
        public void sortCreditCardsByDescendingDate( )  
        {
            Collections.sort(myCards, new dateCompare());
        }
        /**
        *  This method prints the encrypted information to the console. 
        */     
        public void printOutput()
        {
            System.out.format("%-40s%-40s%-40s\n","Bank","Card Number","Expiry Date");
 
            for( Card c : myCards)
            {
                System.out.printf("%-40s", c.getIssuingBank());
                System.out.print( c.getEncryptedCardNumber());
                System.out.printf("%30s%n", c.getStringDate());
            }    
        }        
         /**
        *  This initialises the main card array and runs the necessary methods
        *  to execute the program. 
        */       
        public void run ()
        {
            myCards = readCreditCardInfoFromFile(getFilePath());
            sortCreditCardsByDescendingDate();
            printOutput();
        }        
         
          /**
        *  This main method makes initialises an instance of itself and makes a 
        *  call to the run method that carries out the procedural work.
        */ 
        public static void main(String args[])
        {
                CreditCardSorter creditCardSorter = new CreditCardSorter();
                creditCardSorter.run();
        }
            
}
