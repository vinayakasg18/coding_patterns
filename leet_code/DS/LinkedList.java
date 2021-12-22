package leet_code.DS;

public class LinkedList {
    ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public void addFirst(int value) {
        ListNode temp = head;
        head = new ListNode(value);
        head.next = temp;
    }

    public void addLast(int value) {
        ListNode temp;
        for (temp = head; temp.next != null; temp = temp.next)
            ;
        temp.next = new ListNode(value);
    }

    public int peekFirst() {
        return head.value;
    }

    public int peekLast() {
        ListNode temp;
        for (temp = head; temp.next != null; temp = temp.next)
            ;
        return temp.value;
    }

    public int pollFirst() {
        int first_elem = head.value;
        head = head.next;
        return first_elem;
    }

    public int pollLast() {
        ListNode temp = head;
        int lastNode = 0;
        if (temp == null){
            return 0;
        }
        if (temp.next == null){
            lastNode = temp.value;
            temp = null;
        }
        else{
            for (temp = head; temp.next.next != null; temp = temp.next);
            lastNode = temp.next.value;
            temp.next = null;
        }
        return lastNode;
    }

    boolean removeFirstOccurance(int val) {
        ListNode temp;
        for (temp = head; temp.next != null; temp = temp.next) {
            if (temp.next.value == val) {
                temp.next = temp.next.next;
                return true;
            }
        }
        return false;
    }

    boolean removeLastOccurance(int val) {
        int counter = 0;
        int counter_1 = 0;
        ListNode temp;
        ListNode tmp;

        // This will take a count of occurance of a given value
        for (temp = head; temp != null; temp = temp.next) {
            if (temp.value == val)
                counter++;
        }

        // We will check for the value at (count - 1) node to remove from the Linked List (This will remove the last occurance of the number)
        for (tmp = head; tmp.next != null; tmp = tmp.next) {
            if (tmp.value == val) {
                counter_1++;
            }
            if (tmp.next.value == val && counter_1 == counter - 1) {
                tmp.next = tmp.next.next;
                return true;
            }
        }
        return false;
    }

    public boolean contains(int value){
        ListNode temp;
        for (temp = head; temp.next != null; temp = temp.next){
            if (temp.value == value)
                return true;
        }
        return false;
    }

    public void printList() {
        ListNode temp;
        for (temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.value + "-> ");
        }
        System.out.println("null");
    }

    public void reverse(){
        ListNode cur = head;
        ListNode next = null;
        ListNode prev = null;

        // 1 -> 2 -> 3 -> 4->null

        while (cur != null){ // 1
            next = cur.next; // 2, 3, 4, null
            cur.next = prev; // 3 -> 2 -> 1 -> null
            prev = cur; // 1, 2, 3, 4
            cur = next; // 2, 3, 4, null
        }
        // 3 -> 2 -> 1 -> null
        // 4 -> 3 -> 2 -> 1 -> null
        head = prev;
    }

    public static void main(String[] args) {
        // Create a Linked List
        ListNode head;

        head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(6);
        head.next.next.next = null;

        LinkedList list = new LinkedList(head);
        System.out.println(list);
        list.addFirst(3);
        list.addLast(2);
        list.addFirst(1);

        System.out.println("First Linked List");
        list.printList();

        // list.pollFirst();
        // list.pollLast();

        // System.out.println("Second Linked List");
        // list.printList();

        // list.pollLast();

        // list.removeFirstOccurance(3);

        // list.removeLastOccurance(10);
        // System.out.println(list.contains(10));
        list.reverse();
        System.out.println("Reversed LL");
        list.printList();
    }
}
