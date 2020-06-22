/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbooking;

import java.util.Scanner;

/**
 *
 * @author Osas
 */
public class Ordinary extends Train {
    
    Scanner sc = new Scanner(System.in);
    float amount;
    int seats;
    float cost;

    public Ordinary(String n, String s, String d, int tr) {
        super(n, s, d, tr);
    }

    public Ordinary() {
        amount = 0;
        seats = 60;
        cost = 100;
    }
    
    void check_SeatAvailability(){
        System.out.println("Available seats: " + seats);
    }
    
    void BookTicket(){
        System.out.println("Enter then number of tickets needed: ");
        int noOfTickets = sc.nextInt();
        
        System.out.println("Number of tickets booked: " + noOfTickets);
        
        amount = noOfTickets * cost;
        Train t = new Train("ThamesLink", "St Albans", "Hatfield", 30845);

        System.out.println("Total Amount " + amount + "for " + t);
    }
    
    
    
    
    
}
