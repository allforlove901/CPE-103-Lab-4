import java.util.List;
import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.*;
import java.io.*;

public class LQueue<T> {
	
	private Node front, end;
    private List<Node> queue;
    private int size = 0;
	
	public class Node{
		
		public T element;
		public Node next;
		
		public Node(T e, Node n){
			element = e;
			next = n;
		}
	}
	
	public static class MyException extends RuntimeException{
		
		public MyException(){
			super();
		}
		
		public MyException(String exception){
			super(exception);
		}
	}
		
	public LQueue(){
		queue = new LinkedList<Node>();
	}
	
	public void enqueue(T value){
		if (isEmpty()){
			Node newNode = new Node(value, null);
			front = newNode;
			end = newNode;
		}else{
			Node storeEnd = end;
			Node n = new Node(value,null);
			storeEnd.next = n;
			end = n;
		}
		size++;
	}
	
	public T dequeue(){
		if(isEmpty()){
			throw new MyException("empty");
		}else{
			T store = front.element;
			front = front.next;
			size--;
			return store;
		}
	}
	
	public boolean isEmpty(){
		if(getSize() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public int getSize(){
		return size;
	}
}
