import java.util.Scanner;
public class sheet4q2{

   public static void main(String[]args){
      Scanner read=new Scanner(System .in);
      System.out.println("-- Welcome to your active time calculator --");
      System.out.println("how many weeks you have been exercising : ");
      int week=read.nextInt();
      double hou=0,hours=0,ave;
      for(int i=1;i<=week;i++){
         System.out.println("week:"+i);
         System.out.println("have you been active this week at all ? (yes - no)  ");
         String ansr = read.next(); 
         if( ansr.equalsIgnoreCase("yes")){
            System.out.println("how long you have been active in hours :  ");
            for(int g=1;g<=7;g++){
               System.out.println("day "+g+":");
               hou=read.nextInt();
               hours=hours+hou;
            }}}
      ave=(hours/((double)week*7));
      System.out.printf("-- your average is %.2f hour per day -- \n " , ave );
   
   }
}