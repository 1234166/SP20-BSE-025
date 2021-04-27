/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniyal
 */
abstract class Student{
    
    public void TakeXam(){
        System.out.println("Taking Exam!");
    }
}

class Phd_Student extends Student{
    @Override
    public void TakeXam(){
        System.out.println("Giving Final Defense Presentation!");
    }
}

class Grad_Student extends Student{
    @Override
    public void TakeXam(){
        System.out.println("Giving Written paper!");
    }
}

