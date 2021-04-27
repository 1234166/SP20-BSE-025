/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal
 */
public class Clock {
   
    String hours, minutes, seconds;
   
    public Clock(String h, String min, String s){
        this.hours=h;
        this.minutes=min;
        this.seconds=s;
    }
    
    public void display(){
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }
}

class ChildClock extends Clock{
    
    public ChildClock(String h, String min, String s){
        super(h, min, s);
    }
   
    @Override
    public void display(){
        
        System.out.println("24 Hour Format:");
        super.display();
        System.out.println("12 Hour Format:");
        int hour1 = (int)hours.charAt(0) - '0';
        int hour2 = (int)hours.charAt(1)- '0';
        int tothour = hour1 * 10 + hour2;
        String m;
        if(tothour < 12)
            m="AM";
        else
            m="PM";
        tothour %= 12;
        if (tothour == 0) {
            System.out.print("12");
            System.out.print(":"+minutes+":"+seconds);
        }
        else{
            System.out.print(tothour);
            System.out.print(":"+minutes+":"+seconds);
        }
        System.out.println(" "+m);
    } 
}
