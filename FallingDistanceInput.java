/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fallingdistance;

/**
 *
 * @author atabo
 */
import java.util.Scanner;

public class FallingDistanceInput {

    public static void main(String[] args) {
        double time;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many seconds was the given object falling?");
        time = keyboard.nextDouble();
        fallingDistance(time);
        System.out.println("The distance fallen after " + time + " seconds is " + fallingDistance(time));
     
    }
    
    public static double fallingDistance(double time){
        double distance;
        distance = (1.0/2) * 9.8 * Math.pow(time,2);
        return distance;
        
    
    
    }

}
