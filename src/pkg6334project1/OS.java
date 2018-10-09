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
public class OS{

    public static ArrayList<PCB> New_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Ready_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Wait_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Terminated_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Currently_Running = new ArrayList<PCB>();//beto's code, remind him :)
    public static CPU cpu = new CPU();
    public IODevice io = new IODevice(Wait_Queue);
    public boolean isCPUAvailable;
    // need to make processTable

    public static ArrayList<PCB> initialPCBs = new ArrayList<PCB>();

 //Read the txt input file, for each line, create a process and record its arrival
//time
 //Put each process in New_Q queue initially then put them in Ready_Q
 //Always check whether the CPU is idle or not; if yes, use your scheduler
    //algorithm to select a process from the Ready_Queue for CPU execution\
 // According to the return value of CPU execute(), put the process into the
//corresponding queue.
 //Record the time of every operation for computing your latency and
//response
}
