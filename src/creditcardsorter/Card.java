/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardsorter;
import java.util.Date;

/**
 *
 * @author neilquinlan
 */
public interface Card {
    
    void setNumber(String cardNumber);
    
    void setIssuingBank(String cardNumber);
    
    void setDate(String cardDate);
    
    String getEncryptedCardNumber();
    
    String getIssuingBank();
    
    String getStringDate();
    
    Date getObjectDate();
    
    
    
}
