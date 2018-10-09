/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6334project1;

import java.util.*;

/**
 *
 * @author Humberto Saenz
 */
public class IOdevice{
    
    public void IODevice(ArrayList<PCB> Wait_Queue){
        
    }
    public boolean BusyOrNot;
//Always pick one process from Wait_Queue to exeute
    public void execute(int IO_burst){
     BusyOrNot=true;
     for (int i = 0; i < IO_burst; ++i)
     {
        BubbleSort();
     }
     BusyOrNot = false;
     System.out.println("Ready");
     //Call Bubble Sort() for IO_burst times and then return “ready”; 
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
}
