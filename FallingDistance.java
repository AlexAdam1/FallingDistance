/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fallingdistance;

/**
 *
 * @author atabo
 */
public class FallingDistance {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            System.out.printf("The distance fallen after %d is %.2f\n", i, fallingDistance(i));
        }
    }
    
    public static double fallingDistance(double time){
        double distance;
        distance = (1.0/2) * 9.8 * Math.pow(time,2);
        return distance;
        
    
    
    }

}