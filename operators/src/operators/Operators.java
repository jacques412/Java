package operators;

public class Operators 
{

	public static void main(String[] args)
{
String symbol;
int number2=0;
int number3=0;
int total;

try 
{
	
number2 =  Integer.parseInt(args[1]);
number3 = Integer.parseInt(args[2]);
}
catch (NumberFormatException e)
{
	System.out.println ("String cannot be converted to an integer");	
}
if (args[0].equals("add".toLowerCase())) 
{ 
		System.out.println(total = number2 + number3);
}
		else if (args[0].equals("subtract".toLowerCase())) 
	{
		System.out.println(total = number2 - number3);
	}
		else 
	{
		System.out.println("Please enter either add or subtract");
	}
}
}


