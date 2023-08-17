import java.util.HashSet;

public class Detect_Cycle {
	public static Node<Integer> insertNode(Node<Integer> head,int val) {
		Node<Integer> newNode = new Node<Integer>(val);
	    
	    if(head == null) {
	        head = newNode;
	        return head;
	    }
	    
	    Node<Integer> temp = head;
	    while(temp.next != null) temp = temp.next;
	    
	    temp.next = newNode;
	    return head;
	}

	//utility function to create cycle
	public static void createCycle(Node<Integer> head,int a,int b) {
	    int cnta = 0,cntb = 0;
	    Node<Integer> p1 = head;
	    Node<Integer> p2 = head;
	    while(cnta != a || cntb != b) {
	        if(cnta != a) 
	        {p1 = p1.next; ++cnta;}
	        if(cntb != b) 
	        {p2 = p2.next; ++cntb;}
	    }
	    p2.next = p1;
	}
	public static boolean detectCycle1(Node<Integer> head) {
		HashSet<Node> st = new HashSet<>();
		while(head != null) {
			if(st.contains(head)) {
				return true;
			}
			st.add(head);
			head=head.next;
		}
		return false;
	}
	public static boolean detectCycle2(Node<Integer> head){
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next != null && fast.next.next != null){
		fast = fast.next.next;
	        slow = slow.next;
		if(slow==fast){
		return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		 Node<Integer> head = null;
		    head=insertNode(head,1);
		    head=insertNode(head,2);
		    head=insertNode(head,3);
		    head=insertNode(head,4);
		    createCycle(head,1,3);//creating cycle in the list
		    if(detectCycle2(head) == true)
		    System.out.println("Cycle detected");
		    else
		    System.out.println("Cycle not detected");
	}

}
