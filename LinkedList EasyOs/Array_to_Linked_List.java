
public class Array_to_Linked_List {
	// Representation of a node
	public static class Node
	{
		int data;
		Node next;
	};
	static Node root;
	
	public static Node insert(Node root, int item)
	{
		Node temp = new Node();
		temp.data = item;
		temp.next = root;
		root = temp;
		return root;
	}
	
	public static void display(Node root)
	{
		while (root != null)
		{
			System.out.print(root.data + " ");
			root = root.next;
		}
	}
	
	
	public static Node arrayToList(int arr[], int n)
	{
		root = null;
		for (int i = n - 1; i >= 0 ; i--)
			root = insert(root, arr[i]);
		return root;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		Node root = arrayToList(arr, n);
		display(root);
	}

}
