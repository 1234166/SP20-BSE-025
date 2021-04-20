/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal
 */
public class Computer {
    double Wordsize;
    double Memorysize;
    double Storagesize;
    double speed;
     public Computer(){
         Wordsize = 0;
         Memorysize = 0;
         Storagesize = 0;
         speed = 0;
     }
     public Computer(double Wordsize, double Memorysize, double Storagesize, double speed){
         this.Memorysize = Memorysize;
         this.Storagesize = Storagesize;
         this.Wordsize = Wordsize;
         this.speed = speed;
     }
     public void setWordsize(double Wordsize){
         this.Wordsize = Wordsize;
     }
     public void setMemorysize(double Memorysize){
      this.Memorysize = Memorysize;
     }
     public void setStoragesize(double Storagesize){
         this.Storagesize = Storagesize;
     }
     public void setspeed(double speed){
         this.speed = speed;
     }
     public double getWordsize(){
         return Wordsize;
     }
     public double getMemorysize(){
         return Memorysize;
     }
       public double getStoragesize(){
         return Storagesize;
     }
         public double getspeed(){
         return speed;
     }
     
     }
