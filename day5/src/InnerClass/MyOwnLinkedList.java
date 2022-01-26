package InnerClass;

class LinkedList{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head,tail=null;
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		Node currNode = head;
		if(currNode==null) {
			System.out.println("LL is empty...");
			return;
		}
		while(currNode!=null) {
			System.out.print(currNode.data+ "-> ");
			currNode = currNode.next;
		}
	}
}

public class MyOwnLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		
		list.display();
	}
}
