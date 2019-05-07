package Com.Bridge.DataStructure;




public class Stack<T>
{  Node head;
	public static int top=-1;
//public static int stack[]=new int[50];
public class Node<T>
{
	T data;
	Node<T> next;
	
	Node(T d)
	{
		data=d;
		next=null;
	}
}

/*************************************************************
 * param char   : it take character as command line arguments
 * @param i     : this method used to push char 
 * return       : void  
 */
	public  void push(T data)
	{ 
		Node n=new Node(data);
	Node t=head;
	if(head==null)
	{
	head=n;
		top=top+1;
	
	}
	else
	{
		while(t.next!= null)
		{
			t=t.next;
		}
		t.next=n;
		top++;
		n.next=null;
	}
	}
	
	
	/***************************************************************
	 * @purpose   : This method is used to pop the value from object	 
     *    @return    : void 
	 * 
	 */
	public String  pop()
	{
		Node current=head;
		head=current.next;
		top--;
		return (String) current.data;
		
	}
	/*****************************************************************
	 * @purpose : this method is used to check wheather stack is empty or not 
	 * @return : boolean
	 */
	public  boolean isEmpty()
	{return(head==null);
	}

	public int size()
	{
		return top;
	}
	public void display()
	{
		Node new_node = head;
		int size = size();
		for(int i = 0 ; i <size;i++)  //traverse till last
		{
			System.out.print(new_node.data+" ");
			new_node = new_node.next;
			
		}
		
	}
	
		public <T> T peek()
		{
			if(head == null)
			{
				System.out.println("No elements found");
				return null;
			}
	
			
			return (T) head.data;
		
		}
}
	

