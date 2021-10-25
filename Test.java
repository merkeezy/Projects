//this is connected to FitnessTracker.java

package com;

public class Test
{
    public static void main(String [] args)
    {
        TestFitnessTracker test1 = new TestFitnessTracker();
        TestFitnessTracker test2 = new TestFitnessTracker("Walking" , "April 15th");
        TestFitnessTracker test3 = new TestFitnessTracker(45);
        TestFitnessTracker test4 = new TestFitnessTracker("Running" , "January 1st, 2021" , 0);

        System.out.printf("%s at %s for %s minutes.%n" , test1.getActivity(), test1.getDate(), test1.getMinutes());
        System.out.printf("%s at %s for %s minutes.%n" , test2.getActivity(), test2.getDate(), test2.getMinutes());
        System.out.printf("%s at %s for %s minutes.%n" , test3.getActivity(), test3.getDate(), test3.getMinutes());
        System.out.printf("%s at %s for %s minutes.%n" , test4.getActivity(), test4.getDate(), test4.getMinutes());
    }



}
