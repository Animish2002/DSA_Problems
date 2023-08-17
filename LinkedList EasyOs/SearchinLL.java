import java.util.Scanner;

public class SearchinLL {
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
		}
		return head;
	}

	public static void searchinLL(Node<Integer> head, int i) {
		int count=0;
		Node<Integer> temp=head;
		while(count!=i && temp!=null)
		{
			temp=temp.next;
			count++;
		}
		if( count==i &&temp!=null)
			System.out.println(temp.data);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = takeInput();
		searchinLL(newNode, 2);
	}
}

//
//public static int searchInLinkedList(Node head, int k)
//{
//	Node temp = head;
//	if(head.data==k){
//		return 1;
//	}
//	while(temp != null){
//		if(temp.data==k){
//			return 1;
//		}
//		else{
//			temp = temp.next;
//		}
//	}
//	return 0;
//}