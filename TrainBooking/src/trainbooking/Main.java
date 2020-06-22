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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ch;
        Scanner sc = new Scanner(System.in);
        Train t = new Train("ThamesLink", "St Albans", "Hatfield", 30845);
        
        Ordinary o = new Ordinary();
        Sleeper sl = new Sleeper();
        ThreeTierBusiness tb = new ThreeTierBusiness();
        TwoTierBusiness tt = new TwoTierBusiness();
        AChair ac = new AChair();
        
        System.out.println("Enter the class to book \n1. Ordinary \n2. Sleeper \n3. Three Tier Business \n4. Two Tier Business \n5. AChair" );
        ch = sc.nextInt();
        
        switch(ch){
            case 1: {
                o.check_SeatAvailability();
                o.BookTicket();
                break;
            }
            
            case 2: {
                sl.check_SeatAvailability();
                sl.BookTicket();
                break;
            }
            
            case 3: {
//                tb.check_SeatAvailability();
//                tb.BookTicket();
                break;
            }
            
            case 4: {
//                tt.check_SeatAvailability();
//                tt.BookTicket();
                break;
            }
            
            case 5: {
//                ac.check_SeatAvailability();
//                ac.BookTicket();
                break;
            }
        }
    }
    
}
