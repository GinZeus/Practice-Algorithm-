/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day12.SwapPair;

/**
 *
 * @author datng
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans =new ListNode(0);
        ans.next=head;
        ListNode curr = ans;

        while(curr.next != null && curr.next.next != null){
            ListNode firstNode = curr.next;
            ListNode secondNode = curr.next.next;
            
            curr.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            curr = curr.next.next;
        }
        return ans.next;
    }
}
