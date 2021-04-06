/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.oop;

/**
 *
 * @author Daniyal
 */import java.util.Scanner;
public class Runner {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Num: ");
         calculator.Var1 = input.nextDouble();
          System.out.print("Enter first Num: ");
        calculator.Var2 = input.nextDouble();
        System.out.println("The sum OF two numbers is: " +calculator.sum());
        System.out.println("Multiplication of two numbers is: " + calculator.multiply());
        System.out.println("Division of two numbers is: " + calculator.divide());
       System.out.println("Sin of two numbers  is: " + calculator.sin());
       System.out.println("Cos of two numbers is: " + calculator.cos());
       System.out.println("tan of two numbers is: " + calculator.tan());
       System.out.println("Modulus is: " + calculator.modulus());
       

        
    }

}
