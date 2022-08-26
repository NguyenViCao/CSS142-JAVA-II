
package Project3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Validation
 * File         Validation.java
 * Description  Provide a number of boolean methods for validating different
 *              types using regular expressions.
 * Environment  PC, Windows 10, jkd 1.8.0, NetBeans 7.3.1
 * Date         1/27/2021
 * History log  1/10/2021, 1/20/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	1.0.0
 * @see         java.util.regex.Pattern
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Validation 
{
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isInteger()
 * Description  Validate that integer value is entered
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @return      boolean
 * @param       fieldValue: String, input
 * @see         java.util.regex.Pattern
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isInteger(String fieldValue)
    {
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher(fieldValue);
        return mat.matches();
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isInteger()
 * Description  overloaded, validates that integer value is entered within the
 *              required range
 * @param       fieldValue String, input
 * @param       lower int, lower bound
 * @param       upper int, upper bound
 * @return      boolean
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @see         java.util.regex.Pattern
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isInteger (String fieldValue, int lower, int upper)
    {
        boolean result = true;
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher(fieldValue);
        if (mat.matches())
        {
            try
            {
                //check range
                int num = Integer.parseInt(fieldValue);
                if (num < lower || num >upper)
                    result = false;
            }
            catch (NumberFormatException ex)
            {
                //something went wrong
                result = false;
            }
        }
        else
        {
            result = false;
        }
        return result;
        //return mat.matches();
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isDouble()
 * Description  Validate that double value is entered
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @param       fieldValue String
 * @return      boolean
 * @see         java.util.regex.Pattern
 * @see         java.util.regex.Matcher
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isDouble(String fieldValue)
    {
        Pattern pat = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher mat = pat.matcher(fieldValue);
        return mat.matches();
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isDouble()
 * Description  overloaded, validates that double value is entered within the
 *              required range
 * @param       fieldValue String, input
 * @param       lower double, lower bound
 * @param       upper double, upper bound
 * @return      boolean
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @see         java.util.regex.Pattern
 * @see         java.util.regex.Matcher
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isDouble (String fieldValue, double lower, double upper)
    {
        boolean result = true;
        Pattern pat = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher mat = pat.matcher(fieldValue);
        if (mat.matches())
        {
            try
            {
                //check range
                double num = Double.parseDouble(fieldValue);
                if (num < lower || num >upper)
                    result = false;
            }
            catch (NumberFormatException ex)
            {
                //something went wrong
                result = false;
            }
        }
        else
        {
            result = false;
        }
        return result;
        //return mat.matches();
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isEmpty()
 * Description  validates that JTextField is not empty
 * @return      boolean
 * @param       fieldValue String, input
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @see         java.util.regex.Pattern
 * @see         javax.swing.JTextField
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isEmpty(JTextField fieldValue)
    {
        String input = fieldValue.getText();
        if (input == null || input.length() <= 0 || input.equals(""))
            return true;
        else
            return false;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Method       isValidName()
 * Description  validates that JTextField is a valid player name
 * @return      boolean
 * @param       input: JTextField, input
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @see         java.util.regex.Pattern
 * @see         javax.swing.JTextField
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static boolean isValidName(String input)
    {
        final short MAX_LENGTH = 30;
        final short MIN_LENGTH = 2;
        boolean result = true;
        //String pattern = "^[a-zA-Z\\s\\.]*$";
        //Pattern pat = Pattern.compile("\\^[a-z A-Z '.-]{3,30}$/"); //Pattern.compile("[a-zA-Z]+");
        Pattern pat = Pattern.compile("^[a-zA-Z\\s\\.\\-\\'\\s]{2,30}$");
        Matcher mat = pat.matcher(input);
        if (!mat.matches() || input.length() > MAX_LENGTH || input.length() < MIN_LENGTH)
            result = false;
        return result;
    }
}
