
// @Title: 反转链表 (Reverse Linked List)
// @Author: 2692203539@qq.com
// @Date: 2022-03-22 18:58:22
// @Runtime: 0 ms
// @Memory: 40.8 MB

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
    public ListNode reverseList(ListNode head) {
        ListNode cur =head;
        ListNode cur1 ;
        ListNode pre = null;
        while (cur!=null){
            cur1 = cur.next;
            cur.next=pre;
            pre = cur;
            cur = cur1;
        }
        return  pre;
    }
}

