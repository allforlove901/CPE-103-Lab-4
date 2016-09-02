import java.io.*;
import java.util.*;

public class LQueueDriver{
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	LQueue<Integer> queue = new LQueue<Integer>();
    	
    	boolean quit = false;
    	
    	System.out.println("enqueue/add (enter the letter a)");
    	System.out.println("dequeue/delete (enter the letter d)");
    	System.out.println("check if the list is empty (enter the letter e)");
    	System.out.println("quit (enter the letter q)");
    	
    	while(!quit){
    		int store = 0;
    		String input = sc.nextLine();
    		switch(input){
    		case"a":
    			System.out.println("please enter value to add");
    			if(sc.hasNextInt()){
    				store = Integer.parseInt(sc.nextLine()); 
    			}else{
    				System.out.println("invalid input");
    			}
    			queue.enqueue(store);
    			System.out.println(store + " has been enqueued");
    			break;
    			
    		case"d":
    			try{
    				System.out.println(queue.dequeue() + " has been dequeued");
    				}
    				catch(Exception e) {
    					System.out.println("Invalid operation: the queue is empty");
    				}
    			break;
    		case"e":
    			System.out.println(queue.isEmpty());
    			break;
    		case"q":
    			quit = true;
    			int size = queue.getSize();
    			for (int i = 0; i <size; i++){
    			    System.out.print(queue.dequeue() + " ");
    			}
    			break;
    		default:
    			System.out.println("invalid choice");
    			break;
    		}
    	}
    }
}