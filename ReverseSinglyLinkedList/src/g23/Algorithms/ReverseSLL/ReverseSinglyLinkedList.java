package g23.Algorithms.ReverseSLL;

public class ReverseSinglyLinkedList {

    //Implementing the reverse of singly linked list non recursively
	public static void reverse(SinglyLinkedList SLL){
		if(SLL.head.next == null){
			return ;
		}
		SinglyLinkedList.Entry<Integer> prev = null;
		SinglyLinkedList.Entry<Integer> current = SLL.head.next;
		SinglyLinkedList.Entry<Integer> next = null;
		SLL.tail = current;
		while(current!= null){	
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;	
		}
		SLL.head.next = prev;
	}
	
	public static void recursiveRev(SinglyLinkedList.Entry<Integer> current, SinglyLinkedList.Entry<Integer> prev){
		if(current == null){
			return;
		}
		SinglyLinkedList.Entry<Integer> next = current.next;
		current.next = prev;
		recursiveRev(next,current);
	}
 
	
	public static void recursiveReverse(SinglyLinkedList SLL){
		if(SLL.head.next == null){
			return;
		}
		SinglyLinkedList.Entry<Integer> temp= SLL.head.next;
		recursiveRev(SLL.head.next,null);
		SLL.head.next = SLL.tail;
		SLL.tail = temp;
		
	}
		
}
