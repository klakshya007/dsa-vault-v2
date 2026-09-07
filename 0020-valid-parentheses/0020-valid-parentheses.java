class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char check=s.charAt(i);
            if(check=='[' || check=='('||check=='{')stack.push(check);
            else if (stack.isEmpty())return false;
            else if ((check==']' && stack.peek()=='[') || (check==')'&& stack.peek()=='(')||(check=='}'&& stack.peek()=='{'))
            stack.pop();
            else return false;
        }
        if(stack.isEmpty())return true;
        return false;
    }
}