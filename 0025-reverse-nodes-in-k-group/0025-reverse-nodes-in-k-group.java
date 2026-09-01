class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        // Check if there are at least k nodes
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Less than k nodes, leave them unchanged
        if (count < k)
            return head;

        // Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Recursively reverse remaining groups
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna