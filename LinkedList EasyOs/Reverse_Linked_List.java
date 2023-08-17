import java.util.Scanner;

public class Reverse_Linked_List {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail =null;
		Scanner sc = new Scanner(System.in);

		int data = sc.nextInt();

		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> reverseR(Node<Integer> head) {

	    if (head == null || head.next == null) {
	        return head;
	    }

	    Node<Integer> finalHead = reverseR(head.next);
	    Node<Integer> temp = finalHead;

	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = head;
	    head.next = null; // Fix: Set the next of 'head' to null

	    return finalHead;
	}

	
	public static Node<Integer> reverseI(Node<Integer>  head){
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> temp;
		
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	public static void printLL(Node<Integer> head) {
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
			}
			System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = takeInput();
		newNode = reverseI(newNode);
		printLL(newNode);
	}

}
