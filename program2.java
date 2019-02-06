import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
  int num;
  Scanner input = new Scanner(System.in);
  num = input.nextInt();
if (num >0 )
{
		if ( num % 2 == 0 )
		{        
		System.out.println("Even");
		}    
		else
		{       
		System.out.println("Odd");
		}
}		
else
{
System.out.println("Invalid");
}
}
}
