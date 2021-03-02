/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int input){
        this.number = input;
    }
    
    public int multiply(int otherNumber){
        int product;
        
        product = otherNumber * this.number;
        
        return product;
    }
}
