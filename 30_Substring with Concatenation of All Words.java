public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        ArrayList<Integer> res = new ArrayList<Integer>();  
    if(S==null || S.length()==0 || L==null || L.length==0)  
        return res; 
    //contains all the value in L[]
    HashMap<String,Integer> map = new HashMap<String,Integer>();  
    for(int i=0;i<L.length;i++)  
    {  
        if(map.containsKey(L[i]))  
        {  
            map.put(L[i],map.get(L[i])+1);  
        }  
        else  
        {  
            map.put(L[i],1);  
        }  
    }  
    
    //i<L[0].length, the combination afterwards already been checked in inner loop
    for(int i=0;i<L[0].length();i++)  
    {  
        HashMap<String,Integer> curMap = new HashMap<String,Integer>();  
        int count = 0;  
        int left = i;
        
        
        //left is the start of legal substring(walker), j is the runner needs to move forward
        for(int j=i;j<=S.length()-L[0].length();j+=L[0].length())  
        {  
            String str = S.substring(j,j+L[0].length());  
              
            
            
            if(map.containsKey(str))  
            {  
                if(curMap.containsKey(str))  
                    curMap.put(str,curMap.get(str)+1);  
                else  
                    curMap.put(str,1);  
                if(curMap.get(str)<=map.get(str))  
                    count++;  
                else  
                {  
                    while(curMap.get(str)>map.get(str))  
                    {  
                        //need to move left forward
                        String temp = S.substring(left,left+L[0].length());  
                        if(curMap.containsKey(temp))  
                        {  
                            curMap.put(temp,curMap.get(temp)-1); 
                            //if remove a valid string, need to delete the count
                            if(curMap.get(temp)<map.get(temp))  
                                count--;  
                        }  
                        left += L[0].length();  
                    }  
                } 
                
                
                
                if(count == L.length)  
                {  
                    res.add(left);  
                    //start to check from the next L[0].length,(e.g. S:barbarbar, L: bar,bar; then output 0,2)  
                    String temp = S.substring(left,left+L[0].length()); 
                    //need to reduce count because definitely moved one element needed for a valid string
                    if(curMap.containsKey(temp))  
                        curMap.put(temp,curMap.get(temp)-1);  
                    count--;  
                    left += L[0].length();  
                }  
            } 
            
            
            
            else  
            {  
                curMap.clear();  
                count = 0;  
                left = j+L[0].length();  
            } 
            
            
            
        }  
    }  
    
    
    
    
    
    return res;  
    }
}