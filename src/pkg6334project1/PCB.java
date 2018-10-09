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
public class PCB {
	
	//constructor
	PCB()
	{	
		newState = true;
		readyState = false;
		runningState = false;
		waitingState = false;
		terminatedState = false;
	}
	
	int ID = 0;
	int arrivalOrder = 0;
	int priority = 0;
	List<Integer> burstSeq = new ArrayList<Integer>();
	int programCounter = 0; //next instruction to ececute in burst seq
        int doingFirstIOBurst = 0; //b.w.h
        boolean arrived = false;//b.w.h
	boolean newState = false;
	boolean readyState = false;
	boolean runningState = false;
	boolean waitingState = false;
	boolean terminatedState = false;
	
	double startTime, endTime, endOfFirstIOBurst = 0;

    public void Print(){
        System.out.println(this.burstSeq);
    }

    
    public void setToNewState(){
        newState = true;
	readyState = false;
	runningState = false;
	waitingState = false;
	terminatedState = false;
    }
    
    public void setToReadyState(){
        if (!this.arrived){
            this.arrived = true;
            startTime = System.nanoTime(); //b.w.h
        }
        
        if (doingFirstIOBurst == 1){
            
        }
        
        newState = false;
	readyState = true;
	runningState = false;
	waitingState = false;
	terminatedState = false;
    }
    
    public void setToRunningState(){
        newState = false;
	readyState = false;
	runningState = true;
	waitingState = false;
	terminatedState = false;
    }
    
    public void setToWaitingState(){
        newState = false;
	readyState = false;
	runningState = false;
	waitingState = true;
	terminatedState = false;
        
        doingFirstIOBurst = 1;
    }
    
    public void setToTerminatedState(){
        newState = false;
	readyState = false;
	runningState = false;
	waitingState = false;
	terminatedState = true;
        
        endTime = System.nanoTime(); //b.w.h
    }
}
