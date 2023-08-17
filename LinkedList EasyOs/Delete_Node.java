import java.util.Scanner;

public class Delete_Node {
	public static Node<Integer> deleteNode(Node<Integer> head, int i){
		
		
		if(i==0)
			return head.next;
		
		int count = 0 ;
		Node<Integer> temp = head;
		
		while(temp != null && count < i-1) {
			temp = temp.next;
			count++;
		}
		if(temp == null) {
			return head;
		}
		if(temp.next != null) {
			temp.next = temp.next.next;


		}
		return head;
	}

	public static void printList(Node<Integer> head) {
		while(head != null) {
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
		deleteNode(newNode, 2);
		printList(newNode);
	}

}
