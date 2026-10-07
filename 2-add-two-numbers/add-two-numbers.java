
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to make creating the result easier
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add digit from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add digit from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Current digit
            int digit = sum % 10;

            // Carry for next position
            carry = sum / 10;

            // Create new node
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next;
    }
}
        
    