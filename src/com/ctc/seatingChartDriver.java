package com.ctc;

import java.util.*;

public class seatingChartDriver {

    public static void main(String[] args)
    {

        System.out.println("Enter initialization of seat chart");
        Scanner scan = new Scanner(System.in);
        String initial = scan.nextLine();
        String[] takenSeats = initial.split("\\s+");


        //  creates a seating chart object
        SeatingChart SC = new SeatingChart();

        for(int i = 0; i < takenSeats.length; i ++){
            SC.reserveSeat(takenSeats[i].charAt(1), takenSeats[i].charAt(3));
        }




    }

}
