package Project2;
import java.util.Random;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
 * Class        GeometricObject
 * File         GeometricObject.java
 * Description  Abstract class that provides base class for the Triangle class
 * @author      <i>Nguyen Vi Cao</i>
 * Environment  PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
 * Date         2/12/2020
 * @version     1.2.0
 * @see         javax.swing.JFrame
 * @see         java.awt.Toolkit
 * @see         javax.swing.JOptionPane
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public abstract class GeometricObject 
{
    //class instance variable--differ from text in order to set random colors
    protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;
    protected Random rand = new Random();
    protected final int SIZE = 10;
    protected String[] colors = new String[SIZE];
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   GeometricObject
    * Description   Default constructor for the GeometricObject class. Calls
    *               Date() and setColors() to set current date and color
    * @author       <i>Nguyen Vi Cao</i>
    * Date          2/12/2020
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    protected GeometricObject() 
    {
        dateCreated = new java.util.Date();
        this.setColors();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) 
    {
        dateCreated = new java.util.Date();
        this.setColors();
        this.color = color;
        this.filled = filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
    
    /** Return color */
    public String getColor() 
    {
      return color;
    }

    /** Set a new color */
    public void setColor(String color) 
    {
      this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() 
    {
      return filled;
    }

     /** Set a new filled */
    public void setFilled() 
    {
      filled = rand.nextBoolean() ? true: false;
    }
    /** Set a new filled */
    public void setFilled(boolean filled) 
    {
      this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() 
    {
      return dateCreated;
    }

    @Override
    public String toString() 
    {
      return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *	Method		setColors()
    *	Description     Private method to set random colors
    *   @author         <i>Nguyen Vi Cao</i>
    *	Date            2/12/2020
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    protected void setColors()
    {
        colors[0] = "blue";
        colors[1] = "cyan";
        colors[2] = "gray";
        colors[3] = "cyan";
        colors[4] = "magenta";
        colors[5] = "orange";
        colors[6] = "yellow";
        colors[7] = "cyan";
        colors[8] = "red";
        colors[9] = "pink";
    }
}