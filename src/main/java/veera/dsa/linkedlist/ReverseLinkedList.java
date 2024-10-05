package veera.dsa.linkedlist;

public class ReverseLinkedList {
//	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		
		  @Override public String toString() { return "Node[d=" + data + ", n=" + next
		  + "]."; }
		 
		
	}

	static Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		System.out.println();
		System.out.println();
		while (current != null) {//85 -> 15 -> 4 -> 20 -> null 
			next = current.next;//15,4,20,null
			
//			if (current.next == null) {
//				System.out.print("current.next is null");
//			} else {
//				System.out.print("current.next-" + current.next.data);
//			}
			
			current.next = prev;//null,85,15,4
			prev = current;//85,15,4,20
			current = next;//15,4,20,null
			
			
//			if (next != null) {
//				System.out.print (" next-"+next.data );
//			}else {
//				System.out.print(" next-null");
//			}
//			if (prev != null) {
//				System.out.print( " prev-"+prev.data  );
//			} else {
//				System.out.print(" prev-null");
//			}
//			if (current != null) {
//				System.out.print( " current-"+current.data );
//			}else {
//				System.out.print(" current-null");
//			}
			System.out.println();
		}
		node = prev;
		return node;
	}

	public static void main(String[] args) {
		Node head = new Node(85);
		head.next = new Node(15);
		head.next.next = new Node(4);
		head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		printList(head);
		head = reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		printList(head);
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
