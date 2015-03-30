public class Solution {
    public List<String> anagrams(String[] strs) {
        
        List<String> res = new ArrayList<String>();  
        if(strs == null || strs.length == 0)  
            return res;  
        Map<String, List<String>> map = new HashMap<>();  
        
        for(int i=0;i<strs.length;i++) {
            //do not change the str, make a new char array and sort it
            char[] charArr = strs[i].toCharArray();  
            Arrays.sort(charArr);  
            String str = new String(charArr); 
            
            
        if(map.containsKey(str)) {  
            map.get(str).add(strs[i]);  
        }  
        else  
        {  
            List<String> list = new ArrayList<String>();  
            list.add(strs[i]);  
            map.put(str,list);  
        }  
    }  
    
    Iterator iter = map.values().iterator();  
    while(iter.hasNext())  
    {  
        //cast object to arraylist
        List<String> item = (ArrayList<String>)iter.next();  
        if(item.size()>1)  
            res.addAll(item);  
    }  
    return res;  
        
        
    }
}