package calculator;

import java.util.Scanner;
public class calculator 
{

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter first number : ");
		float a = x.nextFloat();
		int p = (int)a;
		System.out.println("Enter second number : ");
		float b = x.nextFloat();
		int q = (int)b;
		System.out.println("Enter operator one of them '+' , '-' , '*' , '/' : ");
		
		char c = x.next().charAt(0);
		if (c == '+')
		{
			System.out.println(p+q);
		}
		
		else if (c == '-')
		{
			System.out.println(p-q);
		}
		
		else if (c == '*')
		{
			System.out.println(p*q);
		}
		else if (c == '/')
		{
			System.out.println(p/q);
		}
		

	}
	
}

