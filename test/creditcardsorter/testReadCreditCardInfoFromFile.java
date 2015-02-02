/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardsorter;

import java.util.ArrayList;
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
public class testReadCreditCardInfoFromFile {
    
    public testReadCreditCardInfoFromFile() {
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
     *Testing a correct file runs the programme.
     */
  
    @Test
     
     public void properFilePath() throws Exception {
     
          CreditCardSorter c = new CreditCardSorter();
        
          c.readCreditCardInfoFromFile("/Users/NeilQuinlan/Desktop/creditCards.txt");
          
     }
     
    /*
     *Testing a incorrect file is handled by the programme.
     */
     @Test
     public void improperFilePath() throws Exception {
     
         // CreditCardSorter c = new CreditCardSorter();
         // c.readCreditCardInfoFromFile("/Users/NeilQuinlan/Desktop/creditCard.tx");
                 
     }
    /*
     *Testing a incorrect file is handled by the programme.
     */
     @Test
     public void improperFilePathEmptyString() throws Exception {
     
          CreditCardSorter c = new CreditCardSorter();
          c.readCreditCardInfoFromFile("");
                 
     }    
     
 
     
     
}
