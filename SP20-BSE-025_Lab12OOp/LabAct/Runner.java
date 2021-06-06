/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Daniyal Hassan
 */
public class Runner
{
    public static void main(String[] args)
    {
        HumanResource h1 = new HumanResource();

        h1.add( new Teacher("Ali", "125674") );
        h1.add( new Teacher("Ahmed", "789654") );
        h1.add( new Teacher("Amna", "128765") );
        h1.add( new Student("Sunny", "0023347") );
        h1.add( new Student("Daniyal", "0023348") );
        h1.add( new Student("Jenny", "0023349") );

        h1.display();

        Association sw = new Student("Student", "94978");
        sw.associate();
        Association tw = new Student("Teacher", "97928");
        tw.associate();
    }

}


