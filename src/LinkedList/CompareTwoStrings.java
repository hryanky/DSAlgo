/*Input: list1 = g->e->e->k->s->a
       list2 = g->e->e->k->s->b
Output: -1

Input: list1 = g->e->e->k->s->a
       list2 = g->e->e->k->s
Output: 1

Input: list1 = g->e->e->k->s
       list2 = g->e->e->k->s
Output: 0
*/
package LinkedList;

public class CompareTwoStrings {

	public static void main(String[] args) {
		Node A = new Node('g');
		Node B = new Node('e');
		Node C = new Node('e');
		Node D = new Node('k');
		Node E = new Node('s');
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=null;
		
		Node F = new Node('g');
		Node G = new Node('e');
		Node H = new Node('e');
		Node I = new Node('k');
		Node J = new Node('s');
		Node K = new Node('3');
		Node T = new Node('5');
		F.next=G;
		G.next=H;
		H.next=I;
		I.next=J;
		J.next=K;
		K.next=null;
//		T.next=null;

		System.out.println(compare(A,F));
	}

	static int compare(Node head1,Node head2){
		while(head1!=null && head2!=null){
			if(head1.data!=head2.data){
				return -1;
			}
			head1=head1.next;
			head2=head2.next;
		}
		if(head1!=null && head2!=null && head1.next==null && head2.next==null){
			return ((head1.data>head2.data)?1:-1);
		}
		if((head1!=null && head2==null && head1.next==null) || (head2!=null && head1==null && head2.next==null)){
			return (-1);
		}
		
		if(head1!=null && head1.next!=null || (head2!=null && head2.next!=null)){
			return -99;
		}
		
		return 0;
	}
}
