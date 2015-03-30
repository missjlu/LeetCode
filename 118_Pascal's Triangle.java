public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(numRows>0){
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            list.add(firstRow);
            for(int i=1; i<numRows; i++){
                List<Integer> intlist = new ArrayList<>();
                intlist.add(1);
                for(int j=1; j<=i-1; j++){
                    intlist.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
                intlist.add(1);
                list.add(intlist);
            }
        }
        return list;
    }
}