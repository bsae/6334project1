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
public class IOdevice extends Thread {
    
    //default constructor
    public IOdevice()
    {
        
    }
    
    public IOdevice(ArrayList Wait_Queue)
    {
        
    }
    public boolean BusyOrNot;
//Always pick one process from Wait_Queue to exeute
    public void execute(PCB P){
     BusyOrNot=true;
     PCB functionDude = new PCB();
//     for (int i = 0; i < programCounter; ++i)
//     {
        functionDude.BubbleSort();
     //}
     BusyOrNot = false;
     
     //P.programCounter++;
     System.out.println("Ready");
     //Call Bubble Sort() for IO_burst times and then return “ready”; 
    }
    
    boolean BusyOrNot()
    {
        return BusyOrNot;
    }
    
    public void run()
    {
        try{
            for (int i = 0; i < 10; i++){
                
                System.out.println("IO Device Thread Running: " + i);
                Thread.sleep(10);
                i += 1;
            }
        } catch (InterruptedException e) {
        //handle 
        }
    }
}
