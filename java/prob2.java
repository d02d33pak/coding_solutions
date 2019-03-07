/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//FIRST ATTEMPT SOLUTION 
//DOES NOT WORK FOR [0] [0] AS I AM DOING SUM CHECK FOR 0
//ALSO MY FIRST TIME ACTUALLY USING RECURSION IN ANY SOLUTION
class Solution {
    
    public ListNode crtList(int sum) {
        ListNode ans;
        ListNode head = null;
            if (sum != 0) {
                ans = new ListNode(sum%10);
                if (head == null) 
                    head = ans;
                sum = sum / 10;
                ans.next = crtList(sum);
            }
        return head;
        }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current;
        int place;
        int firstNum = 0;
        int secondNum = 0;
        current = l1;
        place = 1;
        while(current != null) {
            firstNum += current.val * place;
            place *= 10;
            current = current.next;
        }
        current = l2;
        place = 1;
        while(current != null) {
            secondNum += current.val * place;
            place *= 10;
            current = current.next;
        }
        int sum = firstNum + secondNum;
        ListNode ans = crtList(sum);
        return ans;
    }
   
}
