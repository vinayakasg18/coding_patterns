package oas.amazon;

import leet_code.DS.LinkedList;
import leet_code.DS.ListNode;

public class MaxPagesRead {

    ListNode head;

    public MaxPagesRead(ListNode head){
        this.head = head;
    }

    public int maxSum(ListNode list){
        LinkedList lst = new LinkedList(head);
        int counter = 0;
        int total_sum = 0;
        ListNode temp;

        for (temp = head; temp.next != null; temp = temp.next)
            counter++;
        counter += 1;

        while (counter > 0){
            int sum = 0;
            int firstValue = lst.pollFirst();
            int lastValue = lst.pollLast();
            sum = firstValue + lastValue;
            total_sum = Math.max(sum, total_sum);
            counter -= 2;
        }
        return total_sum;
    }

    public static void main(String[] args) {
        ListNode head;

        head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);

        LinkedList lst = new LinkedList(head);
        lst.printList();

        MaxPagesRead ma = new MaxPagesRead(head);
        System.out.println(ma.maxSum(head));
    }
}
