import java.util.Scanner;
public class sheet2Q2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      System.out.println("enter passenger fullname:");
      String name=read.nextLine();
      System.out.println("Enter passenger flight number: ");
      String flight = read.nextLine();
      System.out.println("Enter passenger seating: ");
      String pass= read.next();
      System.out.println("Enter departure time: ");
      int time = read.nextInt();
      String line= pass.substring(0,1);
      String num=pass.substring(1);
      String t=(time-1)+":30";
      System.out.printf("%20s %-30s%20s%-30s%n","passenger name:",name,"flight#:",flight);
      System.out.printf("%20s %-30s %20s %-30s%n","seating line:",num,"seating#:",pass);
      System.out.printf("%20s %-30s %n","boarding time:",t);
   }}