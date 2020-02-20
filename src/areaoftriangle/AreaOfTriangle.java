/*
 * Anton dela Cruz
 * February 19, 2020
 * This program calculates the area of a scalene triange using Heron's formula, and the meaurements given by the user
 */
package areaoftriangle;

import javax.swing.*;
/**
 *
 * @author antde
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initialize variables
        double s;
        double area;
        
        String a = JOptionPane.showInputDialog("Input first side length");      // Window pops up and prompts for user input
        double side1 = Double.parseDouble(a);                                   // Integer data converts to double data type
        
        String b = JOptionPane.showInputDialog("Input second side length");     // Window pops up and prompts for user input
        double side2 = Integer.parseInt(b);                                     // Integer data converts to double data type
        
        String c = JOptionPane.showInputDialog("Input final side length");      // Window pops up and prompts for user input
        double side3 = Double.parseDouble(c);                                   // Integer data converts to double data type
        
        
        s = (side1 + side2 + side3) / 2;                                        // Value for semi-perimeter of triangle is calculated
        
        area = s * (s - side1) * (s - side2) * (s - side3);                     // Area of user's triangle is calculated using Heron's formula
        
        System.out.println("The area of the your triangle is " + area);
        
    }
    
}
