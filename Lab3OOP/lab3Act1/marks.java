/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cui
 */
public class marks {
    
 public int a;
  public int b;
  public int c;
  int sum;
  
marks(int x){
    System.out.println("total sum is "+x);
  }
  marks(int x,int y, int z){
      a = x;
      b = y;
     c= z;
      
  }
  public int sum(){
      sum = a+b+c;
      return sum;
  }

    

}