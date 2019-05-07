class Linked_list
{
	Node head;// u have to assume that 1st node is head
	
	class Node
	{
		int data;
	Node next =null;
		
	//constructor 
	//to create a node
	Node(int d)
	{
		data=d;
		next=null;
	}
	}
	//u have to insert the data
	public void insert(int data)
	{
		//u have to create new node
		Node n=new Node(data);
		//pass the value
		n.data=data;
		n.next=null;
		
		//u have to chk if there is any node or not
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node node=head;
			while(node.next!=null)
			{
				node=node.next;	
			}
			node.next=n;
		}
	}
	public  void insertAtStart(int d)
	{
		Node n11=new Node(d);
		n11.data=d;
		n11.next=null;
		n11.next=head;
		head=n11;
		
		
	}
	public void insertAt(int index,int d)
	{
		Node no=new Node(d);
		no.data=d;
		no.next=null;
		Node n=head;
		for(int i=0;i<index-1;i++)
			
		{
		n=n.next;
		}
		no.next=n.next;
		n.next=no;
	}
	public void show()
	{
		Node n1=head;
	while(n1.next!=null)
	{
		System.out.println(n1.data);
		n1=n1.next;
	}System.out.println(n1.data);
}
	public static void main(String[]arga)
	{ Linked_list list=new Linked_list();
	list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insertAtStart(25);
	list.insertAt(2,55);
	list.show();
	}
	}