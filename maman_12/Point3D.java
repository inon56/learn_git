/**
 * This class represents a three-dimensional point the
 * x,y and z coordinate values can get either negative, positive or zero double values.<br>
 * Version: <br>
 *        06.04.2019 <br>
 *Author: <br>
 *        Inon Levi <br>
 * ID: <br>
 *  205730948
 */


public class Point3D
{
    private double _x,_y,_z;
    
    /**
     * Constructs and initializes a Point3D to (0,0,0).
     */
    public Point3D()
    {
        _x=_y=_z=0;
    } //End of empty constructor
    
    /**
     * Constructs and initializes a Point3D from the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Point3D(double x ,double y ,double z)
    {
        _x=x;
        _y=y;
        _z=z;
    } // end of full constructor
    
    /**
     * Constructs and initializes a Point3D from the specified Point3D.
     * @param point the Point3D which the new instance initialization will be based on 
     */
    public Point3D(Point3D point)
    {
        _x = point._x;
        _y = point._y;
        _z = point._z;
    } // end of copy constructor
    
    /**
     * Returns a string representation of this Point3D.
     * @return a string representation of this Point3D.
     */
    public String toString()
    {
        return ("("+_x+","+_y+","+_z+")");
    } // end of toString
    
    /**
     * returns the x coordinate
     * @return the value of the x coordinate
     */
    public double getX()
    {
        return _x;
    } //end of getX
    
    /**
     * returns the y coordinate
     * @return the value of the y coordinate
     */
    public double getY()
    {
        return _y;
    } //end of getY
    
    /**
     * returns the z coordinate
     * @return the value of the z coordinate
     */
    public double getZ()
    {
        return _z;
    } //end of getZ
    
    /**
     * sets the x coordinate to the given x
     * @param num x value to set
     */
    public void setX(double num)
    {
        _x=num;
    } //end of setX
    
    /**
     * sets the y coordinate to the given y
     * @param num y value to set
     */
    public void setY(double num)
    {
        _y=num;
    } //end of setY
    
    /**
     * sets the z coordinate to the given z
     * @param num z value to set
     */
    public void setZ(double num)
    {
        _z=num;
    } //end of setZ
    
    /**
     * Determines whether or not two points are equal.
     * @param other a Point3D object to be compared with this Point3D   
     * @return true if equals false if not.
     */
    public boolean equals(Point3D other)
    {
    return (other.getX()==_x&&other.getY()==_y&&other.getZ()==_z);
        
/*        if(other.getX()==_x&&other.getY()==_y&&other.getZ()==_z)
        return true;
        return false; */ 

    } // end of equals
    
    /**
     * Checks if this point is above the other point.
     * @param other The point to check whether this point is above it
     * @return true if this point is above the other point, false otherwise
     */
    public boolean isAbove(Point3D other)
    {
        return _z>other.getZ();
    } // end of isAbove
    
    /**
     * Checks if this point is under the other point.
     * @param other The point to check whether this point is under i
     * @return true if this point is under the other point, false otherwise
     */
    public boolean isUnder(Point3D other)
    {
//        return !isAbove(other)&&!equals(other);
        return other.isAbove(this);
    } //end of isUnder
    
    /**
     * Checks if this point is to the left of the other point.
     * @param other The point to check whether this point is left of it
     * @return true if this point is to the left of the other point, false otherwise
     */
    public boolean isLeft(Point3D other)
    {
        return _y<other.getY();
    } // end of isLeft
     
    /**
     * Checks if this point is to the right of the other point.
     * @param other The point to check whether this point is right of it
     * @return true if this point is to the right of the other point, false otherwise
     */
    public boolean isRight(Point3D other)
    {
//        return !isLeft(other)&&!equals(other);
        return other.isLeft(this);
    } // end of isRight
    
    /**
     * Checks if this point is behind the other point.
     * @param other The point to check whether this point behind it
     * @return true if this point is behind the other point, false otherwise
     */
    public boolean isBehind (Point3D other) 
    {
        return _x<other.getX();
    } // end of isBehind
    
    /**
     * Checks if this point is in front of the other point.
     * @param other The point to check if this point is in front of it
     * @return true if this point is in front of the other point, false otherwise
     */
     public boolean isInFrontOf (Point3D other)
    {
//        return !isBehind(other)&&!equals(other);
        return other.isBehind(this);
    } // end of isRight
     
     /**
      * Moves the Point3D in location (x,y,z),
      * by dx along the x axis, by dy along the y axis and dz along the z axis
      * so that it now represents the Point3D in the following
      * 3D coordintes (x+dx,y+dy,z+dz).
      * @param dx  the addtion for coordinate x value
      * @param dy  the addtion for coordinate y value
      * @param dz  the addtion for coordinate z value
      */
    public void move(double dx, double dy, double dz)
        {
            _x += dx;
            _y += dy;
            _z += dz;
        } // end of move
    
    /**
     * Returns the distance between this point and other point p.
     * @param p the other point
     * @return the distance between the 2 points.
     * 
     */
    public double distance(Point3D p)
    {
        double xDiff=p.getX()-_x, yDiff=p.getY()-_y, zDiff=p.getZ()-_z;
        return Math.sqrt(Math.pow(xDiff,2)+ Math.pow(yDiff,2)+Math.pow(zDiff,2));

    } // end of distance
             
    
} //end of class Point3D 