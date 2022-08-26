
package Project2;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Rectangle
 * Description  Derived class from the abstract class GeometricObject that 
 *              represents a rectangle with width and height to compute the 
 *              perimeter and area
 * Project      Project2
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         2/18/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	1.2.1
 * @see         GeometricObject
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Rectangle extends GeometricObject
{
    private double width, height;
    //private Points[] points:
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Rectangle
     * Description  Default constructor for the Rectangle class
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Rectangle()
    {
        this(0, 0);
        setParameters();
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Rectangle
     * Description  Overloaded constructor for the Rectangle class
     * @param       width double
     * @param       height double
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
        setParameters();
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setParameters()
     * Description  A method to set filled and color property
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      valid boolean
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setParameters()
    {
        filled = rand.nextBoolean();
        this.setFilled(filled);
        this.setColor(colors[rand.nextInt(SIZE)]);
    }
        
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getArea()
     * Description  Computes area of the Rectangle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getArea()
    {
        return width * height;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getArea()
     * Description  Overloaded and alternate method to computes area of the 
     *              Rectangle 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * @param       width double
     * @param       height double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea(double width, double height)
    {
        return height * width;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this rectangle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      double perimeter of this rectangle
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this triangle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       width double
     * @param       height double
     * @return      double perimeter of this triangle
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter(double width, double height)
    {
        return (width + height) + (width + height);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getWidth()
     * Description  Return width value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      width double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getWidth()
    {
        return width;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setWidth()
     * Description  Assign width value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       width double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getHeight()
     * Description  Return height value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      height double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getHeight()
    {
        return height;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setHeight()
     * Description  Assign height value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       height double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setHeight(double height)
    {
        this.height = height;
    }
        

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  return width and height values
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      values String
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString()
    {
        return "Rectangle{width = " + width + ", height = " + height + "}";
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       equals()
     * Description  Compares two rectangle objects
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       obj Object
     * @return      true or false boolean
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) 
        {
            return false;
        }
        return true;
    }
}
