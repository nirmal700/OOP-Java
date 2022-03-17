package org.shapes;
class Square  {
    double area,perimeter;
    public void Area(int s)
    {
        area=s*s;
    }
    public void Perimeter(int s)
    {
        perimeter = 4*s;
    }
}

class Triangle
{
    double area,perimeter;
    public void Area(int dim1,int dim2, int dim3)
    {
        double s  = (dim1+dim2+dim3)/3;
        area=Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3))
    }
    public void Perimeter(int dim1,int dim2, int dim3)
    {
        
        perimeter = dim1+dim2+dim3;
    }
}
class Circle
{
    double area,perimeter;
    public void Area(int r)
    {
        area=3.14*r*r;
    }
    public void Perimeter(int r)
    {
        perimeter = 2*3.14*r;
    }
}