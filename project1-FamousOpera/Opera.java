package Project1;

import java.util.Objects;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Opera.java
 * Description  A class representing the GUI used in a maintaining a operas 
 *              database obtained from a text file, Operas.txt with 6 fields:
 *              Composer, Name of famous composition, year first performed, 
 *              city where first performed, Sypnosis, link to YouTube. 
 * Project      Famous Operas Database
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         1/27/2021
 * History log  1/10/2021, 1/20/2021
 *
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	%1% %5%
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Opera 
{
    //instance variables
    private String composer;
    private String name;
    private int year;
    private String city;
    private String sypnosis;
    private String link;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     Opera()-default constructor
     * Description     Create an instance of the Opera class and assign default
     *                 values to all fields
     * @author         <i>Nguyen Vi Cao</i>
     * Date            1/27/2021
     * History log     1/10/2021, 1/20/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Opera()
    {
        composer = "";
        name = "";
        year = 0;
        city = "";
        sypnosis = "";
        link = "";
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Opera ()-overloaded constructor
     * Description  Create an instance of the opera class and assign values via 
     *              parameters to all fields
     * @param       composer String
     * @param       name String
     * @param       year int
     * @param       city String
     * @param       sypnosis String
     * @param       link String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public Opera (String composer, String name, int year, String sypnosis,
            String city, String link)
    {
        this.composer = composer;
        this.name = name;
        this.year = year;
        this.city = city;
        this.sypnosis = sypnosis;
        this.link = link;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Opera ()-overloaded copy constructor
     * Description  Create an instance of the opera class and assign values via
     *              parameters from another opera to all fields.
     * @param       anotherOpera Opera
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public Opera(Opera anotherOpera)
    {
        this.composer = anotherOpera.composer;
        this.name = anotherOpera.name;
        this.year = anotherOpera.year;
        this.city = anotherOpera.city;
        this.sypnosis = anotherOpera.sypnosis;
        this.link = anotherOpera.link;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getComposer()
     * Description  Get method to set instance variable composer.
     * @return      composer String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public String getComposer() {
        return composer;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setComposer()
     * Description  set method to set instance variable composer.
     * @param       composer String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setComposer(String composer) {
        this.composer = composer;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getName()
     * Description  get method to return instance variable name.
     * @return      name String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public String getName() {
        return name;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setName()
     * Description  get method to return instance variable name.
     * @param       name String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setName(String name) {
        this.name = name;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getYear()
     * Description  get method to return instance variable year.
     * @return      year
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public int getYear() {
        return year;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setYear()
     * Description  set method to set instance variable year.
     * @param       year int
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setYear(int year) {
        this.year = year;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getCity()
     * Description  get method to return instance variable city.
     * @return      city String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public String getCity() {
        return city;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setCity()
     * Description  set method to set instance variable city.
     * @param       city String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setCity(String city) {
        this.city = city;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getSypnosis()
     * Description  get method to return instance variable sypnosis.
     * @return      sypnosis String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public String getSypnosis() {
        return sypnosis;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setSypnosis()
     * Description  set method to set instance variable sypnosis.
     * @param       sypnosis String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setSypnosis(String sypnosis) {
        this.sypnosis = sypnosis;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getLink()
     * Description  get method to return instance variable link.
     * @return      link String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public String getLink() {
        return link;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setLink()
     * Description  set method to set instance variable link.
     * @param       link String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void setLink(String link) {
        this.link = link;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  overriden toString() method to display a Opera object
     * @return      Opera object String
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString()
    {
        return "\nName of famous composition: " + name + "Composer: " + composer
                + "\nYear first performed: " + year + 
                "\nCity where first performed: " + city +
                "\nSypnosis: " + sypnosis + "\nLink to YouTube: " + link;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       equals()
     * Description  own method to check if one Opera object equals to another
     * @return      true or false boolean
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals (Object obj)
    {
        Opera opera = new Opera();
        if(obj instanceof Opera)
        {
            opera = (Opera) obj;
            if  (this.getName().equalsIgnoreCase(opera.getName()) && 
                (this.getComposer().equalsIgnoreCase(opera.getComposer()) && 
                (closeEnough(this.getYear(), opera.getYear())) &&
                (this.getCity().equalsIgnoreCase(opera.getCity()) && 
                (this.getSypnosis().equalsIgnoreCase(opera.getSypnosis()) && 
                (this.getLink().equalsIgnoreCase(opera.getLink()) ))))
                )
                return true;
            else
                return false;
        }
        else
            return false;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>>
     * Method       closeEnough()
     * Description  method to check if two floating numbers are within EPISON of 
     *              each other. Used of comparison of floating point values
     * @parem       x int
     * @parem       y int
     * @return      true or false boolean
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private boolean closeEnough(int x, int y)
    {
        final double EPSILON = 1E-9;
        return Math.abs(x - y) < EPSILON;
    }
}
