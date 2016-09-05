package LinkedList;

public class FindLoop {

	public static void main(String[] args) {
		Node A = new Node(1);
		Node B = new Node(2);
		Node C = new Node(3);
		Node D = new Node(4);
		Node E = new Node(5);
//		Node F = new Node(6);
//		Node G = new Node(7);
//		Node H = new Node(8);
		
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=null;
		
		System.out.println(find(A));

		while(A!=null)
		{
			System.out.println(A.data);
			A=A.next;
		}
	}

	static boolean find(Node head){
		Node start = head;
		while(start!=null){
			start.visited=true;
			if(start.next!=null && start.next.visited==true){
				start.next=null;
				return true;
				
			}
			start=start.next;
			
		}
		return false;
	}
}
