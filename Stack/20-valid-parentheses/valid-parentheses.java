class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i==0 && isClosingBracket(c))
                return false;

            if(!isClosingBracket(c)){
                stack.push(c);
            }
            else{
               if(!stack.isEmpty() && isValid(stack.peek(),c))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isClosingBracket(Character c){
        return c==')' || c=='}' || c==']';
    }

    private boolean isValid(Character opening, Character closing){
        switch(opening){
            case '(':
                return closing == ')';
            case '[':
                return closing == ']';
            case '{':
                return closing == '}';
            default:
                return false;
        }
    }
}