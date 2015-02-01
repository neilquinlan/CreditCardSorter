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
public class testSetDate {
    
    public testSetDate() {
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
    @Test
     public void dateNormal() {
         
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         card1.setDate("NOV-12");
         assertEquals("NOV-12",card1.getStringDate());
       }
     
         @Test
     public void datelowerCase() {
         
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         card1.setDate("nov-12");
         assertEquals("nov-12",card1.getStringDate());
       }
     @Test
          public void dateUpperCase() {
         
         CreditCardSorter c = new CreditCardSorter();
         Card card1 = new CreditCard();
         card1.setDate("nov-12");
         assertEquals("nov-12",card1.getStringDate());
       }
}
