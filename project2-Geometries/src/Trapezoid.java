
package Project2;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Trapezoid
 * Description  Derived class from the abstract class GeometricObject that 
 *              represents a Parallelogram with four sides, height plus methods 
 *              to compute Trapezoid's perimeter and area
 * Project      Project2
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         2/18/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	1.2.1
 * @see         GeometricObject
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Trapezoid extends GeometricObject
{
    //-------------------------------------------------------------------------
    //private data members represent points (x1,x2), (x2, y2), (x3, y3)
    //-------------------------------------------------------------------------
    private double x, y, c, d, h;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Trapezoid
     * Description  Default constructor for the Trapezoid class
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Trapezoid()
    {
        this(0, 0, 0, 0, 0);
        setParameters();
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Parallelogram
     * Description  Overloaded constructor for the Parallelogram class
     * @param       x double
     * @param       y double
     * @param       c double
     * @param       d double
     * @param       h double
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Trapezoid(double x, double y, double c, double d, double h)
    {
        this.x = x;
        this.y = y;
        this.c = c;
        this.d = d;
        this.h = h;
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
     * Description  Computes area of the Trapezoid
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getArea()
    {
        return (x + y) * h / 2;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getArea()
     * Description  Overloaded and alternate method to computes area of the 
     *              trapezoid 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * @param       x double
     * @param       y double
     * @param       h double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea(double x, double y, double h)
    {
        return (x + y) * h / 2;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this trapezoid
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      double perimeter of this trapezoid
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter()
    {
        return x + y + c + d;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this trapezoid
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       x double
     * @param       y double
     * @param       c double
     * @param       d double
     * @return      double perimeter of this parallelogram
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter(double x, double y, double c, double d)
    {
        return x + y + c + d;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getX()
     * Description  Return x side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      x double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getX()
    {
        return x;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setX()
     * Description  Assign x side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       x double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getY()
     * Description  Return y side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      y double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getY()
    {
        return y;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setY()
     * Description  Assign y side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       y double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getC()
     * Description  Return c side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      c double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getC()
    {
        return c;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setC()
     * Description  Assign c side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       c double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setC(double c)
    {
        this.c = c;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getD()
     * Description  Return d side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      d double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getD()
    {
        return c;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setD()
     * Description  Assign d side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       d double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setD(double d)
    {
        this.d = d;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getH()
     * Description  Return h side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      h double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getH()
    {
        return h;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setH()
     * Description  Assign h side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       h double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setH(double h)
    {
        this.h = h;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  return all 6 coordinate values of the three points
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      points String
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString()
    {
        return "Parallelogram with four sides: x = " + x + ", y = " + y + ", c = "
                + c + ", d = " + " with height h = " + h;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       equals()
     * Description  Compares two trapezoid objects
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
        final Trapezoid other = (Trapezoid) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(other.c)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(other.d)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.h) != Double.doubleToLongBits(other.h)) 
        {
            return false;
        }
        return true;
    }
}
