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
public class testGetCardNumber {
    
    public testGetCardNumber() {
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
    public void card1() 
    {   
        CreditCard c = new CreditCard();
        c.setNumber("5601-2345-3446-5678");
        assertEquals("56xx-xxxx-xxxx-xxxx",c.getEncryptedCardNumber());
        
    }
    
    @Test
    public void card2() 
    {   
        CreditCard c = new CreditCard();
        c.setNumber("4519-4532-4524-2456");
        assertEquals("4519-xxxx-xxxx-xxxx",c.getEncryptedCardNumber());
        
    }
    @Test
    public void card3() 
    {   
        CreditCard c = new CreditCard();
        c.setNumber("3786-7334-8965-345");
        assertEquals("xxxx-xxxx-xxxx-345",c.getEncryptedCardNumber());
        
    }
    @Test
    public void card4() 
    {   
        CreditCard c = new CreditCard();
        c.setNumber("2367-7334-8965-3453-34543");
        System.out.println(c.getEncryptedCardNumber());
        
    }
    
}
