/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1a2runner;

/**
 *
 * @author cui
 */import java.util.Scanner;
public class runnerLAB3Assignment1 {
      public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      marks k = new marks(a+b+c);
      int l = k.sum();
     
   }
}
