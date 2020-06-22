package flightbook;

import java.util.*;

public class Flight
{
    private String fltCode;
    private String destination;
    private int capacity;

    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();



    public Flight (String code, String destination, int cap)
    {
        fltCode = code;
        this.destination = destination;
        capacity = cap;
    }

    public String getCode()
    {
        return fltCode;
    }

    public String getDestination()
    {
        return destination;
    }

    public boolean hasPlaces()
    {
        return passengers.size() < capacity;
    }

    public void addPassenger(Passenger pp)
    {
        passengers.add(pp);
    }

    public void removePassenger(Passenger pp)
    {
        passengers.remove(pp);
    }

    public boolean isPassenger(Passenger pp)
    {
        return passengers.contains(pp);
    }


    public String toString()
    {
        return fltCode + "  " + destination + "\nCapacity:  " + capacity + "  Booked: " + passengers.size();
    }
}
