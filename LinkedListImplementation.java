class LinkedListImplementation
{
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.addAtLast(1);
		l.addAtLast(3);
		l.addAtLast(23);
		l.addAt(2,4);
		l.addAt(3,5);
		l.disp();
	}
	
}

class LinkedList
{
	Node head=null;
	public void addAtLast(int elem)
	{
		Node newNode=new Node(elem,null);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}



	public void addAt(int elem,int pos)
	{
		int counter=1;
		
		if(head==null)
		{
			System.out.println("The linked list is empty");
		}
		else
		{ 
			Node newNode=new Node(elem);
			Node temp=head;
			while(temp.next!=null)
			{
				
				counter++;
				if(counter==pos)
				{
					Node Tempo=temp.next;
					temp.next=newNode;
					newNode.next=Tempo;
				}
				temp=temp.next;

			}
			if(temp.next==null)
			{
				System.out.println("you are at the end of linked list calling addAtLast()");
				addAtLast(elem);

			}
			

		}

	}







	public void disp()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}

class Node
{
	int data;
	Node next;
	public Node(int data,Node next)
	{
		this.data=data;
		this.next=next;

	}
	public Node(int data)
	{
		this.data=data;
	}
	
}