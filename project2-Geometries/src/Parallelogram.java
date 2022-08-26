
package Project2;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Parallelogram
 * Description  Derived class from the abstract class GeometricObject that 
 *              represents a Parallelogram with two sides, plus methods to compute
 *              Parallelogram's perimeter
 * Project      Project2
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         2/18/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	1.2.1
 * @see         GeometricObject
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Parallelogram extends GeometricObject
{
    //-------------------------------------------------------------------------
    //private data members represent points (x1,x2), (x2, y2), (x3, y3)
    //-------------------------------------------------------------------------
    private double a, b, angle;
    //private Points[] points:
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Parallelogram
     * Description  Default constructor for the Parallelogram class
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Parallelogram()
    {
        this(0, 0, 0);
        setParameters();
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Parallelogram
     * Description  Overloaded constructor for the Parallelogram class
     * @param       a double
     * @param       b double
     * @param       angle double
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Parallelogram(double a, double b, double angle)
    {
        this.a = a;
        this.b = b;
        this.angle = angle;
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
        return a * b * Math.sin(angle);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getArea()
     * Description  Overloaded and alternate method to computes area of the 
     *              Rectangle 
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      area double
     * @param       a double
     * @param       b double
     * @param       angle double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea(double a, double b, double angle)
    {
        return a * b * Math.sin(angle);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this parallelogram
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      double perimeter of this parallelogram
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public double getPerimeter()
    {
        return a + a + b + b;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getPerimeter()
     * Description  Computes the perimeter of this parallelogram
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       a double
     * @param       b double
     * @return      double perimeter of this parallelogram
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPerimeter(double a, double b)
    {
        return (2*a + 2*b);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getA()
     * Description  Return a side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      a double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getA()
    {
        return a;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setA()
     * Description  Assign a side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       a double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setX1(double a)
    {
        this.a = a;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getB()
     * Description  Return b side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      b double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getB()
    {
        return b;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setB()
     * Description  Assign b side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       b double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setB(double b)
    {
        this.b = b;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getAngle()
     * Description  Return angle value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @return      b double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getAngle()
    {
        return angle;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setAngle()
     * Description  Assign b side value
     * @author      <i>Nguyen Vi Cao</i>
     * Date         2/18/2021
     * @param       angle double
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setAngle(double angle)
    {
        this.angle = angle;
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
        return "Parallelogram with two sides: a = " + a + ", b = " + b 
                + " and the angle between that two sides: angle = " + angle;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       equals()
     * Description  Compares two triangle objects
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
        final Parallelogram other = (Parallelogram) obj;
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(other.b)) 
        {
            return false;
        }
        if (Double.doubleToLongBits(this.angle) != Double.doubleToLongBits(other.angle)) 
        {
            return false;
        }
        return true;
    }
}
