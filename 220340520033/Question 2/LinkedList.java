import java.util.Scanner;
class LinkedList
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;

	
		Node(int num)
		{
			data=num;
			next=null;
		}
	}
	
	void addNode(int data)
	{
		Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				Node temp=head;
					
					while(temp.next!=null)
					{
						temp=temp.next;
					}
					temp.next=new_node;
			}
	}
	Node reverse(Node node)
	{
		Node previous=null;
		Node live=node;
		Node next=null;
		
			while(live != null)
			{
				next=live.next;
				live.next=previous;
				previous=live;
				live=next;
			}
			
			node = previous;
			return node;
	}
	
	void display(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		Scanner sc =new Scanner(System.in);
		
			int testcase=sc.nextInt();
			
				for(int i=0;i<testcase;i++)
				{
					int numm=sc.nextInt();
					
					for(int j=0;j<numm;j++)
					{
						int number=sc.nextInt();
						l.addNode(number);
					}
					head=l.reverse(head);
					l.display(head);
				}
	}
	
	
}