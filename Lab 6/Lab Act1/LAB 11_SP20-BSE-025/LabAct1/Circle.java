/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal Hassan
 */
public class Circle implements Shape
{

	//private member of class
	private double radius;
	
	//parameterized constructor 
	public Circle(double r)
	{
		radius = r;
	}
	//Returns the radius 
	public double getRadius()
	{
		return radius;
	}
	//Assign the new radius 
	public void setRadius(double newR)
	{
		radius = newR;
	}

	//Returns the area of the circle
	public double area()
	{
		return radius * radius * Math.PI;
	}
}
