
// @Title: 两数相加 (Add Two Numbers)
// @Author: 2692203539@qq.com
// @Date: 2022-03-08 16:55:57
// @Runtime: 1 ms
// @Memory: 41 MB

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        int temp = 0;
         while(l1!=null||l2!=null||temp!=0){
           int val1 = l1!=null ? l1.val : 0;
           int val2 = l2 !=null ? l2.val : 0;
           ListNode sum = new ListNode((val1+val2+temp)%10);
           temp = (val1+val2+temp)/10;
           l3.next = sum;
           l3 =  sum;
           if (l1!=null){
                l1 = l1.next;
           }
          if(l2!=null){
            l2 = l2.next;
          }
           
         }
        
         return l4.next;
    }
}
