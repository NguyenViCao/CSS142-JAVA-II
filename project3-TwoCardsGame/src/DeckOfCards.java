
package Project3;

import java.util.ArrayList;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        DeckOfCards
 * File         DeckOfCards.java
 * Description  A class to simulate two decks of cads
 * Project      Two Cards Simulation
 * Environment  PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
 * Date         3/9/2021
 * History Log  3/9/2021
 * @author      <i>Nguyen Vi Cao</i>
 * @version:    %1% %2%
 * </pre>
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class DeckOfCards {
    //instances variables
    final int FULL_DECK_SIZE = 52;
    private ArrayList<Integer> cardDeck = new ArrayList<>();
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     default constructor
     * Description     Creates a new deck of cards.
     * @author         <i>Nguyen Vi Cao</i>
     * Date            3/9/2021
     * History log     3/9/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public DeckOfCards()
    {
        //create an arrayList of Cards
        for (int i = 1; i <= FULL_DECK_SIZE; i++)
        {
            cardDeck.add(i);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getRandomCard()
     * Description  returns a random card index and removes the index from the 
     *              cardDeck ArrayList so it won't be used again 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getRandomCard()
    {
        int randomIndex = (int)(Math.random() * cardDeck.size());
        int card = cardDeck.get(randomIndex);
        cardDeck.remove(randomIndex);
        return card;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getRandomSuitCard()
     * Description  returns a card index that is a random suit of a given card
     *              value and removes the index from the cardDeck ArrayList so
     *              it won't be used again
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History Log  3/9/2021
     * @return      int--card index
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getRandomSuitCard (int cardValue)
    {
        int randomSuit, cardIndex;
        do
        {
            randomSuit = (int)(Math.random() * 4) * 13;
            cardIndex = cardValue + randomSuit;
        }
        while (!cardIsInDeck(cardIndex));
                
        cardDeck.remove((Integer)cardIndex);
        return cardIndex;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       putCardInDeck()
     * Description  puts the given card back into the deck
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void putCardInDeck(int cardIndex)
    {
        cardDeck.add(cardIndex);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       cardIsInDeck()
     * Description  returns true if the card is in the deck
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History Log  3/9/2021
     * @param       cardIndex--int
     * @return      boolean--true or false for in card deck
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean cardIsInDeck (int cardIndex)
    {
        return cardDeck.contains(cardIndex);
    }
}
