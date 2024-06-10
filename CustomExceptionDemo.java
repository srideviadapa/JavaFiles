// A Class that represents use-defined exception
import java.util.*;
class InvalidAgeException extends Exception {
	public InvalidAgeException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

class BookTickets
{
	BookTickets()
	{
		System.out.println("Welcome to Booking Platform !!");
	}
	void checkAge(int age)
	{
		try 
		{
			if(age<18)
			{
			throw new InvalidAgeException("You Cannot Watch this Movie");
			}
			else
			{
				System.out.println("Tickets Booked Successfully !!");
			}
		}
		catch (InvalidAgeException ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
}
// A Class that uses above MyException
public class CustomExceptionDemo{
	// Driver Program
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BookTickets b1=new BookTickets();
		System.out.print("Enter Your Age ");
		int age=sc.nextInt();
		System.out.println();
		b1.checkAge(age);
	}
}
