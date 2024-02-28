package number_system;

import java.util.Scanner;

public class product_of_number {
public static int product(int n)
{
	int prod=1;
	while(n>0)
	{
		int rem=n%10;
		prod=rem*prod;
		n=n/10;
	}
	return prod;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	System.out.println(product(n));
}
}
