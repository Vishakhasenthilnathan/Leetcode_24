class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();
        int ans = 0;
        stack.push(-1);
        if(s.length()<=1) return 0;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()) stack.pop();
                if(!stack.isEmpty()){
                    ans = Math.max(ans, i-stack.peek());
                } 
                else{
                    stack.push(i);
                }
            }
        }
        return ans;
    }
}