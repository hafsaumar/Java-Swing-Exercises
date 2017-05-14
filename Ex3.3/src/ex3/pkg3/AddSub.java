/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.pkg3;

/**
 * AddSub Class
 * has two methods, addition and subtraction
 * @author Hafsa Umar
 */
public class AddSub {
    /**
     * addition method adds the two integer variable and returns a string in the form of 4+5=9
     * @param param1 integer
     * @param param2 integer
     * @return string
     */
    public static String addition(int param1, int param2){
        StringBuilder stringBuilder= new StringBuilder(String.valueOf(param1));
        stringBuilder.append(" + ");
        stringBuilder.append(param2);
        stringBuilder.append(" = ");
        stringBuilder.append(param1+param2);
        return stringBuilder.toString();
    }
    /**
     * subtraction method subtracts the two integer variable and returns a string in the form of 3-2=1
     * @param param1 integer
     * @param param2 integer
     * @return string
     */
    public static String subtraction(int param1, int param2){
        StringBuilder stringBuilder= new StringBuilder(String.valueOf(param1));
        stringBuilder.append(" - ");
        stringBuilder.append(param2);
        stringBuilder.append(" = ");
        stringBuilder.append(param1-param2);
        return stringBuilder.toString();
    }
    
}
