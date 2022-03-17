class Solution {
    public int scoreOfParentheses(String s) {
         int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {

            char curr = s.charAt(i);
            if (curr == '('){
                stack.push(count);
                count = 0;
            }
            else {
               count = stack.pop() + Math.max(2*count,1);
            }
        }

        return count;
    }
}