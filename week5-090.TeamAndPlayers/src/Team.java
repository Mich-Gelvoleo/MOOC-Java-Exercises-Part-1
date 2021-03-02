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

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();;
    private int size;
    
    public Team(String name){
        this.name = name;
        this.size = 16;
    }
    
    public void setMaxSize(int maxSize){
        this.size = maxSize;
    }
    
    public int size(){
        if(this.size < this.players.size()){
            return this.size;
        }
        else{
            return this.players.size();
        }
    }
    
    public void addPlayer(Player player){
        players.add(player);
    }
    
    public void printPlayers(){
        if(this.players.size() < this.size){
            for(Player player : this.players){
                System.out.println(player);
            }
        }
    }
    
    public int goals(){
        int goals = 0;
        for(Player player : this.players){
            goals += player.goals();
        }
        return goals;
    }
    
    public String getName(){
        return this.name;
    }
}
