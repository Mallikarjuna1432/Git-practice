package number_system;

import java.util.Scanner;
//A NUMBER IN WHICH THE FACTORIAL OF SUM EACH DIGIT 
//OF A NUMBER IS EQUAL TO THE GIVEN NUMBER 
public class pterson_number {
public static String add(int n)
{
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		sum=factorial(rem)+sum;
		n=n/10;
	}
	if(sum==temp)
	{
		return "yes";
	}
	return "no";
	
}
public static int factorial(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	System.out.println(add(n));
}
}