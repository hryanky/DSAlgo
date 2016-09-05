/*Given a linked list which is sorted, how will you insert in sorted way*/
package LinkedList;

public class AddNodeSortedLinkedlist {
	static int newNodeData = 2;
	public static void main(String[] args) {
		Node A = new Node(2);
		Node B = new Node(5);
		Node C = new Node(7);
		Node D = new Node(10);
		Node E = new Node(15);
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=null;
		Node head=addNode(A);
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	static Node addNode(Node head){
		
		Node firstNode = head;
		Node newNode = new Node(newNodeData);
		if(head==null || newNodeData<head.data){
			firstNode= newNode;
			firstNode.next=head;
			return firstNode;
		}
		while(head.next!=null){
			if(newNodeData<head.next.data){
				Node temp = head.next;
				head.next=newNode;
				newNode.next=temp;
				return firstNode;
			}
			head=head.next;
		}
		head.next=newNode;
		return firstNode;
	}
}
