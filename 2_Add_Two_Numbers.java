// Runtime: 3ms
// Memory Usage: 42MB

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = generateNode(l1, l2, 0);
        return answer;
    }
    
    public ListNode generateNode(ListNode l1, ListNode l2, int carry) {
        if (l1.next == null && l2.next == null) {
            if (l1.equals(null)) return new ListNode(l2.val);
            else if (l2.equals(null)) return new ListNode(l1.val);
            else {
                int sum = l1.val + l2.val + carry;
                if (sum >= 10) {
                    ListNode carriedOne = new ListNode(1);
                    return new ListNode(sum % 10, carriedOne); 
                }
                else return new ListNode(sum);
            }
        }
        
        ListNode current = new ListNode();
        int value = l1.val + l2.val + carry;
        carry = 0;
        if (value >= 10) {
            value = value % 10;
            carry = 1;
        }
        if (l1.next == null) {l1.next = new ListNode(0);}
        if (l2.next == null) {l2.next = new ListNode(0);}
        current.next = generateNode(l1.next, l2.next, carry);
        current.val = value;
        return current;
    }
}
