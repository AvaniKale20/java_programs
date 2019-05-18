package com.bridge.datastructure;

import java.util.NoSuchElementException;

class Node
{
	int data;
	Node next;
	
	Node()
	{
		data = 0;
		next = null;
	}
	
	Node(int d, Node n)
	{
		data = d;
		next = n;
	}
	//set function use for set data to current node
	public void setNode(int d)
	{
		data = d;
	}
	//set the node to next nod4e
	public void setNext(Node n)
	{
		next = n;
	}
	
	public int getNode()
	{
		return data;
	}
	
	public Node getNext()
	{
		return next;
	}
}
//class of cash counter
public class CashCounter {
	
	public Node front, rear;
	public int size;
	//constructor called
	public CashCounter() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return front == null && rear == null;
	}
	
	public int getSize() {
		
		return size;		
	}
	
	public void insert(int data) 
	{
		Node newnode = new Node(data,null);
		
		if(rear == null)
		{
			front = newnode;
			rear = newnode;
		}
		else
		{
			rear.setNext(newnode);
			rear = rear.getNext();
		}
		size++;
	}
	
	public void remove()
	{
		if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        Node ptr = front;
        front = ptr.getNext();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
		}
		
		int data = front.getNode();
		return data;
		
	}
	
	public void display()
	{
		int ptr1 = 0;
		
		if(size == 0)
		{
			System.out.println("Empty");
		}
		
		Node ptr = front;
		
		while(ptr != rear.getNext())
		{
			ptr1 = ptr1+ptr.getNode();
			System.out.println(ptr1);
			
			ptr = ptr.getNext();
		}
		System.out.println();
	}
}