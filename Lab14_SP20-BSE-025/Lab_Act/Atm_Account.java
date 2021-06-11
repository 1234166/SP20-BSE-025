/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_oop;

/**
 *
 * @author Daniyal Hassan
 */
import java.io.*;
import java.util.*;

public class Atm_Account implements Serializable{
     private int Account_no;
     private double Balance;
     private String Name;
    
     public Atm_Account(double bal){
          Balance = bal;
          Account_no = 123;
     }
     public double getBalance(){
         return Balance;
     }
     public int getAccountNo(){
         return Account_no;
     }
     public String getName(){
         return Name;
     }
     public void setName(String a ){
         Name = a;
     }
     public void setBalance(double a){
         Balance = a;;
     }
     public void setAccountNo(int a){
         Account_no = a;
     }
     public void withdraw(double a){
        if (a <= Balance)
           Balance = Balance - a;
        else
           System.out.println("Insufficient balance");
     }
     public void deposit(double a){
         Balance = Balance + a;
     }

}
