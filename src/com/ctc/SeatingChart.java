package com.ctc;

import java.util.*;
import java.util.HashMap;

public class SeatingChart {

    //  Manhattan Best = row 1 column 6
    public int rBest = 0;
    public int cBest = 5;

    //  Structure representing rows of seats
    public int[][]  seats = new int[3][11];

    //  Structure to keep track of longest sequence of empty seats
    public HashMap<Integer, Integer> longestEmptyPerRow = new HashMap<Integer, Integer>();

    //  Constructor
    public SeatingChart() {

        this.seats = seats;
        this.longestEmptyPerRow.put(0, 11);
    }



    //I arrived here and realized I'd have problems keeping track of the empty seats.
    public int longestEmptySeats(){

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 10; j++){

                try{
                    if(this.seats[i][j] == 0){
                        //do nothing
                    }

                }catch(Exception e){
                    continue;
                }


            }
        }

    }


    //  utility methods
    public boolean reserveSeat(int r, int c){

        if(seats[r][c] != 0) {
            return false;       //reservation didn't work
        }else{
            seats[r][c] = 1;
            return true;        //reservation wporked
        }
    }


    public String[] breakInput(String fromKeyboard){
        return fromKeyboard.split(" ");
    }

}
