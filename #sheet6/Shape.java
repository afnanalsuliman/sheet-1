public class Shape{
private String name;
private double area;
private double perimeter ;
public static int numOfCircle ;
public static int  numOfRectangle ;
public Shape (String n){
name=n;}
public Shape(String n , double length , double width){
name=n;
 calculateArea(length, width );
 calculatePerimeter ( length, width );
 numOfRectangle++ ;
}
public Shape(String n, double radius){
name=n;
calculateArea( radius);
calculatePerimeter ( radius );
 numOfCircle++ ;
}
public void setName(String n){
name=n;}
public void  calculateArea(double length, double width ){
area=length*width;
}
public void  calculateArea(double radius){
area=Math.PI*Math.pow(radius,2);
}
public void calculatePerimeter (double length, double width ){
perimeter=2*(length+width);
}
public void  calculatePerimeter (double radius ){
perimeter=2*Math.PI* radius;
}
public String getName(){
return name;}
public double getArea(){
return area;}
public double getpimeter(){
return perimeter;}
public boolean equals(Shape shape){
if(this. area==shape.area&&perimeter==shape.perimeter)
return true;

return false;
}
public static int  getTotalNumerOfShapes(){
return  numOfRectangle+numOfCircle;


}
}


