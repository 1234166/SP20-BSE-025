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
public class Person
{
    protected String name;
    protected String id;

    public Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
    public String toString()
    {
        return "Name:\t" + name + "\nID:\t" + id;
    }

}

