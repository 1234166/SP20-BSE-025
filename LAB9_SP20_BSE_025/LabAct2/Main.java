/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal
 */
import java.util.*;
public class Main
{
    
    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        boolean flag;
        double dValue;
        
        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();
            
            try{
                dValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }
            
            if(!flag)
                finalCount++;
        }
        return finalCount;
    }
    
        public static void main(String[] args) {
     
        StringTokenizer s1 = new StringTokenizer("There are 2 students in this class");
        StringTokenizer s2 = new StringTokenizer("There are two students in this class");
       
        int count = countTokens(s1);
        System.out.println("Total number of Tokens in string 1: "+ count);
      
        count = countTokens(s2);
        System.out.println("Total number of Tokens in string 2: "+ count);
        }
}
 