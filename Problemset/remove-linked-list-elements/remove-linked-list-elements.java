
// @Title: 移除链表元素 (Remove Linked List Elements)
// @Author: 2692203539@qq.com
// @Date: 2022-03-17 20:38:32
// @Runtime: 0 ms
// @Memory: 42.3 MB

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp =head,result=head;
        
        if(head==null)return null;
        if(head.val==val){
           return removeElements(head.next,val);
        }else{
            ListNode pre = head;
        ListNode cur = head.next;
            while (cur != null) {
        if (cur.val == val) {
            pre.next = cur.next;
        } else {
            pre = cur;
        }
        cur = cur.next;
    }

        }
        return result;
    }
    
}
