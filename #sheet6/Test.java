import java.util.*;
public class Test{
public static void main(String[]args){
Scanner read=new Scanner(System.in);
double l=0,w=0 ,r=0;
String n="" ;
char ch=' ', ans=' ';
Shape sh;
do{
System.out.println("Enter R for rectangle and C for circle");
 ch=read.next().charAt(0);
switch (ch){
case 'R':
n="rectangle";
System.out.println("Entre the length and width of the rectangle");
 l=read.nextDouble();
 w=read.nextDouble();
 sh=new Shape( n , l ,  w);
System.out.println("area="+ sh.getArea()+" perimeter ="+sh.getpimeter());
 CheckShape ( sh); 
break;
case 'C':
n=" circle";
System.out.println("Entre the radius of the circle");
r=read.nextDouble();
sh=new Shape(n,r);
System.out.println("area="+ sh.getArea()+" perimeter ="+sh.getpimeter());
 CheckShape ( sh );
break;
default:
System.out.println("wrong choice");
}
System.out.println("Do you want to create other shape Y/N");
ans=read.next().charAt(0);
}while(ans=='Y');
System.out.println("Total number of created shapes is"+ Shape.getTotalNumerOfShapes());
}
public static void CheckShape (Shape sh ){
System.out.printf("area=%.2f perimeter =%.2f%n", sh.getArea(),sh.getpimeter());
System.out.println("The number Of Rectangle is "+ Shape.numOfRectangle+" and number Of Circle is"+Shape.numOfCircle );

if(sh.getArea()>100)
System.out.println("Big Shape Size");
else
System.out.println("Small Shape Size");
}
}