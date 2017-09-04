package g23.Algorithms.ReverseSLL;

public class Main {

	public static void main(String[] args) {
		int n = 10;
        if(args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
        for(int i=1; i<=n; i++) {
            lst.add(new Integer(i));
        }
        lst.printList();
        
        ReverseSinglyLinkedList.reverse(lst);
        lst.printList();
        ReverseSinglyLinkedList.recursiveReverse(lst);;
        lst.printList();

	}

}
