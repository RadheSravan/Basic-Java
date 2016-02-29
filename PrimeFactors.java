import java.util.*;

class PrimeFactors
{
	public static void main(String args[])
	{
		long number = 0, factor = 2, input = 0;
		HashSet<Long> set = new HashSet<Long>(); 

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be prime factorized : ");
		number = scanner.nextLong();
		input = number;

		while(number != 0)
		{
			if(number%factor != 0)
			{
				factor = factor + 1;
			}
			else
			{
				number = number/factor;
				set.add(factor);					// Adding to a HashSet to prevent duplicate entries 

				if(number == 1)
				{
					break;
				}
			}
		}
		
		System.out.println("\nThe following are the " + set.size() + " prime factors of " + input + " : " );
		for(Long factors : set)
		{
			System.out.print(factors + " ");
		}
		System.out.println("\n");
	}
}
