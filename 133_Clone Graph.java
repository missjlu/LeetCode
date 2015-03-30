/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode graph) {
        if(graph == null) return graph;
        UndirectedGraphNode graphCopy = new UndirectedGraphNode(graph.label);
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        map.put(graph,graphCopy);
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(graph);
        while(!queue.isEmpty()){
            UndirectedGraphNode node = queue.poll();
            for(UndirectedGraphNode neighbor : node.neighbors) {
                if(map.containsKey(neighbor)){
                    map.get(node).neighbors.add(map.get(neighbor));
                }
                else {
                    UndirectedGraphNode neighborCopy = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor,neighborCopy);
                    queue.add(neighbor);
                    map.get(node).neighbors.add(neighborCopy);
                }
                
            }
            
            
            
            
        }
        return graphCopy;
         
        
    }
}