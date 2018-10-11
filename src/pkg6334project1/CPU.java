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

public class CPU extends Thread {
    public boolean cpuIsBusy;
    public int PC; //Your CPU only has one register PC
    public int timeslice;
    public int timeSliceRemaining = timeslice;
    public CPU(int settimeslice)
    {
        timeslice= settimeslice;
        cpuIsBusy=false;
    }
    
    public CPU()
    {
        cpuIsBusy = false;
    }
    
    //public Pair<Integer, String> execute(PCB P){
    public Pair<Integer, String> execute(PCB P){
        cpuIsBusy=true;
        
        int programCounter = P.programCounter;
         Pair<Integer, String> output;
        /* read the CPU burst number, say #, from the position
       PositionOfNextInstructionToExecute of P.*/
        
        
       
       /* Repeat calling Bubble Sort() for # times and then continue.
        If the code runs out, return (PositionOfNextInstructionToExecute,
       “terminated”), then OS put it back to the terminated queue.*/
       
       /* If the slice of time (restricted number of calling Bubble sort() for a
       process each time) runs out, return (PositionOfNextInstructionToExecute+1,
       “ready”), then OS put it back to the ready queue.
        Otherwise, return (PositionOfNextInstructionToExecute+1, “wait”)
       (namely, P has an I/O request and then OS remove it from the ready queue
       and sent it to I/O queue)
       */
       
       //best case
       //loop for num of cpu bursts
       //maybe break out if timeSliceRemaining = 0
        //for(int i = 0; i < P.burstSeq.get(programCounter); ++i)
        //{
            P.BubbleSort();
            
            //since Integer obj are immutable, copy value of whats at index
            //decrement, reset at index
            int tempVal = P.burstSeq.get(programCounter);
            tempVal--;
            P.burstSeq.set(programCounter,tempVal);
           
            timeSliceRemaining--;
            
            //this means that we have no time left in slice
            //break out, need to switch
            if (timeSliceRemaining == 0)
            {
                output = new Pair(programCounter,"ready");
                cpuIsBusy = true;
                return output;
            }
            
        //}
    output = new Pair(programCounter+1, "wait");
    cpuIsBusy = false;
    return output;
    }  
    
    public boolean cpuBusyBoolean()
    { 
        return cpuIsBusy;
    }
    
        public void run()
    {
        try{
            for (int i = 0; i < 10; i++){
                
                System.out.println("CPU Thread Running: " + i);
                Thread.sleep(10);
                i += 1;
            }
        } catch (InterruptedException e) {
        //handle 
        }
    }
    
}