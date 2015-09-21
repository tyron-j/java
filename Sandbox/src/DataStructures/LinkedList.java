package DataStructures;

public class LinkedList {
	// to-do: currently only supports integers
	public class Node {
		public int Data;
		public Node Next;
		
		public Node(int Data) {
			this.Data = Data;
		}
	}
	
	public Node FirstNode;
	public int Length = 0;
	
	public LinkedList(int FirstNodeData) {
		this.FirstNode = new Node(FirstNodeData);
		
		this.Length++;
	}
	
	public void Add(int NewNodeData) {
		Node CurrentNode = this.FirstNode;
		Node NewNode = new Node(NewNodeData);
		
		while (CurrentNode.Next != null) {
			CurrentNode = CurrentNode.Next;
		}
		
		CurrentNode.Next = NewNode;
		
		this.Length++;
	}
	
	public void Iterate() {
		Node CurrentNode = this.FirstNode;
		
		System.out.print("The linked list items are: " + CurrentNode.Data);
		
		while (CurrentNode.Next != null) {
			CurrentNode = CurrentNode.Next;
			
			System.out.print(", " + CurrentNode.Data);
		}
		
		System.out.println();
	}
}
