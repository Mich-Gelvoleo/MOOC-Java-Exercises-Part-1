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

public class Record {
    private ArrayList<Integer> record = new ArrayList<Integer>();
    private int countA = 0;
    private int countB = 0;
    private int countC = 0;
    private int countD = 0;
    private int countE = 0;
    private int countF = 0;
    private int countAccept = 0;
    private double percentage;
    
    public void list(Scanner reader){

        System.out.println("Type exam scores, -1 completes: ");
        int grade = 0;
        while(grade != -1){
            grade = Integer.parseInt(reader.nextLine());
            if(grade >= 0 && grade <= 60){
                record.add(grade);
            }
        }
    }
    
    public void gradeCount(){
        for(int grade : record){
            if(grade >= 50 && grade <= 60){
                this.countA++;
                this.countAccept++;
            }
                
            if(grade >= 45 && grade <= 49){
                this.countB++;
                this.countAccept++;
            }
                
            if(grade >= 40 && grade <= 44){
                this.countC++;
                this.countAccept++;
            }
                
            if(grade >= 35 && grade <= 39){
                this.countD++;
                this.countAccept++;
            }
                
            if(grade >= 30 && grade <= 34){
                this.countE++;
                this.countAccept++;
            }
                
            if(grade >= 0 && grade <= 29){
                this.countF++;
            }
        }
    }

    
    public void printStars(int i){
        switch(i){
            case 5:
                for(i=0; i<this.countA; i++){
                    System.out.print("*");
                }
            break;
            
            case 4:
                for(i=0; i<this.countB; i++){
                    System.out.print("*");
                }
            break;
            
            case 3:
                for(i=0; i<this.countC; i++){
                    System.out.print("*");
                }
            break;
            
            case 2:
                for(i=0; i<this.countD; i++){
                    System.out.print("*");
                }
            break;
            
            case 1:
                for(i=0; i<this.countE; i++){
                    System.out.print("*");
                }
            break;
            
            case 0:
                for(i=0; i<this.countF; i++){
                    System.out.print("*");
                }
            break;
        }
    }
  
    public void gradeDistribution(){
        System.out.println("Grade Distribution: ");
        for(int i=5; i>=0; i--){
            System.out.print(i + ": ");
            
            printStars(i);
            
            System.out.println("");
        }
        
        this.percentage = (double)(100 * this.countAccept) / record.size();
        
        System.out.println("Acceptance Percentage: " + this.percentage);
    }
}
