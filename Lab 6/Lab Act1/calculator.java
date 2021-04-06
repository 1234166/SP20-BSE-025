/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.oop;

/**
 *
 * @author Daniyal
 */
public class calculator {
    static double Var1;
     static double Var2;
    
    
    public static double sum(){
        return Var1+Var2;
    }
    
    public static double multiply(){
        return Var1*Var2;
    }
    public static double divide(){
        return Var1/Var2;
    }
    public static double sin(){
      java.lang.Math.sin(Var1);
   
       double a= Math.toRadians(Var1);
     return Math.sin(a);
    }
         public static double cos(){
         java.lang.Math.cos(Var1);
         double b = Math.toRadians(Var1);
         return Math.cos(b);
     }
     public static double tan(){
         java.lang.Math.tan(Var1);
         double b = Math.toRadians(Var1);
         return Math.tan(b);
     }
     public static double modulus(){
         return Var1 % Var2;
     }

}
