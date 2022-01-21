import java.util.Scanner;

public class fibonacciExample {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);

		   System.out.println("Enter the number to limit Fibonacci series: ");
		   int num = input.nextInt();
		   //loop till the last count
		   for(int i = 1; i <= num; i++){
			   //call Fibonacci function to print sum of last two numbers
		      System.out.print(printFibonacci(i) + " ");
		   }
		   input.close();
		 }


		 // recursion function
		 private static int printFibonacci(int CurrentNumber){
		  //exit condition
		  if(CurrentNumber == 1 || CurrentNumber == 2){
		   return 1;
		  }
		  return printFibonacci(CurrentNumber - 1) + printFibonacci(CurrentNumber - 2);
		 }

}




import java.util.*;

public class FibonacciSeriesWithoutRecursion {
    public static void main(String args[]) {
        int terms, i;

       Scanner in = new Scanner(System.in);
       System.out.println("Enter number of terms in Fibonacci Series");
       terms = in.nextInt();

       /*
        * fibonacci(N) = fibonacci(N-1) + fibonacci(N-2);
        */
       for(i = 0; i < terms; i++){
           System.out.print(fibonacci(i) + " ");
       }
    }

    public static int fibonacci(int num){
