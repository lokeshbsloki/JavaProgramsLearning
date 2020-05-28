package Patterns;

import java.awt.print.Printable;

public class Mock {

	public static void main(String[] args) {
		int i = 1;

		
		//print1to100WithoutLoop(i);

		//factorialnum(5, 1);
		System.out.print("0, ");
		System.out.print("1, ");
		fibonecci(0, 1);
	}

	public static void print1to100WithoutLoop(int i) {

		if (i <= 100) {

			System.out.println(i++);
			print1to100WithoutLoop(i);
		}

	}
	
	public static void factorialnum(int num,int prod) {
		
		
		if(num>0)
		{
			prod=prod*num;
			num--;
			factorialnum(num, prod);
		}
		else {
			System.out.println(prod);
		}
	}
	
	public static void fibonecci(int a,int b) {
		
		int c=a+b;
		if(c<10) {
		a=b;
		b=c;
		System.out.print(c+", ");
		fibonecci(a, b);
		}
		
		
	}
	
	

}
