package flightbook;

import java.util.*;

public class Passenger
{
    private String name;
    private boolean assistance;


    public Passenger (String name, boolean ass)
    {   this.name = name;
        assistance = ass;
    }

    public boolean needsAssist ()
    {   return assistance; }


    public String getName ()
    {   return name;}

    public String toString()
    {
        return "Passenger:  " + name + "  Assistance:  " + assistance;
    }
}
