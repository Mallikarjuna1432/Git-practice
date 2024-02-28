package number_system;

import java.util.Scanner;

public class prime_or_not {
public static String check(int n)
{
	if(n<=1)
	{
		return "not prime";
	}
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return "not prime number";
		}
	}
	return " prime number";
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	System.out.println(check(n));
}
}
