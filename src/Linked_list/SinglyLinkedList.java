package Linked_list;

public class SinglyLinkedList {
	class Node{
		int data; //class variable
		Node next;
		public Node(int data) { //Parameter
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void insertAtBeginning(int data) {
		// insert the data
	    Node new_node = new Node(data);
	    new_node.next = head;
	    head = new_node;

	}
	public void insertAtEnd(int data) {
		 Node new_node = new Node(data);
		 if(head==null) {
			 head=new_node;
			 tail=new_node;
			 return;
		 }
		 tail.next=new_node;
		 tail=new_node;
	}
	// Delete a node
	  void deleteNode(int position) {
	    if (head == null)
	      return;
	    Node temp = head;
	    if (position == 0) {
	      head = temp.next;
	      return;
	    }
	   
	 // Find the key to be deleted
	    for (int i = 0; temp != null && i < position - 1; i++)
	      temp = temp.next;
	    // If the key is not present
	    if (temp == null || temp.next == null)
	      return;

	    // Remove the node
	    Node next = temp.next.next;
	    temp.next = next;
	  }
	// Delete a node
		  void deleteNode1(int element) {
		    if (head == null)
		      return;
		    Node temp = head;
		 // Find the key to be deleted
		    while(temp != null) {
		    	if(temp.data==element) 
		    		break;
		    	else
		      temp = temp.next;
		    	
		    }
		    // If the key is not present
		    if (temp == null || temp.next == null)
		      return;

		    // Remove the node
		    Node next = temp.next.next;
		    temp.next = next;
		  }

	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Nodes of Singly Linked List: ");
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("Node Completed");
		}
		//System.out.println("Finish");
	}
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.display();
		sl.addNode(1);
		sl.addNode(2);
		sl.insertAtBeginning(10);
		
		sl.insertAtEnd(100);
		sl.addNode(3);
		sl.addNode(4);
		
		sl.insertAtBeginning(20);
		sl.display();
		sl.deleteNode(3);
		sl.insertAtEnd(200);
		sl.deleteNode1(100);
		sl.display();
	}


	}


