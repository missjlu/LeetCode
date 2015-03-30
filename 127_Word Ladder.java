public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        
        if(start==null || end==null || start.length()==0 || end.length()==0 || start.length()!=end.length())  
            return 0;  
        Queue<String> queue = new LinkedList<String>();  
        Set<String> visited = new HashSet<String>();  
        int level= 1;  
        int lastNum = 1;  
        int currNum = 0;  
        queue.offer(start);  
        visited.add(start); 
        
        while(!queue.isEmpty()) {
            
            String curr = queue.poll();
            lastNum--;
            
            for(int i=0; i<curr.length(); i++) {
            
                char[] startArr = curr.toCharArray();
            
                for(char j='a'; j<='z'; j++) {
                
                
                    startArr[i] = j;
                
                    String temp = new String(startArr);
                
                    if(temp.equals(end)) {
                        return level+1;
                    }
                    if(dict.contains(temp) && !visited.contains(temp)) {
                        queue.add(temp);
                        visited.add(temp);
                        currNum++;
                    }
                }
            }
            
            if(lastNum == 0) {
                lastNum = currNum;
                currNum = 0;
                level++;
            }
        }
    
        return 0;
        
    }
    
    
    
}