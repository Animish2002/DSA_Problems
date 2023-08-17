import java.util.Scanner;

public class InsertNewNode {
	public static void insertNode(Node<Integer> head, int data, int position) {
		Node <Integer> newNode = new Node<Integer>(data);
		if(position == 0) {
			newNode.next = head ;
			//			head = newNode;
			return;
		}

		int i=0;
		Node <Integer> temp = head;

		while( i < position - 1 ) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public static void printLinkedList(Node <Integer> head) {
		while( head != null ) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	public static Node<Integer> takeInput(){

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail =null;

		while(data != -1) {
			Node <Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;			
			}
			data=sc.nextInt();
			sc.close();
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = takeInput();
		insertNode(newNode, 2, 1);
		printLinkedList(newNode);
		
	}
}
