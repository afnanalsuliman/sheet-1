import java.util.Scanner;
public class sheet2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      System.out.println("Enter Student Full name and KSU email in the following:firstName lastName_KSUemail");
      String nameEmail=read.nextLine();
      int n=nameEmail.indexOf(" ");
      String name=nameEmail.substring(1,n);
      String m=nameEmail.substring(0,1).toUpperCase();
      int i=nameEmail.indexOf("_");
      int q=nameEmail.indexOf("@");
      String ID=nameEmail.substring(i+1,q);
      String h=ID.substring(0,2);
      int y=Integer.parseInt(h);
      int year=y+1400;
      System.out.println("first name is "+m+name);
      System .out.println("student ID is "+ID);
      System.out.println("the enrollment year in higri is "+year);
   
   
   
   
   }}