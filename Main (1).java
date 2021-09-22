import java.util.Scanner; 
import java.lang.*;

class Main{
public static void main(String[] args) {

// ask the user what is there starting temperature
Scanner Temp = new Scanner(System.in);
System.out.println("what temperature are you starting with? Type C for Celsius and F for Fahrenheit");

String CorF = Temp.nextLine();


// ask the user how many degrees
Scanner number = new Scanner(System.in);
System.out.println("how many degrees?");

Double degrees = number.nextDouble();


// convert from celsius to fahrenheit
if(CorF.equals("C") || CorF.equals("c"))
{
	System.out.println( degrees * (9/5) + 32);
	System.out.println( "degrees Fahrenheit");
}

// convert from fahrenheit to celsius
if(CorF.equals("F") || CorF.equals("f"))
{
	System.out.println( (degrees + 32) * (9/5) );
	System.out.println( "degrees Celsius");
}

}
}

