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
public class Sleeper extends Train{
    
    Scanner sc = new Scanner(System.in);
    float amount;
    int seats = 50;
    float cost = 120;

    public Sleeper(String n, String s, String d, int tr) {
        super(n, s, d, tr);
    }

    public Sleeper() {
        amount = 0;
        seats = 50;
        cost = 120;
    }
    
    void check_SeatAvailability(){
        System.out.println("Available seats: " + seats);
    }
    
    void BookTicket(){
        System.out.println("Enter then number of tickets needed: ");
        int noOfTickets = sc.nextInt();
        
        System.out.println("Number of tickets booked: " + noOfTickets);
        
        amount = noOfTickets * cost;
        System.out.println("Total Amount: " + amount);
    }
    
}
