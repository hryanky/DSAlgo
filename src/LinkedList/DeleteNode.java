package LinkedList;

public class DeleteNode {

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
		deleteNode(A,5);
		Node head=A;
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	static void deleteNode(Node head,int num){
		Node temp;
		if(num==1){
			temp=head.next;
			head=temp;
			return;
		}else{
			int count=1;
			while(head.next.next!=null){
				if(count==num-1){
					temp=head.next.next;
					head.next=temp;
					//break;
					return;
				}
				head=head.next;
				count++;
			}
			if (count>=num-1) {
				head.next = null;
			}
		}
		
	}
}
