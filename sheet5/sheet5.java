import java.util.*;

 class Student{

private int ID;
private String Neme;
private double stipend ;
private String university;
private double GPA;
 
public void setlnfo(int ID, String name, String uni, double gab){
this.ID=ID;
Neme=name;
if(gab>=4)
 stipend= 1000;
 else 
  stipend= 900;
university=uni;
 GPA=gab;
}
public void printinfo(){
System.out.println("ID : " + ID + " , Name : " + Neme +"Stipend : " + stipend + " , University : " +university+"GPA : " + GPA);
}
public String getuni(){
return university ;
}
public void changeGPA(double newGPA){
GPA=newGPA;
if(GPA>=4)
 stipend= 1000;
 else 
  stipend= 900;

}
public boolean checkSameGPA(Student b){
if(GPA==b.GPA)
return true ;

return false ;
}
}
public class sheet5{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      Student obj1=new Student();
       obj1.setlnfo(4339999," Maha mohammed", "KSU", 4.5);

      Student obj2=new Student();
      obj2.setlnfo(4338888," Dema saad"," PSU", 3.9);
      if(obj1.getuni().equalsIgnoreCase(obj2.getuni()))
         System.out.println("Both students study at the same university");
      else
         System.out.println("The two students do not study at the same university");
      System.out.println("Enter new GPA for second student : ");
      double newgpa=read.nextDouble();
      obj2.changeGPA(newgpa);
      if (obj1.checkSameGPA(obj2))
         System.out.println("Both students have the same grade");
      else
         System.out.println("The two students do not have the same grade");
      System.out.println("-------------");
      System.out.println("obj1 : ");
      obj1. printinfo();
      System.out.println("-------------");
      System.out.println("obj2");
      obj2. printinfo();
   
   }
}   
