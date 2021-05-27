/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Daniyal Hassan
 */

// triangle
class Triangle implements GeometricShape {
    double base;
    double height;
    
    // parameterized constructor
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    
    // area1
    public double area1() {
        return 0.5*this.base*this.height;
    }
}
