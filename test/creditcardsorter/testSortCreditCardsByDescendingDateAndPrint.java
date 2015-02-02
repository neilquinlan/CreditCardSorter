/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardsorter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author neilquinlan
 */
public class testSortCreditCardsByDescendingDateAndPrint {
    
    public testSortCreditCardsByDescendingDateAndPrint() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     /*
     *Adding and testing we sort cards in correct format correctly.
     */
     @Test
     public void testDesc() {
     
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2017");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2016");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2015");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2014");
         c.sortCreditCardsByDescendingDate();
         c.printOutput();
         
     }
     
     /*
     *Adding and testing we dont display cards numbers that we dont know how to 
     *correctly mask.
     */
      @Test
     public void testUnknownDetail(){
     
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         c.createAndAddCardToCollection("HSBOS", "1234-2345-3446-5678", "Nov-2017");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2016");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2015");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "Nov-2014");
         c.sortCreditCardsByDescendingDate();
         c.printOutput();
         
     }
     /*
     *Adding and testing that we handle cards with bad dates.
     *
     */ 
     @Test
     public void testbadDate(){
     
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         c.createAndAddCardToCollection("HSBOS", "1234-2345-3446-5678", "2017");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "2016");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "2015");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "2014");
         
         
     }
     /*
     *Adding and testing that we can handle dates that are all lowercase.
     *
     */      
     @Test
     public void testLowerCaseDate(){
     
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         c.createAndAddCardToCollection("HSBOS", "1234-2345-3446-5678", "nov-2017");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "nov-2016");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "nov-2015");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "nov-2014");
         c.sortCreditCardsByDescendingDate();
         c.printOutput();
         
     }
     /*
     *Adding and testing that we can handle dates that are all uppercase.
     *
     */     
          public void testUpperCaseDate(){
     
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         c.createAndAddCardToCollection("HSBOS", "1234-2345-3446-5678", "NOV-2017");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "NOV-2016");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "NOV-2015");
         c.createAndAddCardToCollection("HSBOS", "5601-2345-3446-5678", "NOV-2014");
         c.sortCreditCardsByDescendingDate();
         c.printOutput();
         
     }
}
