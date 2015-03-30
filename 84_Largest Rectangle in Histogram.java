public class Solution {
    public int largestRectangleArea(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int maxArea = 0;
        
        for(int i=0; i<height.length; i++) {
            //when encounter the right-side bottleneck, calculate the maximum area of the current index (stack.peek() after stack.pop() is the left-side bottleneck)
            while(!stack.isEmpty() && height[i]<=height[stack.peek()]) {
                int index = stack.pop();
                //maxArea = Math.max(maxArea, (i-index)*height[index]);
                
                int curArea = stack.isEmpty()?i*height[index]:(i-stack.peek()-1)*height[index];  
                maxArea = Math.max(maxArea,curArea); 
            }
            
            stack.push(i);
            
        }
        
        while(!stack.isEmpty()) {
            int index = stack.pop();
            
            //maxArea = Math.max(maxArea, stack.isEmpty()? height.length*height[index]:(index-stack.peek())*height[index]);
            int curArea = stack.isEmpty()?height.length*height[index]:(height.length-stack.peek()-1)*height[index];  
            maxArea = Math.max(maxArea,curArea); 
            
            
            
        }
        
        return maxArea;
        
        
    }
}