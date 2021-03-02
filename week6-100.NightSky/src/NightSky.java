/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */

import java.util.*;

public class NightSky {
    private double density;
    private int height;
    private int width;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this.density = density;
        this.height = 10;
        this.width = 20;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.height = height;
        this.width = width;
        this.starsInLastPrint = 0;
    }
    
    public void printLine(){
        Random rand = new Random();
        double value;
        for(int i=0; i<this.width; i++){
            value = rand.nextDouble();
            if(value <= this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else{
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        this.starsInLastPrint = 0;
        
        for(int i=0; i<this.height; i++){
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
