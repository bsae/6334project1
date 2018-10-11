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
    
   //move back to PCB
    public static void BubbleSort() {
        ArrayList<Integer> listToSort = rng(800);
        
        for(int i = listToSort.size()-1; i>=0;i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(listToSort.get(j) > listToSort.get(j+1))
                {
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j+1));
                    listToSort.set(j+1,temp);
                }
            }
        }
        for(int k = 0; k < listToSort.size(); ++k)
        {
            System.out.println(listToSort.get(k));
        }
            
    }
    
    public static ArrayList<Integer> rng(int n)
    {
        ArrayList<Integer> result = new ArrayList<>(n);
        double rand = 0;
        for (int i = 0; i < n; ++i)
        {
            rand = (Math.random() * 100000)+1;
            result.add((int) rand);

        }//looping until n-many random ints btw 1-100k into list

        return result;
    }

}
