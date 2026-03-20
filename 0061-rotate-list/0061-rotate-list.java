/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
                if(head == null || head.next == null) return head;

        int n = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            n++;
        }

        k = k % n;
        if(k == 0) return head;

        temp = head;
        for(int i = 0; i < n - k - 1; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;

        ListNode tail = newHead;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return newHead;

    }
}