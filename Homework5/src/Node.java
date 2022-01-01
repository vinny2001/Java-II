// Vincenzo D'Aria
// CS-152-02
// Homework 5 - Node Class


// Node Class
public class Node implements NodeInterface {
	//Class variables to represent each node and the data within
	int data;
	Node next;

	//Constructor for Node
	Node(int data) {
		this.data = data;
		this.next = null;
	}

	//Polymorphed Constructor for test harness
	Node() {
		this.next = null;
	}

	//Determines if a Node is empty
	public boolean isEmpty() {
		//If the next node is null, its empty
		if (this.next == null) {
			return true;
		} else {
			//If not, it has contents (its false)
			return false;
		}
	}

	//Getter for each instance of data in a node
	@Override
	public int getData() {
		return this.data;
	}

	//Setter for each instance of data in a node
	@Override
	public void setData(int data) {
		this.data = data;
	}

	//Determines if there are nodes after the current element
	@Override
	public boolean hasNext() {
		//if the current node is null, then nothing follows it (it's the tail)
		if (this.next != null) {
			return true;
		} else {
			// if not, then more nodes follow
			return false;
		}
	}

	//Determines the length (number of elements) in a node
	@Override
	public int length() {
		//if the next node after the head is null, return a length of zero
		if (this.next == null) {
			return 0;
		} else {
			//return number of elements in stack trace
			return 1 + next.length();
		}
	}

	//Inserts new node at given position
	@Override
	public void insert(Node newNode, int position) {
		//temporary node to traverse the stack
		Node temp = this;
		int index = 0;
		//taverse the stack
		while (index < position) {
			temp = temp.next;
			index++;
		}
		//Places node in its given position
		newNode.next = temp.next;
		temp.next = newNode;
	}

	//Places data in a given node at a given position
	@Override
	public void insert(int data, int position) {
		//new node created with given data
		Node newNode = new Node(data);
		//Same code as previous insert method implemented here
		insert(newNode, position);
	}

	//Deletes a given node in a certain position of the stack 
	@Override
	public Node delete(int position) {
		//temp node created to traverse the stack
		Node temp = this;
		//if the stack is empty, exit
		if (this.isEmpty()) {
			System.exit(0);
		}
		int index = 0;
		//traverses stack for the given length of the stack and if the next node isn't null
		while (index < position && temp.next != null) {
			temp = temp.next;
			index++;
		}
		//defines the removed node and returns it
		Node removed = temp.next;
		temp.next = temp.next.next;
		return removed;
	}

	//Code to print a given Node
	@Override
	public void print() {
		//temp node created to traverse data
		Node temp = this.next;
		//Before stack ends, traverse it and print the data within each stack
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	//Polymorphed version of print to account for data inputs
	public int print(int data) {
		this.print();
		//data is returned
		return data;
	}

	//Polymorhed version of print to print contents on a new line
	@Override
	public void println() {
		this.print();
		//Prints on a new line
		System.out.println("\n");
	}

	//main method included for testing only.
	/*
	public static void main(String[] args) {
		Node head = new Node();
	
		head.insert(4, 0);
		head.insert(3, 0);
		head.insert(2, 0);
		head.insert(1, 0);
		head.insert(0, 0);
	
		System.out.print("Expected: 0, 1, 2, 3, 4    Actual: ");
		head.println();
		Node removed = head.delete(2);
		System.out.println("Removed: " + removed.getData());
		System.out.print("Expected: 0, 1, 3, 4    Actual: ");
		head.println();
		System.out.print("Expected length=4,  actual.length() = ");
		System.out.print(head.length());
	
	}
	*/

}// End Node Class
