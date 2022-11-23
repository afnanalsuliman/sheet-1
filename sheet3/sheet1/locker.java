
public class locker{
public static void main(String[]args){
final double VAT=0.15;
String name="reem saad";
int ID=4413243;
char location='G';
int quarter=3;
System.out.println("student is name:"+name);
System.out.println("student is ID:"+ID);
System.out.println("locker location:"+location);
System.out.println("number of quarters:"+quarter);
double price= 24.5;
System.out.println("rental price:"+price);
double total=(price*quarter)+((price*quarter)*VAT);
System.out.println("the total price is "+total+"SAR"); 
System.out.println("-----------------------------------------------------------------------------------------------------------");
System.out.println("the reservation isconfirmed andthe total priceis:"+ total+"SAR");

}
}