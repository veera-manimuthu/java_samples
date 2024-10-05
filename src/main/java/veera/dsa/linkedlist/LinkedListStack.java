package veera.dsa.linkedlist;

//important import statement  
import java.util.Stack;

public class LinkedListStack {

	//first node or head of the list  
	static LinkedListNode head;

	static class LinkedListNode {
		//for containing the value of the node  
		int val;

		//the next pointer points to the other node of the list or null  
		LinkedListNode next;

		//constructor of the class  
		LinkedListNode(int d) {
			//assigning the values  
			val = d;
			next = null;
		}
	}

	//method where actual reversing of the list takes place  
	public LinkedListNode reverseList(LinkedListNode head, Stack<Integer> stk) {
	//if the head is null or the list  
	//contains only one element then reversing the list  
	//does not have any impact on the list. Therefore, we   
	//can return the original list without performing any operation  
		if (head == null || head.next == null) {
			return head;
		}

	//iterating over the list and putting the value of nodes  
	//into the stack stk  
		while (head != null) {
			stk.push(head.val);
			head = head.next;
		}

	//head1 refers to the first node of the reversed   
	//linked list  
		LinkedListNode head1 = null;

		while (stk.empty() == false) {
			if (head == null) {
			//creating the first node of  
			//the reversed linked list  
				head1 = new LinkedListNode(stk.peek());
				head = head1;
				stk.pop();
			} else {
//creating the remaining nodes of the reversed   
//linked list  
				head.next = new LinkedListNode(stk.peek());
				stk.pop();
				head = head.next;
			}

		}

//returning the first node   
//of the reversed linked list  
		return head1;
	}

	/* Method to display the linked list */
	public void printList(LinkedListNode h) {
		LinkedListNode t = h;
		while (t != null) {
			System.out.print(t.val + " ");

//moving to the next node  
			t = t.next;
		}

		System.out.println();
	}

//main method  
	public static void main(String argvs[]) {
//creating an object of the class LinkedListStack  
		LinkedListStack listObj = new LinkedListStack();

//4 -> NULL  
		listObj.head = new LinkedListNode(4);

//4 -> 6 -> NULL  
		listObj.head.next = new LinkedListNode(6);

//4 -> 6 -> 7 -> NULL  
		listObj.head.next.next = new LinkedListNode(7);

//4 -> 6 -> 7 -> 1-> NULL  
		listObj.head.next.next.next = new LinkedListNode(1);

//4 -> 6 -> 7 -> 1-> 5 -> NULL  
		listObj.head.next.next.next.next = new LinkedListNode(5);

//4 -> 6 -> 7 -> 1-> 5 -> 8 -> NULL  
		listObj.head.next.next.next.next.next = new LinkedListNode(8);

//4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> NULL  
		listObj.head.next.next.next.next.next.next = new LinkedListNode(3);

//4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> 2 -> NULL  
		listObj.head.next.next.next.next.next.next.next = new LinkedListNode(2);

//creating an object of the class Stack  
//the created stack will be empty  
		Stack<Integer> stk = new Stack<>();

		System.out.println("The Linked list before reversal is: ");
		listObj.printList(head);

		head = listObj.reverseList(head, stk);
		System.out.println(" ");
		System.out.println("After reversal, the linked list is: ");
		listObj.printList(head);

	}
}
