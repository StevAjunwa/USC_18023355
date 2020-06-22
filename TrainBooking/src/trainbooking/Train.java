/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbooking;

/**
 *
 * @author Osas
 */
public class Train {
    
    String name, source, destination;
    int trainNo;

    public Train(String n, String s, String d, int tr) {
        name = n;
        source = s;
        destination = d;
        trainNo = tr;
    }
    
    Train(){
        
    }

    public String toString(){
        return name;
    }
    
}
