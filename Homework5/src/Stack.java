// Vincenzo D'Aria
// CS-152-02
// Homework 5 - Stack Functionality/ Test harness


// Stack class created
public class Stack extends Node {

	//Pushes new element onto top of stack
	public Node push(int data) {
		//New node created to represent the new element on stack
		Node newNode = new Node(data);
		//The next element on the stack defined as the new node being pushed onto it
		newNode.next = this.next;
		this.next = newNode;
		return newNode;
	}

	//Removes element from top of stack
	public Node pop() {
		//if the stack trace is empty, return null
		if (isEmpty()) {
			System.out.println("The return value is 'null', program did not crash!!!");
			return null;
		} else {
			//temp defines the value after temp.next to be the new first value; the first element is removed
			Node temp = this;
			this.next = this.next.next;
			return temp;
		}
	}

	//Returns the first element of the stack without removing that element
	public Node peek() {
		//If the stack trace is empty, returns null
		if (isEmpty()) {
			return null;
		} else {
			//temp represents the node at the top of the stack
			Node temp = new Node(this.next.data);
			return temp;
		}
	}

	//returns the size of the stack trace
	public int size() {
		//implements the length method from Node
		this.length();
		//Length + 1 to account for the first Node being element 0
		return this.next.length() + 1;
	}

	//test harness (main method)
	public static void main(String[] args) {

		//creates a new Node (Stack) named head
		Stack head = new Stack();

		//Inserts four base elements into head
		head.insert(4, 0);
		head.insert(3, 0);
		head.insert(2, 0);
		head.insert(1, 0);
		head.insert(0, 0);

		//Pushes the following elements onto the top of head's stack
		head.push(2);
		head.push(3);
		head.push(4);
		head.push(5);

		//Prints the number of nodes in the stack
		System.out.println("Size");
		System.out.println("--------------------");
		System.out.println("Expected: 9");
		System.out.print("Number of Nodes: ");
		System.out.print(head.size());
		System.out.println("\n");

		//Testing the push functionality
		System.out.println("Push:");
		System.out.println("--------------------");
		System.out.println("Expected: 543201234");
		System.out.print("Actual: ");
		head.print();

		//Creating node to represent the peek process
		Node peek = head.peek();
		System.out.println("\n\nPeek:");
		System.out.println("--------------------");
		System.out.println("Expected: 5");
		System.out.print("Actual: ");
		//prints out the data from the top element of peek
		System.out.print(peek.data);

		//Popping all 9 Nodes from the stack 
		head.pop();
		head.pop();
		head.pop();
		head.pop();
		head.pop();
		head.pop();
		head.pop();
		head.pop();
		head.pop();

		//Testing pop functionality
		System.out.println("\n\nPop:");
		System.out.println("--------------------");
		System.out.println("Expected: (Should be blank) ");
		System.out.print("Actual: ");
		head.print();

		//Testing the isEmpty() functionality
		System.out.println("\n\nChecking if emptyStack is empty:");
		System.out.println("-------------------------------");
		//creating a new Node (Stack) that is empty
		Stack emptyStack = new Stack();
		//if the stack is empty, print the message instead of NullPointerException being thrown
		if (emptyStack.isEmpty()) {
			System.out.println("This stack is Empty");
		}

		//Testing the outcome of popping an empty stack 
		System.out.println("\nAttempting to pop an empty stack:");
		System.out.println("----------------------------------");
		emptyStack.pop();
		emptyStack.print();

	}

}
