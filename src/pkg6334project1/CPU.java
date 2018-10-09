/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6334project1;
import java.util.*;
import javafx.util.Pair;
/**
 *
 * @author Humberto Saenz
 */

public class CPU{
    public boolean cpuIsBusy;
    public int PC; //Your CPU only has one register PC
    public int timeslice;
    public CPU(int settimeslice)
    {
        timeslice= settimeslice;
        cpuIsBusy=false;
    }
    public Pair<Integer, String> execute(Process P){
        cpuIsBusy=true;
        /* read the CPU burst number, say #, from the position
       PositionOfNextInstructionToExecute of P.
        Repeat calling Bubble Sort() for # times and then continue.
        If the code runs out, return (PositionOfNextInstructionToExecute,
       “terminated”), then OS put it back to the terminated queue.

        If the slice of time (restricted number of calling Bubble sort() for a
       process each time) runs out, return (PositionOfNextInstructionToExecute+1,
       “ready”), then OS put it back to the ready queue.
        Otherwise, return (PositionOfNextInstructionToExecute+1, “wait”)
       (namely, P has an I/O request and then OS remove it from the ready queue
       and sent it to I/O queue)
       */
       Pair<Integer, String> output = new Pair<Integer, String>(1, "test");
       return output;
    }
    public void BubbleSort(){
    	List<Integer> listToSort = rng(100000);
    	
    	for (int i = 0; i < listToSort.size()-1; ++i)
    	{
    		for (int j = 0; j < listToSort.size()-1; ++j)
    		{
    			if (listToSort.indexOf(j) > listToSort.indexOf(j+1))
    			{
    				Collections.swap(listToSort, j, j+1);
    			}
    		}
    	}

    }
    
    public List<Integer> rng(int n)
    {
        List<Integer> result = new ArrayList<>();
        double rand = 0;
        for (int i : result)
        {
            rand = (Math.random() * 100000)+1;
            result.add((int) rand);

        }//looping until n-many random ints btw 1-100k into list

        return result;
    }    
    
    
    public boolean cpuBusyBoolean()
    { 
        return false;
    }
    
}