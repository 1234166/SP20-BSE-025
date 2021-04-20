/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal
 */
public class Laptop extends Computer{
    double length;
    double width;
    double height;
    double weight;
    public Laptop(){
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }

    

   
    

    Laptop(double Wordsize, double Memorysize, double Storagesize, double speed, double length, double width, double height, double weight) {
        super(Wordsize,Memorysize,Storagesize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }


    public void setlength(double length){
        this.length = length;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public void setheight(double height){
        this.height = height;
    }
    public void setweight(double weight){
         this.weight = weight;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getheight(){
        return height;
    }
    public double getweight(){
        return weight;
    }
    public void display(){
        System.out.println(" Wordsize = " + Wordsize +" bits\n"+ " Memorysize =  " + Memorysize  + " megabytes\n" + "Storagsize = " + Storagesize + " megabytes\n"+ "Speed = "+ speed  +"megahertz\n" + "length; "  + length + "cm\n" + "width; " + width + " cm\n " + "height: "+ height + "m\n"+ "weight: " + weight + "kg\n");
    }
    
    
}
