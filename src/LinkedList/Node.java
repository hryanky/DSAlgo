package LinkedList;

class Node {

	boolean visited=false;
	int data;
	String character;
	Node(int data){
		this.data=data;
	}
	Node(String data){
		this.character=data;
	}
//	void createLinkedList(int data){
//		new Node(data);
//	}
	Node next;
}
