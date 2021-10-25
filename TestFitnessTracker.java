//Merkys Santiago
package com;

public class TestFitnessTracker
{
    String activity;
    String date;
    int minutes;

    //constructors
   public TestFitnessTracker ()
    {
        this.activity = "Running";
        this.minutes = 90;
        this.date = "January 1st of 2021";

    }

    public TestFitnessTracker(String activity, String date) {
        this.activity = activity;
        this.date = date;
        minutes = 30;
    }

    public TestFitnessTracker(int minutes) {
        activity = "Running";
        date = "January 1st, 2021";
        this.minutes = minutes;
    }

    public TestFitnessTracker (String activity, String date, int minutes)
    {
       this.activity = activity;
       this.date = date;
       this.minutes = minutes;
    }

    public String getActivity()
    {
        return activity;
    }

    public String getDate()
    {
       return date;
    }

    public int getMinutes()
    {
       return minutes;
    }




}
