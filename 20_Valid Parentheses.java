public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('{', '}');
                put('[', ']');
                put('(', ')');
            }
        };
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                stack.push(s.charAt(i));
                
            else {
                
                if(stack.isEmpty()) return false;
                else {
                    if (map.get(stack.pop()) != s.charAt(i) )
                        return false;
                }
                
            }
            
        }
        
        return stack.isEmpty();
        
        
        
        
    }
}