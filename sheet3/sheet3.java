import java .util.Scanner;
public class sheet3{
   public static void main(String[]args){
      Scanner read= new Scanner(System.in);
      System.out.print("Enter loyalty level (S for Silver) or (G for Gold):");
      char level=read.next().charAt(0);
      System.out.print("Enter the number of beans bags: ");
      int bags=read.nextInt();
      double dis,totalp,totala;//totalp=before/totala=after
      dis=0;
      totala=0;
      totalp=5*bags;
      if (level!='s'&&level!='S'&&level!='g'&&level!='G')
      {System.out.println("invalid input of loyalty level!");
      bags=0;}
      else
         if (level=='s'||level=='S') //else{
         {
            if (bags>=15)//1
            { dis=totalp*0.15;
               totala=totalp-dis;}
            else
            { 
               if (bags>10)
               {dis=totalp*0.1;
                  totala=totalp-dis;}
               else
               {dis=0;
                  totala=totalp;}}
         }//1
         else 
         {
            if(bags<10)//2
            {dis=totalp*0.05;
               totala=totalp-dis;}
            else
            {dis=totalp*0.2;
               totala=totalp-dis;}}//2
   //else
      System.out.printf("Number of ordered beans:%-6d%n",bags);
      System.out.printf("Discount value:-%-6.2fSR%n",dis);
      System.out.printf("Your total charge:%-6.2fSR%n",totala);
   
   
   
   }}