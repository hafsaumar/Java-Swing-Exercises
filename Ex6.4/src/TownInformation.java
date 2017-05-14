
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hafsa Umar
 */
public class TownInformation extends Observable  {
    private String name;
    private String country;
    private int population;
    private int yearEstablished;
    
   
    public TownInformation(String name, String country, int population, int year){
        this.name=name;
        this.country= country;
        this.population=population;
        this.yearEstablished= year;
    }
    
    //setters
    
    public void setName(String n){
        name = n;
    }
    public void setCountry(String c){
        country = c;
    }
    public void setPopulation(int p){
        population = p;
    }
    public void setYearEstablished(int e){
        yearEstablished = e;
    }
    
    //getters
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getPopulation(){
        return population;
    }
    public int getYearEstablished(){
        return yearEstablished;
    }
    
}
