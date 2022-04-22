
// @Title: 链表相交 (Intersection of Two Linked Lists LCCI)
// @Author: 2692203539@qq.com
// @Date: 2022-04-22 15:10:48
// @Runtime: 1 ms
// @Memory: 44.6 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA=headA,curB=headB;
        int longA=0,longB=0;
        while(curA!=null){
            longA+=1;
            curA=curA.next;
        }
        while(curB!=null){
            longB+=1;
            curB=curB.next;
        }
        curA=headA;
        curB=headB;
        if(longA>=longB){
            int de=longA-longB;
            while(de!=0){
                curA=curA.next;
                de--;
            }
            
        }else{
            int de = longB-longA;
            while(de!=0){
                curB=curB.next;
                de--;
            }
        }

        while(curA!=null&&curB!=null){
            if(curA==curB)return curA;
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
