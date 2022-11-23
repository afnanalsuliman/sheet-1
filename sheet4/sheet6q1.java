import java.util.Scanner;
public class sheet6q1{
   public static void main(String[]args){
      Scanner read=new Scanner(System .in);
      System.out.println("Let's play");
      System.out.println("enter number  of rounds:");
      int rou=read.nextInt();//rou=rounds
      int dic1=0,dic2=0,sar2=0,nor2=0;
      boolean ex=false;
      for(int i=1;i<rou;i++){
         System.out.println("enter sarah then nora numbrs(1-6) :");
         int sar=read.nextInt();
         int nor=read. nextInt();
         if(sar==6)
            dic1++;
         if(nor==6)
            dic2++;
         sar2=sar2+sar;
         nor2=nor2+nor;
         if(sar2!=nor2){
            System.out.println("exchange");
            ex=true;}
         while(ex){
            System.out.println("enter sarah then nora numbrs(1-6) :");
            sar=read.nextInt();
            nor=read. nextInt();
            if(sar==6)
               dic2++;
            if(nor==6)
               dic1++;
            sar2=sar2+sar;
            nor2=nor2+nor;
            if(sar2!=nor2){
               System.out.println("exchange");
               ex=false;}}
         i++;
      }
      if(dic1>dic2)
         System.out.println("dice1 is rigged");
      else if(dic1<dic2)
         System.out.println("dice2 is rigged");
      else
         System.out.println("no rigged");
   
   
   
   }}