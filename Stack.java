public class Stack
{
	private class Node
	{
		private double item;
		private Node link;

	public Node()
	{
		//item = null;
		link = null;
	}
	public Node(double newItem, Node linkValue)
	{
		item=newItem;
		link=linkValue;
	}

}//End of Node inner class

private Node head;

	public Stack()
	{
		head=null;
	}

	public void push(double itemName)
	{
		head= new Node(itemName, head);
	}
	public double pop()
	{
		if(head==null)
			throw new IllegalStateException();
		else
		{
			double returnItem = head.item;
			head=head.link;
			return returnItem;
		}
	}

	public boolean isEmpty()
	{
		return(head==null);
	}

	public boolean isPrime(double num)
	{
		for (double i = 2; i <= num/2; i++)
		{
			if(num % i == 0 )
			{
				return false;
			}
		}

				return true;
	}
}