/*if first list is 5->7->17->13->11 and second is 12->10->2->4->6, 
 * the first list should become 5->12->7->10->17->2->13->4->11->6 and second list should become empty
 * 
 * if the first list is 1->2->3 and second list is 4->5->6->7->8, 
 * then first list should become 1->4->2->5->3->6 and second list to 7->8.*/

package LinkedList;

public class AddAlternateNodes {

	public static void main(String[] args) {
		Node A = new Node(5);
		Node B = new Node(7);
		Node C = new Node(17);
		Node D = new Node(13);
		Node E = new Node(11);
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=null;

		Node F = new Node(12);
		Node G = new Node(10);
		Node H = new Node(2);
		Node I = new Node(4);
		Node J = new Node(6);
		F.next=G;
		G.next=H;
		H.next=null;
//		I.next=J;
//		J.next=null;
		
		updateFirstLL(A,F);
	}

	static void updateFirstLL(Node head1, Node head2){
		Node h1=head1;
		Node h2;
		Node prevEnd  = null;
		if(head1==null){
			return;
		}
		while(head1!=null){
			if(head2==null){
				break;
			}
			Node tempFirstNext=head1.next;
			Node tempSecondNext = head2.next;
			
			head1.next=head2;
			head2.next=tempFirstNext;
			head1=tempFirstNext;
			head2=tempSecondNext;
		}
		h2=head2;
		System.out.println("First List : ");
		while(h1!=null){
			System.out.println(h1.data);
			h1=h1.next;
		}
		System.out.println("Second List : ");
		while(h2!=null){
			System.out.println(h2.data);
			h2=h2.next;
		}
	}
}
