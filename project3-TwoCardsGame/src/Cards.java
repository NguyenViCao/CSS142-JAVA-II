package Project3;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Cards
 * File         Cards.java
 * Description  A class representing ac action of shuffling a deck of cards
 * Project      Two Cards Simulation
 * Environment  PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
 * Date         3/9/2021
 * History Log  3/9/2021
 * @author      <i>Nguyen Vi Cao</i>
 * @version:    %1% %2%
 * </pre>
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Cards 
{
    //Sets cards to num (from small to large). For example the smallest ace is 
    //1 and the heart king is 52.
    // Class instance variables
    private int num = 0;// number shuffle on the card
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor  Cards()
    * Description  Default constructor. Sets first card to be 1
    * @author      <i>Nguyen Vi Cao</i>
    * @see         java.awt.Toolkit
    * Date         3/9/2021
    * History Log  3/9/2021
    *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Cards()
    {
        num = 1;
    }    
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Cards()
     * Description  Overloded constructor. Sets cards to num (from small to 
     *              large). For example the smallest ace is 1 and the heart king 
     *              is 52.
     * @param       num int
     * @author      <i>Nguyen Vi Cao</i>
     * @see         java.awt.Toolkit
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Cards(int num)
    {
        this.num = num;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       shuffle()
     * Description  method to shuffles the deck--returns the number shuffled.
     * @author      <i>Nguyen Vi Cao</i>
     * @see         java.awt.Toolkit
     * @return      num int 1-6
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static int shuffle()
    {
        return (int)(52 * Math.random() + 1);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getCard()
     * Description  Getter method to return the number on the card.
     * @author      <i>Nguyen Vi Cao</i>
     * @see         java.awt.Toolkit
     * @return      num int 1-52
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getCard()
    {
        return num;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setCard()
     * Description  Setter method to set the number of the card with num.
     * @author      <i>Nguyen Vi Cao</i>
     * @see         java.awt.Toolkit
     * @param       num public void setSide(int num)
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setCard(int num)
    {
        this.num = num;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  Method to display card.
     * @author      <i>Nguyen Vi Cao</i>
     * @see         java.awt.Toolkit
     * Date         3/9/2021
     * History Log  3/9/2021
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString()
    {
        return "Your Card{" + "num=" + num + '}';
    }
}
