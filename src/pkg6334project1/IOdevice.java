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
     PCB functionDude = new PCB();
     for (int i = 0; i < IO_burst; ++i)
     {
        
        functionDude.BubbleSort();
     }
     BusyOrNot = false;
     System.out.println("Ready");
     //Call Bubble Sort() for IO_burst times and then return “ready”; 
    }
}
