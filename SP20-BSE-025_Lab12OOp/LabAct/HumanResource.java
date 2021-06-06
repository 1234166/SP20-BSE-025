/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Daniyal Hassan
 */
import java.util.ArrayList;
public class HumanResource {
    //private Association[] resources;
    private ArrayList<Association> resources;

    public HumanResource(){
        resources = new ArrayList<>();
    }
    
    public void add(Association r){
        resources.add(r);
    }
    public boolean delete(String ID){
        
        for(int i = 0; i<resources.size(); i++){
            if(((Person)resources.get(i)).id == ID){
                resources.remove(i);
                return true;
            }
        }
        return false;
    }
    public void display(){
        for(int i = 0; i <resources.size();i++){
            System.out.println();
            System.out.println(i+"-"+resources.get(i).toString());
            System.out.println();
        }
    }
    public String toString(){
        return " ";
    }

    // private void extend(){
        
    // }
}