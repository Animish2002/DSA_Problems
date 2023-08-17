import java.util.Scanner;

public class takeLinkedListInput {
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
	
	public static void printLinkedList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = takeInput();
		printLinkedList(newNode);
	}

}
