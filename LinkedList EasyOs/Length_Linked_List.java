import java.util.Scanner;

public class Length_Linked_List {
	public static Node<Integer> takeInput() {

		Scanner sc = new Scanner(System.in);
		Node <Integer> head = null , tail = null;
		int data = sc.nextInt();

		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
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
	
	public static int lengthofLL(Node <Integer> head) {
		
		int length = 0;
		while(head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		System.out.println(lengthofLL(head));
		

	}

}
