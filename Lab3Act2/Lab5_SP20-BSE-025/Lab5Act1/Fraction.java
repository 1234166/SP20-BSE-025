/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5assignment;

/**
 *
 * @author Daniyal
 */import java.util.*;
public class Fraction {
     private int integer1;
	private int integer2;

	public Fraction(int n, int d) 
	{
		integer1 = n;
		integer2 = d;
	}

	public void setNumerator(int n) 
	{
		integer1 = n;
	}
	public void setDenominator(int d)
	{
		integer2 = d;
	}

	public void displayFraction()
	{
		System.out.print(integer1 + "/" + integer2);
	}

	public boolean equals(Fraction other)
	{
		int num1, num2;
		int num3, num4;
		int num5 = 1;
		for (int i = 2; i <= Math.min(integer1, integer2); i++) 
		{

			if (integer1 % i == 0 && integer2 % i == 0)
				num5 = i;
		}

		num1 = integer1 / num5;
		num2 = integer2 / num5;

		int otherGcf = 1;
		for (int i = 2; i <= Math.min(other.integer1, other.integer2); i++) 
		{
			
			if (other.integer1 % i == 0 && other.integer2 % i == 0)
				otherGcf = i;
		}

		num3 = other.integer1 / otherGcf;
		num4 = other.integer2 / otherGcf;

		return (num1 == num3 && num2 == num4);

	}
}
