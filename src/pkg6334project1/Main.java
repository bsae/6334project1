/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6334project1;
import java.io.*;
import java.util.*;
/**
 *
 */
public class Main {


    public static void main(String[] args) {
        BubbleSort();
        System.out.print("Bubblesort complete");
        
//        File input = new File("C:\\Users\\Chen\\Documents\\Git\\6334project1\\src\\pkg6334project1\\input.txt");
//        //
//
//        // use scanner from java.util library to read through each line
//        // it breaks up one line into 4 lines, it looks like it  splits the empty strings
//        try(Scanner sc = new Scanner(input)) {
//            // int i = 0;
//            PCB tempPCB = new PCB();
//
//            String seq;
//            while (sc.hasNext()) {
//                String seqString = "";
//                //make new PCB, store stuff from file into this PCB
//                
//                //SHIT DON'T WORK RN
//                tempPCB = new PCB();
//                tempPCB.ID = Integer.parseInt(sc.next());
//                tempPCB.arrivalOrder = Integer.parseInt(sc.next());
//                tempPCB.priority = Integer.parseInt(sc.next());
////            	tempPCB.ID = sc.nextInt();
////            	tempPCB.arrivalOrder = sc.nextInt();
////            	tempPCB.priority = sc.nextInt();
//                
//                //store next big int into some int seq, convert to string,
//                //loop through string, storing digits into int array
//                seq = sc.next();
//                seqString = String.valueOf(seq);
//                for (int j = 0; j < seqString.length(); ++j)
//                {
//                    tempPCB.burstSeq.add((Character.getNumericValue(seqString.charAt(j))));
//                    //tempPCB.burstSeq.add(Integer.getInteger(seqString.indexOf(j)));
//                }
//                System.out.println(tempPCB.burstSeq + " " + tempPCB.ID);
//            }
//        } catch (FileNotFoundException e) {
//            // handle
//        }


    }
    
    //FIX BUBBLESORT!!
    public static void BubbleSort() {
        ArrayList<Integer> listToSort = rng(800);

        for (int i = 0; i < listToSort.size() - 1; ++i) {
            for (int j = 0; j < listToSort.size() - 1; ++j) {
                if (listToSort.indexOf(j) > listToSort.indexOf(j + 1)) {
                    //Collections.swap(listToSort, listToSort.get(j), listToSort.get(j + 1));
                    listToSort.set(j, listToSort.get(j+1));
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
