import java.util.Scanner;

public class Middle_Element_of_LL {
	
	public static Node<Integer> middleElement(Node<Integer> head) {
		if (head == null)
			return null;

		Node<Integer> slow = head;
		Node<Integer> fast = head;

		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}


	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
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

	
	public static void main(String[] args) {
		 Node<Integer> newNode = takeInput();
		    Node<Integer> middleNode = middleElement(newNode);
		    
		    if (middleNode != null) {
		        System.out.println("Middle element data: " + middleNode.data);
		    } else {
		        System.out.println("The list is empty.");
		    }
	}
}
