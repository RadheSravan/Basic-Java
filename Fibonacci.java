import java.util.Scanner;

class Fibonacci
{
	static long fibonacci(long n)
	{
   		long firstNumber = 0, secondNumber = 1, nextNumber = 0, i;
		
		for(i=0; i<n; i++)
		{
			if(i <= 1)
			{
				nextNumber = i;
			}
			else
			{
				nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
			}
		}
		return nextNumber;
		
	}

	static  void generateFibonacciSeriesUptoN(long n)
	{
		long i = 1;
		System.out.println("\n Fibonnaci Series upto "+ n + " : ");
		while(fibonacci(i) <= n)
   		{
      			System.out.print(" "+fibonacci(i));
      			i++; 
   		}
		System.out.println("\n");
	}

	static void generateFirstNNumbersOfFibonacci(long n)
	{
		long i = 1;
		System.out.println("\n Fibonnaci Series for the first "+ n + " numbers : ");
		for (long c = 1 ; c <= n ; c++ )
   		{
      			System.out.print(" "+fibonacci(i));
      			i++; 
   		}
		System.out.println("\n");
	}

	public static void main(String args[])
	{
		int option;
		long n;
		System.out.println("\n 1. Print first n numbers of Fibonacci series.\n\n 2. Print the Fibonacci series upto a particular number n\n\n Choose your option (1 or 2) : ");
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			option = scanner.nextInt();
			if(option != 1 && option != 2)
			{
				while(option != 1 && option != 2)
				{
					System.out.println("\n Enter a valid option 1 or 2 : ");
					option = scanner.nextInt();
				}
			}
			
			System.out.println("\n Enter the n value : ");
			try	
			{
				n = scanner.nextLong();
				if(option == 1)
				{
					generateFirstNNumbersOfFibonacci(n);
				}
				else
				{
					generateFibonacciSeriesUptoN(n);
				}
			}
			catch(Exception e)
			{
			
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
