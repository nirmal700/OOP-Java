package org.shapes;

import java.lang.Math;

public class Triangle
{
private double s1, s2, s3;
public Triangle(double x , double y , double z) {
s1 = x;
s2 = y;
s3 = z;
}
public double perimeter()
{
return s1 + s2 + s3;

}
public double area()
{
double s;
s = perimeter()/2.0;
return Math.sqrt(s*((s-s1)+(s-s2)+(s-s3)));
}
}