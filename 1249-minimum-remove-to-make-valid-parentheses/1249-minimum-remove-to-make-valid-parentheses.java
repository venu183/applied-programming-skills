class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder result = new StringBuilder();
        int balance = 0;

        // First pass
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                balance++;
                result.append(ch);
            }

            else if (ch == ')') {
                if (balance > 0) {
                    balance--;
                    result.append(ch);
                }
                // Otherwise, skip this ')'
            }

            else {
                // Lowercase character
                result.append(ch);
            }
        }

        // Remove extra '(' from right to left
        for (int i = result.length() - 1; i >= 0 && balance > 0; i--) {
            if (result.charAt(i) == '(') {
                result.deleteCharAt(i);
                balance--;
            }
        }

        return result.toString();
    }
}