/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardsorter;
import java.util.Date;

/**
 * This infaces outlines the methods needed for a card instance.
 * @author neilquinlan
 */
public interface Card {
    /**
     * This method takes in a variable that represents the credit card number 
     * and sets the cardNumber variable with it.
     * @param cardNumber a String representing the card number
     * 
     */
    void setNumber(String cardNumber);
   /**
     * This method takes in a variable that represents the bank that issued 
     * the card and sets the issuingBank variable with it
     * @param name the Name of the bank that issued the card
     * 
     */ 
    void setIssuingBank(String cardNumber);
    /**
     * This method takes in a variable that represents the expiry date 
     * and sets the dateAsString variable with it.
     * @param cardDate a String representing the card expirydate
     * 
     */
    void setExpiryDate(String cardDate);
  /**
    * Returns the encrypted number of the card . 
    *
    * @return         String representing the encrypted number of the card.
    */    
    String getEncryptedCardNumber();
      /**
    * Returns the name of the bank that Issues the credit card. 
    *
    * @return         String representing the name of the issuingBank.
    */
    String getIssuingBank();
     /**
    * Returns the date in CardFormat. 
    *
    * @return         The Date of the card.
    */    
    String getStringDate();
     /**
    * Returns the date of the card. 
    *
    * @return         The Date of the card as a Date Object.
    */
    Date getObjectDate();
    
    
    
}
