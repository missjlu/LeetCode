public class Solution {
    
    
        private static final Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                if (x.equals(y)) return 0;            
                return -(x+y).compareTo(y+x);
            }
        };

        public String largestNumber(int[] num) {
            
            PriorityQueue<String> queue = new PriorityQueue<>(num.length, stringComparator);

            for (int i = 0; i < num.length; i++) {
                queue.add(String.valueOf(num[i]));
            }

            StringBuilder bf = new StringBuilder();
            while (!queue.isEmpty()) {
                bf.append(queue.poll());
            }
            
            //only if the array is a list of 0 will the first char be 0
            return bf.charAt(0) == '0' ? "0":bf.toString();
        }
}