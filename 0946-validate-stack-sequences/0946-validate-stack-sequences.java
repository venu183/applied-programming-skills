import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();

        int j = 0; // pointer for popped

        for (int value : pushed) {

            // Push the current value
            stack.push(value);

            // Keep popping while top matches popped[j]
            while (!stack.isEmpty() &&
                   j < popped.length &&
                   stack.peek() == popped[j]) {

                stack.pop();
                j++;
            }
        }

        // All elements must have been popped
        return stack.isEmpty();
    }
}