/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cui
 */
public class time {
    
   int hours;
    int minutes;
    int seconds;
    
    time(){
        hours = 11;
        minutes = 45;
        seconds = 12;
    }
    time(int h, int m, int s){
        hours = h;
        minutes = m;
                seconds = s;
        
    }
  public  void show(){
     System.out.println("Current time is "+hours+ ": "+ minutes+" :"+seconds);
        
    }
   
}
