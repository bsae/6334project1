/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6334project1;
import java.io.*;
import java.util.*;
import static pkg6334project1.PCB.rng;
/**
 *
 */
public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        OS os = new OS();
        
        
        

        int userChoice = -1;
        System.out.print("Welcome to short term scheduler, pick  1, 2, or 3"
                + " for First Come First Serve, Round Robin, or Priority Scheduler");
        userChoice = reader.nextInt();
        if (userChoice == 1)
        {
            CPU cpu = new CPU(10);
            os.FCFS();
        }
        else if(userChoice == 2)
        {
            System.out.print("Enter a CPU timeslice: ");
            userChoice = reader.nextInt();
            CPU cpu = new CPU(userChoice);
            os.RR(cpu);
        }
//        PCB p = new PCB();
//
//        p.BubbleSort();
        System.out.println("ya did it");
//        else if (userChoice == 3)
//        {
//            CPU cpu = new CPU(10);
//            os.PS();
//        }
        
        //os.start();

    }
    
    
}
