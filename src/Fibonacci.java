import java.util.Scanner;

public class Fibonacci {

	//Allows for memoization.  This ensures that a method does not run the same input
	//more than once.  The fibonanci method stores the result in the fibonacciCache.
	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		
		int number;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number in the Fibonacci sequence");
			
			number = scanner.nextInt();
		}
		
		fibonacciCache = new long[ number + 1];
		
		
		for(int i = 0; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");   

		}

	}

	private static long fibonacci(int number) {
		
		if(number <= 1) {
			return number;
		}
		
		if(fibonacciCache[number] != 0) {
			return fibonacciCache[number];
		}
		
		long nthFibonacciNumber = fibonacci(number - 1) + fibonacci(number - 2);
		
		fibonacciCache[number] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
		
	}

}
