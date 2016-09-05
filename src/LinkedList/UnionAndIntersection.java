package LinkedList;

public class UnionAndIntersection {

	public static void main(String[] args) {
		Node A = new Node(4);
		Node B = new Node(10);
		Node C = new Node(15);
		Node D = new Node(20);
		
		Node E = new Node(2);
		Node F = new Node(4);
		Node G = new Node(8);
		Node H = new Node(10);
		
		A.next=B;
		B.next=C;
		C.next=D;
		
		E.next=F;
		F.next=G;
		G.next=H;

		unionIntersection(A,E);
	}

	static void unionIntersection(Node head1,Node head2){
		//sort both given linkedlist
		Node unionList,intersectionList,newHead1 = null,newHead2 = null,unionHEad=null,intersectionHEad=null;
		while(head1!=null && head2!=null){
			if(head1.data==head2.data){
				if(newHead1==null){
					
					newHead1=head1;
					unionHEad=newHead1;
					head1=head1.next;
					newHead1.next=null;
				}else{
					newHead1.next=head1;
					
					newHead1=head1;
					
					head1=head1.next;
					newHead1.next=null;
				}
				if(newHead2==null){
					intersectionHEad=newHead2;
					newHead2=head2;
					head2=head2.next;
				}else{
					newHead2.next=head2;
					
					newHead2=head2;
					
					head2=head2.next;
				}
			}else if(head1.data<head2.data){
				if(newHead2==null){
					newHead2=head2;
					intersectionHEad=newHead2;
				}else{
				newHead2.next=head1;
				newHead2=head1;
				
				}
				head1=head1.next;
			}else if(head1.data>head2.data){
				if(newHead2==null){
					newHead2=head2;
					intersectionHEad=newHead2;
				}else{
				newHead2.next=head2;
				newHead2=head2;
				
				}
				head2=head2.next;
			}
			
			
		}
		
		while(head1!=null){
			newHead2.next=head1;
			newHead2=head1;
			head1=head1.next;
		}
		while(head2!=null){
			newHead2.next=head2;
			newHead2=head2;
			head2=head2.next;
		}
		
		System.out.println("Union List is :");
		while(unionHEad!=null){
			System.out.println(unionHEad.data);
			unionHEad=unionHEad.next;
		}
		System.out.println("Intersection List is :");
		while(intersectionHEad!=null){
			System.out.println(intersectionHEad.data);
			intersectionHEad=intersectionHEad.next;
		}
	}
}
