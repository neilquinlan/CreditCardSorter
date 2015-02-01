
package creditcardsorter;

import java.util.Comparator;

/**
 * This overrides the compare method in Comparator to compare the dates of 
 * two different cards, and returning in descending order.
 * @author neilquinlan
 */
   
class dateCompare implements Comparator<Card> 

{
//@Override
    public int compare(Card cardA, Card cardB)
    {
       return cardB.getObjectDate().compareTo(cardA.getObjectDate());
    }
}
    

