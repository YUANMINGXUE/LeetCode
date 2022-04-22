
// @Title: 删除链表的倒数第 N 个结点 (Remove Nth Node From End of List)
// @Author: 2692203539@qq.com
// @Date: 2022-03-30 17:52:16
// @Runtime: 0 ms
// @Memory: 39.6 MB

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode vhead = new ListNode();
            vhead.next=head;
            ListNode fast=vhead;
            ListNode slow = vhead;

            for(int i=0;i<=n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
    
            slow.next=slow.next.next;
            return vhead.next;
    }
}
