
// @Title: 两两交换链表中的节点 (Swap Nodes in Pairs)
// @Author: 2692203539@qq.com
// @Date: 2022-03-22 21:05:44
// @Runtime: 0 ms
// @Memory: 38.7 MB

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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode pre = head;
        ListNode next = pre.next;
        pre.next = swapPairs(next.next);
        next.next = pre;
        return  next;
    }
}

