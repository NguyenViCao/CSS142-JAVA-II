
package Project2;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Circle
 * Description  Derived class from the abstract class GeometricObject that 
 *              represents a circle with a radius and compute the area
 * Project      Project2
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         2/18/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	1.2.1
 * @see         GeometricObject
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Circle extends GeometricObject
{
    //-------------------------------------------------------------------------
    //private data members represent radius r
    //-------------------------------------------------------------------------
    private double r;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Circle
     * Description  Default constructor for the Circle class
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle()
    {
        this(0);
        setParameters();
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Triangle
     * Description  Overloaded constructor for the triangle class
     * @param       r double
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Circle(double r)
    {
        this.r = r;
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
     * Description  Computes area of the circle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getArea()
    {
        return Math.PI * r * r;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getArea()
     * Description  Overloaded and alternate method to computes area of the 
     *              circle 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * @param       r double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this circle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      double perimeter of this circle
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter()
    {
        return (2 * Math.PI * r);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this circle
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       r double
     * @return      double perimeter of this circle
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter(double r)
    {
        return (Math.PI * r) * 2;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getR()
     * Description  Return r radius value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      r double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getR()
    {
        return r;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setR()
     * Description  Assign r radius value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       newRadius double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setR(double newRadius)
    {
        this.r = (newRadius >= 0) ? newRadius : 0;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  return radius values 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      radius String
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString()
    {
        return "Circle r = " + r;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       equals()
     * Description  Compares two triangle objects
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/26/2021
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
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.r) != Double.doubleToLongBits(other.r)) 
        {
            return false;
        }
        return true;
    }
}
