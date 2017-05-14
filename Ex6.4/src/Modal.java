
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hafsa Umar
 */
public class Modal extends AbstractListModel<String> {

    private java.util.List<TownInformation> towns= new ArrayList();
    
    Modal(){
    }
    
    @Override
    public int getSize() {
        return towns.size();
    }

    @Override
    public String getElementAt(int index) {
        return towns.get(index).getName();
    }
    
    
    public void createTown(String Nam, String cntry, int pop, int year){
        towns.add(new TownInformation(Nam, cntry,pop,year));
    }
    public TownInformation getTown(int index){
        return towns.get(index);
    }
    public void updateTown(int index, String Nam, String cntry, int pop, int year){
        towns.get(index).setCountry(cntry);
        towns.get(index).setName(Nam);
        towns.get(index).setPopulation(pop);
        towns.get(index).setYearEstablished(year);
    }
}
