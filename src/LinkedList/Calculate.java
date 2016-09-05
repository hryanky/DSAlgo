package LinkedList;

public class Calculate {
	static int sum =0,carry=0,count=0;
	public static void main(String[] args) {
		Node A = new Node(4);
		Node B = new Node(4);
		Node C = new Node(9);
//		Node D = new Node(10);
//		Node E = new Node(15);
		A.next=B;
		B.next=C;
		C.next=null;
//		D.next=E;
//		E.next=null;
		
		Node F = new Node(5);
		Node G = new Node(5);
		Node H = new Node(7);
//		Node D = new Node(10);
//		Node E = new Node(15);
		F.next=G;
		G.next=H;
		H.next=null;
//		D.next=E;
//		E.next=null;
		Node h1 = A;
		Node h2= F;
		int count1=0,count2=0;
		while(h1!=null){
			h1=h1.next;
			count1++;
		}
		while(h2!=null){
			h2=h2.next;
			count2++;
		}
		if(count1==count2){
			sum=calculate(A,F);
			if(carry!=0){
				sum=(int) (carry*(Math.pow(10, count))+sum);
			}	
			System.out.println(sum);
		}
		//calculate(A,F);
	}

	static int calculate(Node head1,Node head2){
		if(head1==null && head2==null){
			return 0;
		}
		if(head1!=null && head2!=null){
			
			calculate(head1.next, head2.next);
			int temp=(carry+head1.data+head2.data);
			int num=temp%10;
			carry=temp/10;
			sum=(int) (num*(Math.pow(10, count))+sum);
			count++;
		}
	
		return sum;		
	}
}
