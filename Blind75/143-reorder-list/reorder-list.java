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
    public void reorderList(ListNode head) {
        //middle
        ListNode h1 = head;
        ListNode head2 = middle(head);
        //reverse
        ListNode h2 = reverse(head2);
        //merge
        merge(h1,h2);
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;
        slow.next = null;
        return head2;
    }

    public ListNode reverse(ListNode head2){
        ListNode mid = null;
        ListNode trail = null;
        ListNode curr = head2;
        while(curr!=null){
            trail = mid;
            mid = curr;
            curr = curr.next;
            mid.next = trail;
        }
        return mid;
    }

    public ListNode merge(ListNode h1, ListNode h2){
        ListNode c1 = h1;
        ListNode c2 = h2;
        ListNode f1 = null;
        ListNode f2 = null;
        while(c1!=null && c2!=null){
            f1 = c1.next;
            f2 = c2.next;

            c1.next = c2;
            c2.next = f1;

            c1 = f1;
            c2 = f2;
        }
        return h1;
    }
}