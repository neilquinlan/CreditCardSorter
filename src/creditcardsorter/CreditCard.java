/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardsorter;

import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author neilquinlan
 */
public class CreditCard implements Card  {
    private String issuingBank;
    private String number;
    protected String encryptedNumber;
    private String dateAsString;
    private Date dateAsObject;
    
    @Override
    public void setIssuingBank(String name)
    {
        issuingBank = name;
    }
    
    @Override
    public void setNumber(String cardNumber)
    {
        number = cardNumber;   
    }
    
    @Override
    public void setDate(String cardDate)
    {
        dateAsString = cardDate;
        SimpleDateFormat simpleDate = new SimpleDateFormat("MMMM-yyyy");
        try
        {
            dateAsObject = simpleDate.parse(dateAsString);
        }
        catch(ParseException e)
        {
            System.out.println( " The file is incorrect Date Format"
                    + "Plase ensure format is of the type MMM - YYYY");
        }
    }   
     /**
    * Returns the date in CardFormat. 
    *
    * @return         The Date of the card.
    */
    public String getStringDate ()
    {
        return dateAsString;
    }
     /**
    * Returns the date of the card. 
    *
    * @return         The Date of the card.
    */
    public Date getObjectDate ()
    {
        return dateAsObject;
    }
      /**
    * Returns the name of the bank that Issues the credit card. 
    *
    * @return         String representing the name of the issuingBank.
    */
    public String getIssuingBank ()
    {
        return issuingBank;
    }
      /**
    * Returns the encrypted number of the card . 
    *
    * @return         String representing the encrypted number of the card.
    */
    public String getEncryptedCardNumber ()
    {
        String  cardStartNumber = number.substring(0, 4), holdNumber;
        
        StringBuilder strBldrCardNumber;
                       
        switch(cardStartNumber)
        {
            case "5601":
                holdNumber =  (String) number.subSequence(2, number.length());
                strBldrCardNumber = new StringBuilder(holdNumber);
                strBldrCardNumber = this.replaceCardString(strBldrCardNumber);
                strBldrCardNumber.insert(0, "56");            
            break; 
            case "4519":
                holdNumber =  (String) number.subSequence(4, number.length());
                strBldrCardNumber = new StringBuilder(holdNumber);
                strBldrCardNumber = this.replaceCardString(strBldrCardNumber);
                strBldrCardNumber.insert(0, "4519");
            break;    
            case "3786":
                String detailedNumber = (String) 
                       number.substring(15, number.length());
               
                holdNumber =  (String) number.substring(0,15);
                strBldrCardNumber = new StringBuilder(holdNumber);
                strBldrCardNumber = this.replaceCardString(strBldrCardNumber);  
                strBldrCardNumber.append(detailedNumber);
            break;    
            default :
                holdNumber = "Card number not recognised";
                strBldrCardNumber = new StringBuilder(holdNumber);
                this.dateAsString = "Withholding Details";
                
                
        } 
        
        return strBldrCardNumber.toString();
                
    }
      /**
    * This is a helper method for getCardNumber that replaces private data with
    * x.
    *
    * @return         String representing the encrypted number of the card.
    */
    private StringBuilder replaceCardString(StringBuilder sB)
    {
        char hold = 'x';
        
            for ( int i = 0; i < sB.length(); i++)
            {
               if( ! String.valueOf(sB.charAt(i)).equals("-"))
               {
                   sB.setCharAt(i, hold);
               }    
            }
        return sB;
    }        
        
}
