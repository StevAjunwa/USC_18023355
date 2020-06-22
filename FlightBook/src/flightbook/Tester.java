package flightbook;

/**
 * Tester Class is a client of Agency
 * Explores approaches to error handling.
 * @version 3c - Defensive Programming hidden exception not handled in supplier
 */
public class Tester
{
    private Agency agency = new Agency();
    private Flight f1 ,f2,f3;
    private Passenger pp1, pp2, pp3, pp4, pp5;

    public Tester()
    {
        agency = new Agency();
        f1 = new Flight ("RO12", "Rome", 5);
        f2 = new Flight ("AM34", "Amsterdam", 3); // for testing purposes
        f3 = new Flight ("BE45", "Berlin", 2);  // not added to Agency

        pp1 = new Passenger ("Amy", true);
        pp2 = new Passenger ("Ben", false);
        pp3 = new Passenger ("Chen", false);
        pp4 = new Passenger ("Dan", false);
        pp5 = new Passenger ("Eli", false);
        System.out.println ("A version of Agency.");
        //Add flights to the agency
        agency.addFlight (f1); 
        agency.addFlight (f2);
        agency.addFlight (f3);
        // f3 not added to agency
        System.out.println("***********Flights***************");
        System.out.println(agency.listFlights());   // you can comment this out
    }

    public void doTest()
    {
        try
        {
            System.out.println ("************Defensive Programming using exceptions*************");

            agency.bookFlight(f1,pp1);
            agency.bookFlight(f1,pp2);
            agency.bookFlight(f2,pp1);
            agency.bookFlight(f2,pp3);
            agency.bookFlight(f3,pp1);     // run terminates here
            agency.bookFlight(f2,pp4);
            

            System.out.println("\n_______________________________Show all flights before booking____________________________________");
            System.out.println(agency.listFlights());

        }
        catch (Exception e)
        {
            System.out.println("Slots full, can't book");
        }
        
            System.out.println("\n_______________________________Booked flights____________________________________");
        System.out.println(agency.listFlights());
        
        
        // should check cancel booking
        System.out.println("\n_______________________________Cancelled flights____________________________________");
        agency.cancelBooking(f1,pp1);
        System.out.println(agency.listFlights());
    }
}
