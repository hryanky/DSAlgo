package LinkedList;

public class ReverseInKSlots {
	static int N = 5;
	public static void main(String[] args) {
		Node A = new Node(1);
		Node B = new Node(2);
		Node C = new Node(3);
		Node D = new Node(4);
		Node E = new Node(5);
		Node F = new Node(6);
		Node G = new Node(7);
		Node H = new Node(8);
		
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=F;
		F.next=G;
		G.next=H;
		
		Node newHead=reverse(A);
		while(newHead!=null){
			System.out.println(newHead.data);
			newHead=newHead.next;
		}
	}

	static Node reverse(Node head){
		Node newHEad=null,prev = null,temp1=null,temp2=null;
		int count=0,nextcount=0;
		//boolean flag=false;
		//if(temp1==null){
			temp1=head;
		//}
		
		while(head!=null){
			Node nextNode = head.next;
			head.next=prev;
			prev=head;
			head=nextNode;
			count++;
			nextcount++;
			if(count==N){
				if(newHEad==null){
					newHEad=prev;
				}
				
				if(nextcount!=count){
					nextcount=count;
					temp1.next=prev;
					temp1=temp2;
					//temp2=head
				}
				count=0;
				temp2=head;
			}
			
		}
		if(newHEad==null){
			newHEad=prev;
			temp1.next=null;	
			return newHEad;	
		}else if (count!=0) {
			temp1.next = prev;
			if (temp2!=null) {
				temp2.next = null;
			}
			return newHEad;	
		}else
		temp1.next=null;	
		return newHEad;		
	}
}
